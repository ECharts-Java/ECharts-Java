package org.icepear.echarts.charts.effectScatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.icepear.echarts.EffectScatter;
import org.icepear.echarts.Option;
import org.icepear.echarts.components.series.SeriesLabel;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * Direct unit tests for EffectScatter — exercises every public setter and
 * verifies the JSON shape, beyond the snapshot in BasicEffectScatterTest.
 */
public class EffectScatterSeriesTest {

    private static final EChartsSerializer SERIALIZER = new EChartsSerializer();

    @Test
    public void testDefaultTypeIsEffectScatter() {
        assertEquals("effectScatter", new EffectScatterSeries().getType());
    }

    @Test
    public void testEffectScatterFactoryProducesCorrectSeries() {
        EffectScatter chart = new EffectScatter()
                .addXAxis().addYAxis()
                .addSeries(new Number[][] { { 1, 2 }, { 3, 4 } });
        Option option = chart.getOption();
        JsonElement json = SERIALIZER.toJsonTree(option);
        JsonObject series = json.getAsJsonObject().get("series").getAsJsonArray()
                .get(0).getAsJsonObject();
        assertEquals("effectScatter", series.get("type").getAsString());
    }

    @Test
    public void testRippleEffectAllFields() {
        RippleEffect ripple = new RippleEffect()
                .setColor("#abc")
                .setNumber(5)
                .setPeriod(3)
                .setScale(2.5)
                .setBrushType("fill");
        JsonObject json = SERIALIZER.toJsonTree(ripple).getAsJsonObject();
        assertEquals("#abc", json.get("color").getAsString());
        assertEquals(5, json.get("number").getAsInt());
        assertEquals(3, json.get("period").getAsInt());
        assertEquals(2.5, json.get("scale").getAsDouble(), 0.0);
        assertEquals("fill", json.get("brushType").getAsString());
    }

    @Test
    public void testRippleEffectOnSeriesNestsCorrectly() {
        EffectScatterSeries series = new EffectScatterSeries()
                .setRippleEffect(new RippleEffect().setScale(3).setBrushType("stroke"));
        JsonObject json = SERIALIZER.toJsonTree(series).getAsJsonObject();
        JsonObject ripple = json.get("rippleEffect").getAsJsonObject();
        assertEquals(3, ripple.get("scale").getAsInt());
        assertEquals("stroke", ripple.get("brushType").getAsString());
    }

    @Test
    public void testShowEffectOnAcceptsBothValues() {
        assertEquals("render", new EffectScatterSeries().setShowEffectOn("render").getShowEffectOn());
        assertEquals("emphasis", new EffectScatterSeries().setShowEffectOn("emphasis").getShowEffectOn());
    }

    @Test
    public void testEffectTypeField() {
        EffectScatterSeries s = new EffectScatterSeries().setEffectType("ripple");
        JsonObject json = SERIALIZER.toJsonTree(s).getAsJsonObject();
        assertEquals("ripple", json.get("effectType").getAsString());
    }

    @Test
    public void testSymbolSizeNumberAndArrayOverloads() {
        EffectScatterSeries scalar = new EffectScatterSeries().setSymbolSize(20);
        EffectScatterSeries vector = new EffectScatterSeries().setSymbolSize(new Number[] { 10, 20 });
        assertEquals(20, ((Number) scalar.getSymbolSize()).intValue());
        assertNotNull(vector.getSymbolSize());
        assertTrue(vector.getSymbolSize() instanceof Number[]);
    }

    @Test
    public void testSymbolOffsetAllOverloads() {
        EffectScatterSeries n = new EffectScatterSeries().setSymbolOffset(5);
        EffectScatterSeries na = new EffectScatterSeries().setSymbolOffset(new Number[] { 1, 2 });
        EffectScatterSeries s = new EffectScatterSeries().setSymbolOffset("50%");
        EffectScatterSeries sa = new EffectScatterSeries().setSymbolOffset(new String[] { "50%", "0%" });
        assertNotNull(n.getSymbolOffset());
        assertNotNull(na.getSymbolOffset());
        assertNotNull(s.getSymbolOffset());
        assertNotNull(sa.getSymbolOffset());
    }

