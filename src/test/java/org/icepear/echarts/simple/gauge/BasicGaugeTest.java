package org.icepear.echarts.simple.gauge;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Gauge;
import org.icepear.echarts.charts.gauge.GaugeDataItem;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicGaugeTest {
    @Test
    public void testBasicGauge() {
        Gauge gauge = new Gauge()
                .setTooltip("item")
                .addSeries(new GaugeDataItem[] { new GaugeDataItem().setValue(50).setName("SCORE") });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/gauge/basic-gauge.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(gauge.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(gauge.getOption()));
    }
}
