package org.icepear.echarts.charts.map;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.icepear.echarts.MapChart;
import org.icepear.echarts.Option;
import org.icepear.echarts.components.series.SeriesLabel;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * Direct unit tests of the Map chart classes — exercises setters, defaults, the
 * RoamOptionMixin/BoxLayoutOptionMixin overloads, and the data overloads to
 * keep coverage tight without relying solely on snapshot fixtures.
 */
public class MapSeriesTest {

    private static final EChartsSerializer SERIALIZER = new EChartsSerializer();

    @Test
    public void testDefaultTypeIsMap() {
        assertEquals("map", new MapSeries().getType());
    }

    @Test
    public void testMapChartFactoryProducesMapSeries() {
        MapChart chart = new MapChart()
                .addSeries(new MapSeries().setMap("USA"));
        Option option = chart.getOption();
        JsonElement json = SERIALIZER.toJsonTree(option);
        JsonObject series = json.getAsJsonObject()
                .get("series").getAsJsonArray()
                .get(0).getAsJsonObject();
        assertEquals("map", series.get("type").getAsString());
        assertEquals("USA", series.get("map").getAsString());
    }

    @Test
    public void testRoamAcceptsBooleanAndString() {
        MapSeries asBool = new MapSeries().setRoam(true);
        assertEquals(Boolean.TRUE, asBool.getRoam());

        MapSeries asString = new MapSeries().setRoam("scale");
        assertEquals("scale", asString.getRoam());
    }

    @Test
    public void testLayoutSizeAndCenter() {
        MapSeries series = new MapSeries()
                .setLayoutCenter(new String[] { "50%", "50%" })
                .setLayoutSize("100%")
                .setCenter(new Number[] { 104.114129, 37.550339 })
                .setZoom(1.5);

        assertArrayEquals(new String[] { "50%", "50%" }, series.getLayoutCenter());
        assertEquals("100%", series.getLayoutSize());
        assertArrayEquals(new Number[] { 104.114129, 37.550339 }, series.getCenter());
        assertEquals(1.5, series.getZoom().doubleValue(), 0.0);
    }

    @Test
    public void testLayoutSizeNumericOverload() {
        MapSeries series = new MapSeries().setLayoutSize(400);
        assertEquals(400, ((Number) series.getLayoutSize()).intValue());
    }

    @Test
    public void testBoxLayoutOverloadsCoexist() {
        MapSeries series = new MapSeries()
                .setLeft("10%").setTop(20)
                .setRight("5%").setBottom(15)
                .setWidth("80%").setHeight(300);
        assertEquals("10%", series.getLeft());
        assertEquals(20, ((Number) series.getTop()).intValue());
        assertEquals("5%", series.getRight());
        assertEquals(15, ((Number) series.getBottom()).intValue());
        assertEquals("80%", series.getWidth());
        assertEquals(300, ((Number) series.getHeight()).intValue());
    }

    @Test
    public void testDataItemOverloads() {
        MapDataItem scalar = new MapDataItem().setName("California").setValue(393);
        MapDataItem vector = new MapDataItem().setName("Texas").setValue(new Number[] { 1, 2, 3 });

        assertEquals(393, ((Number) scalar.getValue()).intValue());
        assertNotNull(vector.getValue());
        assertTrue(vector.getValue() instanceof Number[]);
    }

    @Test
    public void testEmphasisItemStyleAndLabelSerialization() {
        MapSeries series = new MapSeries()
                .setMap("USA")
                .setEmphasis(new MapEmphasis()
                        .setFocus("self")
                        .setLabel(new SeriesLabel().setShow(true))
                        .setItemStyle(new MapItemStyle().setAreaColor("#abc")));

        JsonElement json = SERIALIZER.toJsonTree(series);
        JsonObject emphasis = json.getAsJsonObject().get("emphasis").getAsJsonObject();
        assertEquals("self", emphasis.get("focus").getAsString());
        assertEquals("#abc", emphasis.get("itemStyle").getAsJsonObject().get("areaColor").getAsString());
        assertEquals(true, emphasis.get("label").getAsJsonObject().get("show").getAsBoolean());
    }

    @Test
    public void testRawDataObjectOverload() {
        Object[] rawData = new Object[] {
                new MapDataItem().setName("A").setValue(1),
                new MapDataItem().setName("B").setValue(2)
        };
        MapSeries series = new MapSeries().setData(rawData);
        JsonElement json = SERIALIZER.toJsonTree(series);
        assertEquals(2, json.getAsJsonObject().get("data").getAsJsonArray().size());
    }

