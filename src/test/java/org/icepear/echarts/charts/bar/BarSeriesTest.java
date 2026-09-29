package org.icepear.echarts.charts.bar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import org.icepear.echarts.Bar;
import org.icepear.echarts.Option;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * Direct unit tests of the Bar series large-data options — the ones the Large
 * Scale Bar Chart example relies on (large, largeThreshold, progressive,
 * progressiveThreshold, progressiveChunkMode, sampling, animation).
 *
 * The snapshot fixtures only cover `large`; these pin the rest, including the
 * Boolean/Number overloads that `progressive` generates from its union type.
 */
public class BarSeriesTest {

    private static final EChartsSerializer SERIALIZER = new EChartsSerializer();

    private JsonObject serializeSeries(BarSeries series) {
        Option option = new Bar().addSeries(series).getOption();
        JsonElement json = SERIALIZER.toJsonTree(option);
        return json.getAsJsonObject()
                .get("series").getAsJsonArray()
                .get(0).getAsJsonObject();
    }

    @Test
    public void testBarChartFactoryStampsType() {
        assertEquals("bar", new Bar().createSeries().getType());
    }

    @Test
    public void testLargeAndThreshold() {
        BarSeries series = new BarSeries()
                .setLarge(true)
                .setLargeThreshold(400);

        assertEquals(Boolean.TRUE, series.getLarge());
        assertEquals(400, series.getLargeThreshold());

        JsonObject json = serializeSeries(series);
        assertTrue(json.get("large").getAsBoolean());
        assertEquals(400, json.get("largeThreshold").getAsInt());
    }

    @Test
    public void testLargeCanBeDisabledExplicitly() {
        JsonObject json = serializeSeries(new BarSeries().setLarge(false));
        assertFalse("large=false must survive serialization, not be dropped",
                json.get("large").getAsBoolean());
    }

    @Test
    public void testProgressiveAcceptsBooleanAndNumber() {
        BarSeries asBool = new BarSeries().setProgressive(false);
        assertEquals(Boolean.FALSE, asBool.getProgressive());

        BarSeries asNumber = new BarSeries().setProgressive(5000);
        assertEquals(5000, asNumber.getProgressive());
    }

    @Test
    public void testProgressiveSerializesBothForms() {
        assertFalse(serializeSeries(new BarSeries().setProgressive(false))
                .get("progressive").getAsBoolean());
        assertEquals(5000, serializeSeries(new BarSeries().setProgressive(5000))
                .get("progressive").getAsInt());
    }

    @Test
    public void testProgressiveThresholdAndChunkMode() {
        BarSeries series = new BarSeries()
                .setProgressiveThreshold(3000)
                .setProgressiveChunkMode("mod");

        JsonObject json = serializeSeries(series);
        assertEquals(3000, json.get("progressiveThreshold").getAsInt());
        assertEquals("mod", json.get("progressiveChunkMode").getAsString());
    }

    @Test
    public void testSampling() {
        BarSeries series = new BarSeries().setSampling("lttb");
        assertEquals("lttb", series.getSampling());
        assertEquals("lttb", serializeSeries(series).get("sampling").getAsString());
    }

    @Test
    public void testAnimationCanBeTurnedOff() {
        BarSeries series = new BarSeries().setAnimation(false);
        assertEquals(Boolean.FALSE, series.getAnimation());
        assertFalse(serializeSeries(series).get("animation").getAsBoolean());
    }

    @Test
    public void testUnsetLargeDataOptionsAreOmitted() {
        JsonObject json = serializeSeries(new BarSeries().setData(new Number[] { 1, 2, 3 }));

        for (String key : new String[] { "large", "largeThreshold", "progressive",
                "progressiveThreshold", "progressiveChunkMode", "sampling", "animation" }) {
            assertNull("unset option " + key + " must not appear in the option JSON",
                    json.get(key));
        }
    }
}
