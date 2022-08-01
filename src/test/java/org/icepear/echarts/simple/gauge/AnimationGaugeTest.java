package org.icepear.echarts.simple.gauge;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Gauge;
import org.icepear.echarts.charts.gauge.GaugeDataItem;
import org.icepear.echarts.charts.gauge.GaugeDetail;
import org.icepear.echarts.charts.gauge.GaugeProgress;
import org.icepear.echarts.charts.gauge.GaugeSeries;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class AnimationGaugeTest {
    @Test
    public void testAnimationGauge() {
        Gauge gauge = new Gauge()
                .setTooltip("item")
                .addSeries(new GaugeSeries().setName("Pressure")
                        .setProgress(new GaugeProgress().setShow(true))
                        .setDetail(new GaugeDetail().setValueAnimation(true))
                        .setData(new GaugeDataItem[] { new GaugeDataItem().setValue(50).setName("SCORE") }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/gauge/animation-gauge.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(gauge.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(gauge.getOption()));
    }
}
