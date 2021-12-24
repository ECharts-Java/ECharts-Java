
package org.icepear.echarts.render.simple;

import java.io.IOException;

import org.icepear.echarts.Chart;
import org.icepear.echarts.Line;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.series.AreaStyle;
import org.icepear.echarts.render.Engine;
import org.junit.Before;
import org.junit.Test;

public class RenderLineByChart {
    private Chart<?,?> chart;

    @Before
    public void constructChart() {
        Line line = new Line()
                .addXAxis(new CategoryAxis()
                        .setData(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" })
                        .setBoundaryGap(false))
                .addYAxis()
                .addSeries(new LineSeries()
                        .setData(new Number[] { 820, 932, 901, 934, 1290, 1330, 1320 })
                        .setAreaStyle(new AreaStyle()));
        this.chart = line;
    }

    @Test
    public void testRenderLineByChart() throws IOException {
        Engine engine = new Engine();
        engine.render("test.html", chart);
    }
}
