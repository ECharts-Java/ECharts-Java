package org.icepear.echarts.render.simple;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.icepear.echarts.Chart;
import org.icepear.echarts.Lines;
import org.icepear.echarts.charts.lines.LinesDataItem;
import org.icepear.echarts.charts.lines.LinesEffect;
import org.icepear.echarts.charts.lines.LinesSeries;
import org.icepear.echarts.render.Engine;
import org.junit.Before;
import org.junit.Test;

public class RenderLinesByChartTest {
    private Chart<?, ?> chart;

    @Before
    public void constructChart() {
        this.chart = new Lines()
                .setTitle("Flight Paths")
                .addSeries(new LinesSeries()
                        .setCoordinateSystem("cartesian2d")
                        .setEffect(new LinesEffect().setShow(true).setSymbol("arrow"))
                        .setData(new LinesDataItem[] {
                                new LinesDataItem().setCoords(new Number[][] { { 0, 0 }, { 50, 80 } })
                        }));
    }

    @Test
    public void testRenderLinesJsonOption() {
        Engine engine = new Engine();
        String json = engine.renderJsonOption(chart);
        assertNotNull(json);
        assertTrue(json.contains("\"type\":\"lines\""));
        assertTrue(json.contains("\"effect\""));
        assertTrue(json.contains("\"coords\""));
    }

    @Test
    public void testRenderLinesHtml() {
        Engine engine = new Engine();
        String html = engine.renderHtml(chart);
        assertNotNull(html);
        assertTrue(html.contains("setOption"));
        assertTrue(html.contains("\"type\":\"lines\""));
    }
}
