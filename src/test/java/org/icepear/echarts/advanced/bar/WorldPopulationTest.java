package org.icepear.echarts.advanced.bar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.bar.BarSeries;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.components.grid.Grid;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.components.tooltip.TooltipAxisPointer;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class WorldPopulationTest {

    @Test
    public void testWorldPopulation() {
        Title title = new Title()
                .setText("World Population");

        Tooltip tooltip = new Tooltip()
                .setTrigger("axis")
                .setAxisPointer(new TooltipAxisPointer()
                        .setType("shadow"));

        Legend legend = new Legend();
        Grid grid = new Grid()
                .setLeft("3%")
                .setRight("4%")
                .setBottom(("3%"))
                .setContainLabel(true);

        ValueAxis xAxis = new ValueAxis()
                .setType("value")
                .setBoundaryGap(new Number[] { 0, 0.01 });

        CategoryAxis yAxis = new CategoryAxis()
                .setType("category")
                .setData(new String[] { "Brazil", "Indonesia", "USA", "India", "China", "World" });

        BarSeries series2011 = new BarSeries()
                .setName("2011")
                .setType("bar")
                .setData(new Number[] { 18203, 23489, 29034, 104970, 131744, 630230 });

        BarSeries series2012 = new BarSeries()
                .setName("2012")
                .setType("bar")
                .setData(new Number[] { 19325, 23438, 31000, 121594, 134141, 681807 });

        Option option = new Option()
                .setTitle(title)
                .setTooltip(tooltip)
                .setLegend(legend)
                .setGrid(grid)
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(new SeriesOption[] { series2011, series2012 });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/bar/world-population.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }

}