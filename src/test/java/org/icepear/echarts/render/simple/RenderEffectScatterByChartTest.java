package org.icepear.echarts.render.simple;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.icepear.echarts.Chart;
import org.icepear.echarts.EffectScatter;
import org.icepear.echarts.charts.effectScatter.EffectScatterSeries;
import org.icepear.echarts.charts.effectScatter.RippleEffect;
import org.icepear.echarts.render.Engine;
import org.junit.Before;
import org.junit.Test;

public class RenderEffectScatterByChartTest {
    private Chart<?, ?> chart;

    @Before
    public void constructChart() {
        this.chart = new EffectScatter()
                .setTitle("Pulse Map")
                .addXAxis().addYAxis()
                .addSeries(new EffectScatterSeries()
                        .setSymbolSize(20)
                        .setShowEffectOn("render")
                        .setRippleEffect(new RippleEffect().setScale(2.5).setBrushType("stroke"))
                        .setData(new Number[][] { { 10, 80 }, { 30, 70 }, { 50, 90 } }));
    }

    @Test
    public void testRenderEffectScatterJsonOption() {
        Engine engine = new Engine();
        String json = engine.renderJsonOption(chart);
        assertNotNull(json);
        assertTrue(json.contains("\"type\":\"effectScatter\""));
        assertTrue(json.contains("\"rippleEffect\""));
        assertTrue(json.contains("\"showEffectOn\":\"render\""));
    }

    @Test
    public void testRenderEffectScatterHtml() {
        Engine engine = new Engine();
        String html = engine.renderHtml(chart);
        assertNotNull(html);
        assertTrue(html.contains("setOption"));
        assertTrue(html.contains("\"type\":\"effectScatter\""));
    }
}