    @Test
    public void testDataOverloads() {
        EffectScatterSeries flat = new EffectScatterSeries().setData(new Number[] { 1, 2, 3 });
        EffectScatterSeries pairs = new EffectScatterSeries().setData(new Number[][] { { 1, 2 }, { 3, 4 } });
        EffectScatterSeries items = new EffectScatterSeries().setData(new EffectScatterDataItem[] {
                new EffectScatterDataItem().setName("p1").setValue(new Number[] { 1, 2 })
        });
        assertNotNull(flat.getData());
        assertNotNull(pairs.getData());
        assertNotNull(items.getData());
    }

    @Test
    public void testDataItemSerialization() {
        EffectScatterDataItem item = new EffectScatterDataItem()
                .setName("hotspot-1")
                .setValue(new Number[] { 10, 20 })
                .setSymbolSize(30)
                .setSelected(true);
        JsonObject json = SERIALIZER.toJsonTree(item).getAsJsonObject();
        assertEquals("hotspot-1", json.get("name").getAsString());
        assertEquals(30, json.get("symbolSize").getAsInt());
        assertEquals(true, json.get("selected").getAsBoolean());
        assertEquals(2, json.get("value").getAsJsonArray().size());
    }

    @Test
    public void testEmphasisFocusAndScale() {
        EffectScatterEmphasis e = new EffectScatterEmphasis()
                .setFocus("series")
                .setScale(true)
                .setLabel(new SeriesLabel().setShow(true));
        JsonObject json = SERIALIZER.toJsonTree(e).getAsJsonObject();
        assertEquals("series", json.get("focus").getAsString());
        assertEquals(true, json.get("scale").getAsBoolean());
        assertEquals(true, json.get("label").getAsJsonObject().get("show").getAsBoolean());
    }

    @Test
    public void testEmphasisDisabled() {
        JsonObject json = SERIALIZER.toJsonTree(
                new EffectScatterEmphasis().setDisabled(true)).getAsJsonObject();
        assertEquals(true, json.get("disabled").getAsBoolean());
    }

    @Test
    public void testCoordinateSystemAndAxisIndices() {
        EffectScatterSeries s = new EffectScatterSeries()
                .setCoordinateSystem("polar")
                .setPolarIndex(0)
                .setXAxisIndex(1)
                .setYAxisIndex(2);
        JsonObject json = SERIALIZER.toJsonTree(s).getAsJsonObject();
        assertEquals("polar", json.get("coordinateSystem").getAsString());
        assertEquals(0, json.get("polarIndex").getAsInt());
        assertEquals(1, json.get("xAxisIndex").getAsInt());
        assertEquals(2, json.get("yAxisIndex").getAsInt());
    }

    @Test
    public void testNullableFieldsAreOmitted() {
        JsonObject json = SERIALIZER.toJsonTree(new EffectScatterSeries()).getAsJsonObject();
        assertEquals("effectScatter", json.get("type").getAsString());
        assertNull(json.get("rippleEffect"));
        assertNull(json.get("data"));
        assertNull(json.get("symbol"));
    }

    @Test
    public void testParsedJsonRoundTrips() {
        EffectScatterSeries s = new EffectScatterSeries()
                .setData(new Number[][] { { 1, 2 }, { 3, 4 } })
                .setRippleEffect(new RippleEffect().setScale(2));
        String json = SERIALIZER.toJson(s);
        JsonElement parsed = JsonParser.parseString(json);
        assertEquals(parsed, JsonParser.parseString(SERIALIZER.toJson(s)));
    }

    @Test
    public void testChartChainable() {
        EffectScatter chart = new EffectScatter()
                .setTitle("My Effect Scatter")
                .setLegend()
                .addXAxis().addYAxis()
                .addSeries(new EffectScatterSeries().setData(new Number[] { 1, 2, 3 }));
        Option o = chart.getOption();
        assertNotNull(o.getTitle());
        assertNotNull(o.getLegend());
        assertNotNull(o.getSeries());
    }

    @Test
    public void testGeoIndexAndIdSerialization() {
        EffectScatterSeries s = new EffectScatterSeries().setGeoIndex(0).setGeoId("geo-1");
        JsonObject json = SERIALIZER.toJsonTree(s).getAsJsonObject();
        assertEquals(0, json.get("geoIndex").getAsInt());
        assertEquals("geo-1", json.get("geoId").getAsString());
    }

    @Test
    public void testClipFlag() {
        JsonObject json = SERIALIZER.toJsonTree(new EffectScatterSeries().setClip(false)).getAsJsonObject();
        assertEquals(false, json.get("clip").getAsBoolean());
    }
}
