package org.icepear.echarts.render.simple;

import org.icepear.echarts.Bar;
import org.icepear.echarts.Chart;
import org.icepear.echarts.render.Engine;
import org.junit.Before;
import org.junit.Test;

public class RenderMultiSeriesBarTest {
    private Chart<?,?> chart = null;

    @Before
    public void constructChart() {
        Bar bar = new Bar()
        .setLegend()
        .setTooltip("item")
        .addXAxis(new String[] { "Matcha Latte", "Milk Tea", "Cheese Cocoa", "Walnut Brownie" })
        .addYAxis()
        .addSeries("2015", new Number[] { 43.3, 83.1, 86.4, 72.4 })
        .addSeries("2016", new Number[] { 85.8, 73.4, 65.2, 53.9 })
        .addSeries("2017", new Number[] { 93.7, 55.1, 82.5, 39.1 });
        this.chart = bar;
    }

    @Test
    public void testRenderLineByChart() {
        Engine engine = new Engine();
        engine.render("test.html", chart);
    }
}
