package org.icepear.echarts.simple.effectScatter;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.EffectScatter;
import org.icepear.echarts.charts.effectScatter.EffectScatterSeries;
import org.icepear.echarts.charts.effectScatter.RippleEffect;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicEffectScatterTest {

    @Test
    public void testBasicEffectScatter() {
        EffectScatter chart = new EffectScatter()
                .addXAxis()
                .addYAxis()
                .addSeries(new EffectScatterSeries()
                        .setSymbolSize(20)
                        .setShowEffectOn("render")
                        .setRippleEffect(new RippleEffect().setScale(2.5).setBrushType("stroke"))
                        .setData(new Number[][] {
                                { 10, 80 }, { 20, 50 }, { 30, 70 }, { 40, 30 }, { 50, 90 }
                        }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/effectScatter/basic-effect-scatter.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(chart.getOption());
        assertEquals(expected, actual);
    }
}
