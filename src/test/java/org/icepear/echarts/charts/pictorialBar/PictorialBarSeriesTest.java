package org.icepear.echarts.charts.pictorialBar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.PictorialBar;
import org.icepear.echarts.charts.bar.BarItemStyle;
import org.icepear.echarts.charts.bar.BarLabel;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * Direct unit tests for PictorialBar.
 */
public class PictorialBarSeriesTest {

    private static final EChartsSerializer SERIALIZER = new EChartsSerializer();

    @Test
    public void testDefaultTypeIsPictorialBar() {
        assertEquals("pictorialBar", new PictorialBarSeries().getType());
    }

    @Test
    public void testFactoryProducesPictorialBarSeries() {
        PictorialBar chart = new PictorialBar()
                .addXAxis(new String[] { "A", "B" }).addYAxis()
                .addSeries(new Number[] { 1, 2 });
        Option option = chart.getOption();
        JsonObject series = SERIALIZER.toJsonTree(option).getAsJsonObject()
                .get("series").getAsJsonArray().get(0).getAsJsonObject();
        assertEquals("pictorialBar", series.get("type").getAsString());
    }

    @Test
    public void testSymbolField() {
        JsonObject json = SERIALIZER.toJsonTree(
                new PictorialBarSeries().setSymbol("path://M0,0L10,0L5,10z")).getAsJsonObject();
        assertEquals("path://M0,0L10,0L5,10z", json.get("symbol").getAsString());
    }

    @Test
    public void testSymbolSizeAllOverloads() {
        assertEquals(20, ((Number) new PictorialBarSeries().setSymbolSize(20).getSymbolSize()).intValue());
        assertTrue(new PictorialBarSeries().setSymbolSize(new Number[] { 10, 20 })
                .getSymbolSize() instanceof Number[]);
        assertEquals("50%", new PictorialBarSeries().setSymbolSize("50%").getSymbolSize());
        assertTrue(new PictorialBarSeries().setSymbolSize(new String[] { "50%", "100%" })
                .getSymbolSize() instanceof String[]);
    }

    @Test
    public void testSymbolPosition() {
        for (String pos : new String[] { "start", "center", "end" }) {
            JsonObject json = SERIALIZER.toJsonTree(
                    new PictorialBarSeries().setSymbolPosition(pos)).getAsJsonObject();
            assertEquals(pos, json.get("symbolPosition").getAsString());
        }
    }

    @Test
    public void testSymbolOffsetOverloads() {
        PictorialBarSeries n = new PictorialBarSeries().setSymbolOffset(new Number[] { 5, -5 });
        PictorialBarSeries s = new PictorialBarSeries().setSymbolOffset(new String[] { "0%", "50%" });
        assertNotNull(n.getSymbolOffset());
        assertNotNull(s.getSymbolOffset());
    }

    @Test
    public void testSymbolRotate() {
        JsonObject json = SERIALIZER.toJsonTree(
                new PictorialBarSeries().setSymbolRotate(45)).getAsJsonObject();
        assertEquals(45, json.get("symbolRotate").getAsInt());
    }

    @Test
    public void testSymbolRepeatBooleanNumberAndString() {
        JsonObject jb = SERIALIZER.toJsonTree(
                new PictorialBarSeries().setSymbolRepeat(true)).getAsJsonObject();
        assertEquals(true, jb.get("symbolRepeat").getAsBoolean());

        JsonObject jn = SERIALIZER.toJsonTree(
                new PictorialBarSeries().setSymbolRepeat(5)).getAsJsonObject();
        assertEquals(5, jn.get("symbolRepeat").getAsInt());

        JsonObject js = SERIALIZER.toJsonTree(
                new PictorialBarSeries().setSymbolRepeat("fixed")).getAsJsonObject();
        assertEquals("fixed", js.get("symbolRepeat").getAsString());
    }

    @Test
    public void testSymbolRepeatDirection() {
        JsonObject json = SERIALIZER.toJsonTree(
                new PictorialBarSeries().setSymbolRepeatDirection("end")).getAsJsonObject();
        assertEquals("end", json.get("symbolRepeatDirection").getAsString());
    }

    @Test
    public void testSymbolMarginNumberAndString() {
        JsonObject jn = SERIALIZER.toJsonTree(
                new PictorialBarSeries().setSymbolMargin(2)).getAsJsonObject();
        assertEquals(2, jn.get("symbolMargin").getAsInt());

        JsonObject js = SERIALIZER.toJsonTree(
                new PictorialBarSeries().setSymbolMargin("10%")).getAsJsonObject();
        assertEquals("10%", js.get("symbolMargin").getAsString());
    }

    @Test
    public void testSymbolClipAndPatternSize() {
        JsonObject json = SERIALIZER.toJsonTree(new PictorialBarSeries()
                .setSymbolClip(true).setSymbolPatternSize(400)).getAsJsonObject();
        assertEquals(true, json.get("symbolClip").getAsBoolean());
        assertEquals(400, json.get("symbolPatternSize").getAsInt());
    }

    @Test
    public void testSymbolBoundingDataNumberAndArray() {
        JsonObject jn = SERIALIZER.toJsonTree(
                new PictorialBarSeries().setSymbolBoundingData(100)).getAsJsonObject();
        assertEquals(100, jn.get("symbolBoundingData").getAsInt());

        JsonObject jarr = SERIALIZER.toJsonTree(
                new PictorialBarSeries().setSymbolBoundingData(new Number[] { 0, 100 })).getAsJsonObject();
        assertEquals(2, jarr.get("symbolBoundingData").getAsJsonArray().size());
    }

