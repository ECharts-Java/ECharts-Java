
package org.icepear.echarts.render.simple;

import org.icepear.echarts.Chart;
import org.icepear.echarts.Line;
import org.icepear.echarts.render.Engine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RenderLineByChartTest {
    private Chart<?,?> chart;

    @BeforeEach
    public void constructChart() {
        Line line = new Line()
                .addXAxis(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" })
                .addYAxis()
                .addSeries(new Number[] { 150, 230, 224, 218, 135, 147, 260 });

        this.chart = line;
    }

    @Test
    public void testRenderLineByChart() {
        Engine engine = new Engine();
        engine.render("test.html", chart);
    }
}