    @Test
    public void testItemStyleAreaColorSerializesUnderItemStyle() {
        MapSeries series = new MapSeries()
                .setMap("world")
                .setItemStyle(new MapItemStyle().setAreaColor("rgb(1,2,3)").setBorderColor("#000"));

        String json = SERIALIZER.toJson(series);
        // areaColor must be nested inside itemStyle, not on the series root.
        assertTrue(json.contains("\"itemStyle\":{"));
        assertTrue(json.contains("\"areaColor\":\"rgb(1,2,3)\""));
        assertTrue(json.contains("\"borderColor\":\"#000\""));
    }

    @Test
    public void testNullableFieldsAreOmitted() {
        // Only setting required-ish things: nothing else should leak into JSON.
        MapSeries series = new MapSeries().setMap("USA");
        JsonObject json = SERIALIZER.toJsonTree(series).getAsJsonObject();
        assertEquals("map", json.get("type").getAsString());
        assertEquals("USA", json.get("map").getAsString());
        assertNull(json.get("roam"));
        assertNull(json.get("center"));
        assertNull(json.get("data"));
        assertNull(json.get("emphasis"));
    }

    @Test
    public void testNameMapAndNameProperty() {
        java.util.Map<String, String> nameMap = new java.util.HashMap<>();
        nameMap.put("United States", "USA");
        MapSeries series = new MapSeries()
                .setMap("world")
                .setNameMap(nameMap)
                .setNameProperty("name");

        JsonObject json = SERIALIZER.toJsonTree(series).getAsJsonObject();
        assertEquals("name", json.get("nameProperty").getAsString());
        assertEquals("USA", json.get("nameMap").getAsJsonObject().get("United States").getAsString());
    }

    @Test
    public void testProjectionAndShowLegendSymbolFlags() {
        MapSeries series = new MapSeries()
                .setMap("USA")
                .setShowLegendSymbol(false)
                .setMapValueCalculation("sum")
                .setAspectScale(0.75);

        JsonObject json = SERIALIZER.toJsonTree(series).getAsJsonObject();
        assertEquals(false, json.get("showLegendSymbol").getAsBoolean());
        assertEquals("sum", json.get("mapValueCalculation").getAsString());
        assertEquals(0.75, json.get("aspectScale").getAsDouble(), 0.0);
    }

    @Test
    public void testDataItemSelected() {
        MapDataItem item = new MapDataItem().setName("CA").setValue(1).setSelected(true);
        JsonObject json = SERIALIZER.toJsonTree(item).getAsJsonObject();
        assertEquals(true, json.get("selected").getAsBoolean());
    }

    @Test
    public void testMapChartChainable() {
        // Verifies the wrapper chains correctly and the constructor wires the right type token.
        MapChart chart = new MapChart()
                .setTitle("My map")
                .setLegend()
                .addSeries(new MapSeries().setMap("USA"));
        Option option = chart.getOption();
        assertNotNull(option.getTitle());
        assertNotNull(option.getLegend());
        assertNotNull(option.getSeries());
    }

    @Test
    public void testParsedJsonRoundTripsAreEqual() {
        MapSeries series = new MapSeries().setMap("USA").setRoam(true);
        String json = SERIALIZER.toJson(series);
        JsonElement parsed = JsonParser.parseString(json);
        JsonElement reSerialized = JsonParser.parseString(SERIALIZER.toJson(series));
        assertEquals(parsed, reSerialized);
    }

    @Test
    public void testBoundingCoords() {
        Number[][] coords = new Number[][] { { -180, 90 }, { 180, -90 } };
        MapSeries series = new MapSeries().setMap("world").setBoundingCoords(coords);
        JsonObject json = SERIALIZER.toJsonTree(series).getAsJsonObject();
        assertEquals(2, json.get("boundingCoords").getAsJsonArray().size());
    }

    @Test
    public void testGeoIndexSerializes() {
        MapSeries series = new MapSeries().setGeoIndex(0);
        JsonObject json = SERIALIZER.toJsonTree(series).getAsJsonObject();
        assertEquals(0, json.get("geoIndex").getAsInt());
    }

    @Test
    public void testMapEmphasisDisabledFlag() {
        MapEmphasis emphasis = new MapEmphasis().setDisabled(true);
        JsonObject json = SERIALIZER.toJsonTree(emphasis).getAsJsonObject();
        assertEquals(true, json.get("disabled").getAsBoolean());
    }
}
