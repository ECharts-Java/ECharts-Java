package org.icepear.echarts.charts.lines;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.icepear.echarts.Lines;
import org.icepear.echarts.Option;
import org.icepear.echarts.components.series.LineStyle;
import org.icepear.echarts.components.series.SeriesLabel;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * Direct unit tests for the Lines series.
 */
public class LinesSeriesTest {

    private static final EChartsSerializer SERIALIZER = new EChartsSerializer();

    @Test
    public void testDefaultTypeIsLines() {
        assertEquals("lines", new LinesSeries().getType());
    }

    @Test
    public void testLinesFactoryProducesLinesSeries() {
        Lines chart = new Lines().addSeries(new LinesSeries()
                .setData(new LinesDataItem[] {
                        new LinesDataItem().setCoords(new Number[][] { { 0, 0 }, { 1, 1 } }) }));
        Option option = chart.getOption();
        JsonObject series = SERIALIZER.toJsonTree(option).getAsJsonObject()
                .get("series").getAsJsonArray().get(0).getAsJsonObject();
        assertEquals("lines", series.get("type").getAsString());
    }

    @Test
    public void testLinesEffectAllFields() {
        LinesEffect e = new LinesEffect()
                .setShow(true)
                .setPeriod(6)
                .setDelay(100)
                .setConstantSpeed(40)
                .setSymbol("triangle")
                .setSymbolSize(12)
                .setColor("#fff")
                .setTrailLength(0.5)
                .setLoop(true)
                .setRoundTrip(false);
        JsonObject json = SERIALIZER.toJsonTree(e).getAsJsonObject();
        assertEquals(true, json.get("show").getAsBoolean());
        assertEquals(6, json.get("period").getAsInt());
        assertEquals(100, json.get("delay").getAsInt());
        assertEquals(40, json.get("constantSpeed").getAsInt());
        assertEquals("triangle", json.get("symbol").getAsString());
        assertEquals(12, json.get("symbolSize").getAsInt());
        assertEquals("#fff", json.get("color").getAsString());
        assertEquals(0.5, json.get("trailLength").getAsDouble(), 0.0);
        assertEquals(true, json.get("loop").getAsBoolean());
        assertEquals(false, json.get("roundTrip").getAsBoolean());
    }

    @Test
    public void testEffectSymbolSizeArrayOverload() {
        LinesEffect e = new LinesEffect().setSymbolSize(new Number[] { 10, 20 });
        assertTrue(e.getSymbolSize() instanceof Number[]);
    }

    @Test
    public void testCoordinateSystemOptions() {
        for (String cs : new String[] { "geo", "cartesian2d", "polar" }) {
            JsonObject json = SERIALIZER.toJsonTree(
                    new LinesSeries().setCoordinateSystem(cs)).getAsJsonObject();
            assertEquals(cs, json.get("coordinateSystem").getAsString());
        }
    }

    @Test
    public void testPolylineFlag() {
        JsonObject json = SERIALIZER.toJsonTree(
                new LinesSeries().setPolyline(true)).getAsJsonObject();
        assertEquals(true, json.get("polyline").getAsBoolean());
    }

    @Test
    public void testLargeAndLargeThreshold() {
        JsonObject json = SERIALIZER.toJsonTree(
                new LinesSeries().setLarge(true).setLargeThreshold(2000)).getAsJsonObject();
        assertEquals(true, json.get("large").getAsBoolean());
        assertEquals(2000, json.get("largeThreshold").getAsInt());
    }

    @Test
    public void testGeoIndexAndId() {
        JsonObject json = SERIALIZER.toJsonTree(
                new LinesSeries().setGeoIndex(0).setGeoId("g1")).getAsJsonObject();
        assertEquals(0, json.get("geoIndex").getAsInt());
        assertEquals("g1", json.get("geoId").getAsString());
    }

    @Test
    public void testCartesianAxisIndices() {
        JsonObject json = SERIALIZER.toJsonTree(
                new LinesSeries().setXAxisIndex(1).setYAxisIndex(2)).getAsJsonObject();
        assertEquals(1, json.get("xAxisIndex").getAsInt());
        assertEquals(2, json.get("yAxisIndex").getAsInt());
    }

    @Test
    public void testLineStyleNested() {
        LinesSeries s = new LinesSeries()
                .setLineStyle(new LineStyle().setColor("#abc").setWidth(2).setOpacity(0.5));
        JsonObject ls = SERIALIZER.toJsonTree(s).getAsJsonObject().get("lineStyle").getAsJsonObject();
        assertEquals("#abc", ls.get("color").getAsString());
        assertEquals(2, ls.get("width").getAsInt());
        assertEquals(0.5, ls.get("opacity").getAsDouble(), 0.0);
    }

