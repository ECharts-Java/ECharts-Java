package org.icepear.echarts.render.simple;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.icepear.echarts.Chart;
import org.icepear.echarts.PictorialBar;
import org.icepear.echarts.charts.pictorialBar.PictorialBarSeries;
import org.icepear.echarts.render.Engine;
import org.junit.Before;
import org.junit.Test;

public class RenderPictorialBarByChartTest {
    private Chart<?, ?> chart;

    @Before
    public void constructChart() {
        this.chart = new PictorialBar()
                .setTitle("Daily Steps")
                .addXAxis(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri" })
                .addYAxis()
                .addSeries(new PictorialBarSeries()
                        .setSymbol("circle")
                        .setSymbolRepeat(true)
                        .setSymbolSize(new Number[] { 16, 16 })
                        .setSymbolMargin("10%")
                        .setData(new Number[] { 8000, 9500, 12000, 11000, 15000 }));
    }

    @Test
    public void testRenderPictorialBarJsonOption() {
        Engine engine = new Engine();
        String json = engine.renderJsonOption(chart);
        assertNotNull(json);
        assertTrue(json.contains("\"type\":\"pictorialBar\""));
        assertTrue(json.contains("\"symbolRepeat\":true"));
        assertTrue(json.contains("\"symbol\":\"circle\""));
    }

    @Test
    public void testRenderPictorialBarHtml() {
        Engine engine = new Engine();
        String html = engine.renderHtml(chart);
        assertNotNull(html);
        assertTrue(html.contains("setOption"));
        assertTrue(html.contains("\"type\":\"pictorialBar\""));
    }
}
