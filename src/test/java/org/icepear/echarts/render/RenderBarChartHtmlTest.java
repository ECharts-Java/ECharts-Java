package org.icepear.echarts.render;

import java.io.IOException;

import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.Tooltip;
import org.icepear.echarts.component.BarSeries;
import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.CategoryAxisTick;
import org.icepear.echarts.component.Grid;
import org.icepear.echarts.component.TooltipAxisPointer;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.origin.util.SeriesOption;

import org.junit.Before;
import org.junit.Test;

public class RenderBarChartHtmlTest {
    private Option option;

    @Before
    public void constructOption() {
        Tooltip tooltip = new Tooltip()
                .setTrigger("axis")
                .setAxisPointer(new TooltipAxisPointer()
                        .setType("shadow"));

        Grid grid = new Grid()
                .setLeft("3%")
                .setRight("4%")
                .setBottom("3%")
                .setContainLabel(true);

        CategoryAxis xAxis = new CategoryAxis()
                .setType("category")
                .setData(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" })
                .setAxisTick(new CategoryAxisTick()
                        .setAlignWithLabel(true));

        ValueAxis yAxis = new ValueAxis().setType("value");

        BarSeries series = new BarSeries()
                .setName("Direct")
                .setType("bar")
                .setBarWidth("60%")
                .setData(new Number[] { 10, 52, 200, 334, 390, 330, 220 });

        Option option = new Option()
                .setTooltip(tooltip)
                .setGrid(grid)
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(new SeriesOption[] { series });

        this.option = option;
    }

    @Test
    public void testRenderSimpleHtml() throws IOException {
        Engine engine = new Engine();
        engine.render("test.html", this.option);
    }

}
