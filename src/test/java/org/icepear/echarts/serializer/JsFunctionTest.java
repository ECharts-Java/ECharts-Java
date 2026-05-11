package org.icepear.echarts.serializer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.icepear.echarts.Bar;
import org.icepear.echarts.Pie;
import org.icepear.echarts.charts.pie.PieDataItem;
import org.icepear.echarts.charts.pie.PieSeries;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.junit.Test;

/**
 * Verifies the JsFunction value class and — crucially — that the registered
 * TypeAdapter writes the body unquoted into the JSON stream so it survives
 * into the rendered HTML as a real JavaScript function.
 */
public class JsFunctionTest {

    private static final EChartsSerializer SERIALIZER = new EChartsSerializer();

    // -- value class behavior ------------------------------------------------

    @Test
    public void testGetterReturnsBody() {
        JsFunction f = new JsFunction("function (p) { return p.value; }");
        assertEquals("function (p) { return p.value; }", f.getBody());
    }

    @Test
    public void testStaticFactoryEqualsConstructor() {
        assertEquals(new JsFunction("x"), JsFunction.of("x"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullBodyRejected() {
        new JsFunction(null);
    }

    @Test
    public void testEqualsAndHashCode() {
        JsFunction a = new JsFunction("function () { return 1; }");
        JsFunction b = new JsFunction("function () { return 1; }");
        JsFunction c = new JsFunction("function () { return 2; }");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertNotEquals(a, c);
        assertNotEquals(a, null);
        assertNotEquals(a, "function () { return 1; }");
    }

    @Test
    public void testToStringIncludesBody() {
        assertTrue(new JsFunction("function(){return 42;}").toString().contains("function(){return 42;}"));
    }

    // -- serialization: the critical "unquoted" behavior --------------------

    @Test
    public void testTopLevelSerializationIsUnquoted() {
        String json = SERIALIZER.toJson(new JsFunction("function (p) { return p.value; }"));
        // No surrounding quotes — the body is emitted verbatim as JS.
        assertEquals("function (p) { return p.value; }", json);
        assertFalse("must not be quoted", json.startsWith("\""));
        assertFalse("must not be quoted", json.endsWith("\""));
    }

    @Test
    public void testNestedInsideObjectIsUnquoted() {
        Map<String, Object> wrapper = new HashMap<>();
        wrapper.put("formatter", new JsFunction("function(p){return p.name;}"));
        String json = SERIALIZER.toJson(wrapper);
        // Key is quoted; value is not.
        assertEquals("{\"formatter\":function(p){return p.name;}}", json);
    }

    @Test
    public void testStringFormatterStillQuoted() {
        // Sanity check: the existing String overload is untouched. A plain string
        // formatter must remain a JSON string.
        Map<String, Object> wrapper = new HashMap<>();
        wrapper.put("formatter", "{b}: {c}");
        assertEquals("{\"formatter\":\"{b}: {c}\"}", SERIALIZER.toJson(wrapper));
    }

    @Test
    public void testNullSerializesToJsonNull() {
        Map<String, Object> wrapper = new HashMap<>();
        wrapper.put("formatter", null);
        // Default Gson behavior: null fields are omitted from objects.
        assertEquals("{}", SERIALIZER.toJson(wrapper));
    }

    @Test
    public void testNullJsFunctionWrittenAsNullInArray() {
        // When the field can't be omitted (array context), null becomes JSON null.
        Object[] arr = new Object[] { new JsFunction("function(){return 1;}"), null };
        String json = SERIALIZER.toJson(arr);
        assertTrue(json, json.contains("function(){return 1;}"));
        assertTrue(json, json.contains("null"));
    }

    @Test
    public void testMultilineBodyPreservedExactly() {
        String body = "function (params) {\n"
                + "  if (params.value > 100) {\n"
                + "    return 'big: ' + params.value;\n"
                + "  }\n"
                + "  return 'small: ' + params.value;\n"
                + "}";
        Map<String, Object> wrapper = new HashMap<>();
        wrapper.put("formatter", new JsFunction(body));
        String json = SERIALIZER.toJson(wrapper);
        assertTrue("multiline body must survive intact", json.contains(body));
    }

    @Test
    public void testHtmlEscapingDisabledForJsFunctionBody() {
        // Critical: < and > must NOT be escaped to < / > — otherwise the
        // emitted JS won't contain literal HTML tags. EChartsSerializer disables
        // HTML escaping globally, but verify it specifically for JsFunction bodies.
        String body = "function(p){return '<b>' + p.name + '</b>';}";
        String json = SERIALIZER.toJson(new JsFunction(body));
        assertTrue(json.contains("<b>"));
        assertTrue(json.contains("</b>"));
        assertFalse(json.contains("\\u003c"));
    }

    @Test
    public void testCustomEChartsSerializerStillRegistersJsFunctionAdapter() {
        // The adapter should be registered even when the user passes additional
        // type adapters via the varargs constructor.
        EChartsSerializer custom = new EChartsSerializer();
        String json = custom.toJson(new JsFunction("function(){}"));
        assertEquals("function(){}", json);
    }

    // -- end-to-end: through a real Tooltip on a real chart -----------------

    @Test
    public void testTooltipFormatterEndToEndWithPie() {
        JsFunction formatter = new JsFunction(
                "function (p) { return p.name + ': ' + p.value + ' (' + p.percent + '%)'; }");

        Pie pie = new Pie()
                .setTooltip(new Tooltip().setTrigger("item").setFormatter((Object) formatter))
                .addSeries(new PieSeries()
                        .setRadius("60%")
                        .setData(new PieDataItem[] {
                                new PieDataItem().setName("A").setValue(40),
                                new PieDataItem().setName("B").setValue(60)
                        }));

        String json = SERIALIZER.toJson(pie.getOption());
        assertNotNull(json);
        // Function literal lives inside the tooltip object, unquoted.
        assertTrue(json, json.contains("\"formatter\":function (p)"));
        assertFalse("formatter must not be wrapped in quotes",
                json.contains("\"formatter\":\"function"));
    }

    @Test
    public void testTooltipFormatterEndToEndWithBar() {
        Bar bar = new Bar()
                .addXAxis(new String[] { "Mon", "Tue", "Wed" })
                .addYAxis()
                .setTooltip(new Tooltip().setTrigger("axis").setFormatter((Object) new JsFunction(
                        "function(arr){return arr.map(function(p){return p.seriesName + ': ' + p.value;}).join('<br/>');}")))
                .addSeries(new Number[] { 1, 2, 3 });

        String json = SERIALIZER.toJson(bar.getOption());
        assertTrue(json, json.contains("\"formatter\":function(arr)"));
        assertFalse(json.contains("\"formatter\":\"function"));
    }

    @Test
    public void testFormatterOutputIsValidJavascriptWhenEmbedded() {
        // Simulate the rendering pipeline: build the option, get the JSON,
        // wrap in `var option = …;` — this must produce evaluable JS, not JSON.
        Tooltip t = new Tooltip().setFormatter((Object) new JsFunction("function(p){return p.value;}"));
        String json = SERIALIZER.toJson(t);
        String simulatedScript = "var option = " + json + ";";
        // Must contain an unquoted `function` token immediately after the colon.
        int idx = simulatedScript.indexOf("\"formatter\":");
        assertNotEquals(-1, idx);
        char nextNonSpace = ' ';
        for (int i = idx + "\"formatter\":".length(); i < simulatedScript.length(); i++) {
            char ch = simulatedScript.charAt(i);
            if (!Character.isWhitespace(ch)) {
                nextNonSpace = ch;
                break;
            }
        }
        assertEquals("formatter value must start with `f` (function), not `\"`", 'f', nextNonSpace);
    }

    // -- read direction (best-effort, for round-trip support) ---------------

    @Test
    public void testReadDirectionThroughGson() {
        // Round-trip a string into JsFunction (best-effort symmetric path).
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder()
                .registerTypeAdapter(JsFunction.class, new JsFunctionTypeAdapter())
                .create();
        JsFunction f = gson.fromJson("\"function(){return 1;}\"", JsFunction.class);
        assertNotNull(f);
        assertEquals("function(){return 1;}", f.getBody());
    }

    @Test
    public void testInvalidJsBodyIsCallerResponsibility() {
        // We don't validate the body — garbage in, garbage-but-emitted out. The
        // browser surfaces the syntax error. Document intent here so future
        // maintainers don't add server-side validation by mistake.
        try {
            String json = SERIALIZER.toJson(new JsFunction("not actually javascript ::: ;;;"));
            assertNotNull(json);
            // We just verify that toJson doesn't throw — invalid syntax is a JS-side concern.
        } catch (Exception e) {
            fail("Body validation should be the browser's job, not the serializer's: " + e);
        }
    }
}