    @Test
    public void testDataItemCoordsAndValue() {
        LinesDataItem item = new LinesDataItem()
                .setName("flight-1")
                .setCoords(new Number[][] { { 0, 0 }, { 100, 100 } })
                .setValue(50);
        JsonObject json = SERIALIZER.toJsonTree(item).getAsJsonObject();
        assertEquals("flight-1", json.get("name").getAsString());
        assertEquals(2, json.get("coords").getAsJsonArray().size());
        assertEquals(50, json.get("value").getAsInt());
    }

    @Test
    public void testDataItemValueArrayOverload() {
        LinesDataItem item = new LinesDataItem().setValue(new Number[] { 1, 2 });
        JsonObject json = SERIALIZER.toJsonTree(item).getAsJsonObject();
        assertEquals(2, json.get("value").getAsJsonArray().size());
    }

    @Test
    public void testEmphasisFocusAndDisabled() {
        LinesEmphasis e = new LinesEmphasis()
                .setFocus("series")
                .setDisabled(false)
                .setLineStyle(new LineStyle().setWidth(4));
        JsonObject json = SERIALIZER.toJsonTree(e).getAsJsonObject();
        assertEquals("series", json.get("focus").getAsString());
        assertEquals(false, json.get("disabled").getAsBoolean());
        assertEquals(4, json.get("lineStyle").getAsJsonObject().get("width").getAsInt());
    }

    @Test
    public void testLabelOnSeries() {
        LinesSeries s = new LinesSeries().setLabel(new SeriesLabel().setShow(true).setFormatter("{b}"));
        JsonObject json = SERIALIZER.toJsonTree(s).getAsJsonObject();
        assertEquals(true, json.get("label").getAsJsonObject().get("show").getAsBoolean());
        assertEquals("{b}", json.get("label").getAsJsonObject().get("formatter").getAsString());
    }

    @Test
    public void testSymbolStringAndArray() {
        LinesSeries asString = new LinesSeries().setSymbol("arrow");
        LinesSeries asArr = new LinesSeries().setSymbol(new String[] { "circle", "arrow" });
        assertEquals("arrow", asString.getSymbol());
        assertNotNull(asArr.getSymbol());
        assertTrue(asArr.getSymbol() instanceof String[]);
    }

    @Test
    public void testSymbolSizeOverloads() {
        LinesSeries n = new LinesSeries().setSymbolSize(15);
        LinesSeries arr = new LinesSeries().setSymbolSize(new Number[] { 8, 16 });
        assertEquals(15, ((Number) n.getSymbolSize()).intValue());
        assertTrue(arr.getSymbolSize() instanceof Number[]);
    }

    @Test
    public void testNullableFieldsAreOmitted() {
        JsonObject json = SERIALIZER.toJsonTree(new LinesSeries()).getAsJsonObject();
        assertEquals("lines", json.get("type").getAsString());
        assertNull(json.get("data"));
        assertNull(json.get("effect"));
        assertNull(json.get("polyline"));
        assertNull(json.get("coordinateSystem"));
    }

    @Test
    public void testParsedJsonRoundTrips() {
        LinesSeries s = new LinesSeries()
                .setEffect(new LinesEffect().setShow(true).setTrailLength(0.3))
                .setData(new LinesDataItem[] {
                        new LinesDataItem().setCoords(new Number[][] { { 0, 0 }, { 1, 1 } }) });
        JsonElement first = JsonParser.parseString(SERIALIZER.toJson(s));
        JsonElement second = JsonParser.parseString(SERIALIZER.toJson(s));
        assertEquals(first, second);
    }

    @Test
    public void testChartChainable() {
        Lines chart = new Lines()
                .setTitle("Flight paths")
                .setLegend()
                .addSeries(new LinesSeries().setData(new LinesDataItem[] {
                        new LinesDataItem().setCoords(new Number[][] { { 0, 0 }, { 1, 1 } }) }));
        Option o = chart.getOption();
        assertNotNull(o.getTitle());
        assertNotNull(o.getLegend());
        assertNotNull(o.getSeries());
    }

    @Test
    public void testLinesDoesNotEmitEmptyAxisArrays() {
        // Lines extends base Chart (not CartesianCoordChart), so xAxis/yAxis must be absent
        // when the user hasn't configured them — important for geo coordinate usage.
        Lines chart = new Lines().addSeries(new LinesSeries().setData(new LinesDataItem[] {
                new LinesDataItem().setCoords(new Number[][] { { 0, 0 }, { 1, 1 } }) }));
        JsonObject json = SERIALIZER.toJsonTree(chart.getOption()).getAsJsonObject();
        assertNull(json.get("xAxis"));
        assertNull(json.get("yAxis"));
    }

    @Test
    public void testCoordsRoundTrip() {
        Number[][] coords = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        LinesDataItem item = new LinesDataItem().setCoords(coords);
        assertArrayEquals(coords, item.getCoords());
    }
}