    @Test
    public void testHoverAnimationFlag() {
        JsonObject json = SERIALIZER.toJsonTree(
                new PictorialBarSeries().setHoverAnimation(false)).getAsJsonObject();
        assertEquals(false, json.get("hoverAnimation").getAsBoolean());
    }

    @Test
    public void testBarLayoutFieldsCarryThrough() {
        PictorialBarSeries s = new PictorialBarSeries()
                .setBarWidth("60%")
                .setBarGap(0)
                .setBarCategoryGap("20%")
                .setBarMaxWidth(60)
                .setBarMinHeight(2);
        JsonObject json = SERIALIZER.toJsonTree(s).getAsJsonObject();
        assertEquals("60%", json.get("barWidth").getAsString());
        assertEquals(0, json.get("barGap").getAsInt());
        assertEquals("20%", json.get("barCategoryGap").getAsString());
        assertEquals(60, json.get("barMaxWidth").getAsInt());
        assertEquals(2, json.get("barMinHeight").getAsInt());
    }

    @Test
    public void testItemStyleAndLabelNested() {
        PictorialBarSeries s = new PictorialBarSeries()
                .setItemStyle(new BarItemStyle().setColor("#abc").setOpacity(0.8))
                .setLabel(new BarLabel().setShow(true).setPosition("top"));
        JsonObject json = SERIALIZER.toJsonTree(s).getAsJsonObject();
        assertEquals("#abc", json.get("itemStyle").getAsJsonObject().get("color").getAsString());
        assertEquals(true, json.get("label").getAsJsonObject().get("show").getAsBoolean());
    }

    @Test
    public void testEmphasisFocusAndDisabled() {
        PictorialBarEmphasis e = new PictorialBarEmphasis()
                .setFocus("series")
                .setDisabled(false);
        JsonObject json = SERIALIZER.toJsonTree(e).getAsJsonObject();
        assertEquals("series", json.get("focus").getAsString());
        assertEquals(false, json.get("disabled").getAsBoolean());
    }

    @Test
    public void testDataItemPerPointSymbolOverride() {
        PictorialBarDataItem item = new PictorialBarDataItem()
                .setName("p1")
                .setValue(50)
                .setSymbol("rect")
                .setSymbolSize(new Number[] { 12, 12 })
                .setSymbolPosition("center")
                .setSymbolRepeat(true)
                .setSymbolRepeatDirection("start")
                .setSymbolMargin(2)
                .setSymbolClip(false)
                .setSymbolPatternSize(50)
                .setSymbolRotate(15);
        JsonObject json = SERIALIZER.toJsonTree(item).getAsJsonObject();
        assertEquals("rect", json.get("symbol").getAsString());
        assertEquals("center", json.get("symbolPosition").getAsString());
        assertEquals(true, json.get("symbolRepeat").getAsBoolean());
        assertEquals(15, json.get("symbolRotate").getAsInt());
        assertEquals(50, json.get("symbolPatternSize").getAsInt());
    }

    @Test
    public void testDataOverloads() {
        assertNotNull(new PictorialBarSeries().setData(new Number[] { 1, 2, 3 }).getData());
        assertNotNull(new PictorialBarSeries().setData(new Number[][] { { 1, 2 }, { 3, 4 } }).getData());
        assertNotNull(new PictorialBarSeries().setData(new String[] { "a", "b" }).getData());
        assertNotNull(new PictorialBarSeries().setData(new PictorialBarDataItem[] {
                new PictorialBarDataItem().setName("x").setValue(1) }).getData());
    }

    @Test
    public void testNullableFieldsAreOmitted() {
        JsonObject json = SERIALIZER.toJsonTree(new PictorialBarSeries()).getAsJsonObject();
        assertEquals("pictorialBar", json.get("type").getAsString());
        assertNull(json.get("symbol"));
        assertNull(json.get("symbolRepeat"));
        assertNull(json.get("data"));
    }

    @Test
    public void testParsedJsonRoundTrips() {
        PictorialBarSeries s = new PictorialBarSeries()
                .setSymbol("circle")
                .setSymbolRepeat(true)
                .setData(new Number[] { 1, 2 });
        JsonElement first = JsonParser.parseString(SERIALIZER.toJson(s));
        JsonElement second = JsonParser.parseString(SERIALIZER.toJson(s));
        assertEquals(first, second);
    }

    @Test
    public void testChartChainable() {
        PictorialBar chart = new PictorialBar()
                .setTitle("Daily Steps")
                .setLegend()
                .addXAxis(new String[] { "Mon", "Tue" })
                .addYAxis()
                .addSeries(new PictorialBarSeries().setData(new Number[] { 1, 2 }));
        Option o = chart.getOption();
        assertNotNull(o.getTitle());
        assertNotNull(o.getLegend());
        assertNotNull(o.getSeries());
    }

    @Test
    public void testCoordinateSystemSerialization() {
        JsonObject json = SERIALIZER.toJsonTree(
                new PictorialBarSeries().setCoordinateSystem("polar")).getAsJsonObject();
        assertEquals("polar", json.get("coordinateSystem").getAsString());
    }
}
