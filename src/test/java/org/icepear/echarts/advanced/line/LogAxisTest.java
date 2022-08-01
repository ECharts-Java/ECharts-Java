package org.icepear.echarts.advanced.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.components.coord.MinorSplitLine;
import org.icepear.echarts.components.coord.SplitLine;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.LogAxis;
import org.icepear.echarts.components.grid.Grid;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class LogAxisTest {
    @Test
    public void testLogAxis() {
        Title title = new Title()
                .setText("Log Axis")
                .setLeft("center");

        Tooltip tooltip = new Tooltip()
                .setTrigger("item")
                .setFormatter("{a} <br/>{b} : {c}");

        Legend legend = new Legend().setLeft("left");

        CategoryAxis xAxis = new CategoryAxis()
                .setType("category")
                .setName("x")
                .setSplitLine(new SplitLine().setShow(false))
                .setData(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I" });

        Grid grid = new Grid()
                .setLeft("3%")
                .setRight("4%")
                .setBottom("3%")
                .setContainLabel(true);

        LogAxis yAxis = new LogAxis()
                .setType("log")
                .setName("y")
                .setMinorSplitLine(new MinorSplitLine().setShow(true));

        LineSeries series1 = new LineSeries()
                .setName("Log2")
                .setType("line")
                .setData(new Number[] { 1, 3, 9, 27, 81, 247, 741, 2223, 6669 });

        LineSeries series2 = new LineSeries()
                .setName("Log3")
                .setType("line")
                .setData(new Number[] { 1, 2, 4, 8, 16, 32, 64, 128, 256 });

        LineSeries series3 = new LineSeries()
                .setName("Log1/2")
                .setType("line")
                .setData(new Number[] {
                        1.0 / 2,
                        1.0 / 4,
                        1.0 / 8,
                        1.0 / 16,
                        1.0 / 32,
                        1.0 / 64,
                        1.0 / 128,
                        1.0 / 256,
                        1.0 / 512 });

        Option option = new Option()
                .setTitle(title)
                .setTooltip(tooltip)
                .setLegend(legend)
                .setXAxis(xAxis)
                .setGrid(grid)
                .setYAxis(yAxis)
                .setSeries(new SeriesOption[] { series1, series2, series3 });

        Reader reader = new InputStreamReader(this.getClass().getResourceAsStream("/advanced/line/log-axis.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
