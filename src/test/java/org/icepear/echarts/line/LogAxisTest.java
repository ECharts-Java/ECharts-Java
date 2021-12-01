package org.icepear.echarts.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.Grid;
import org.icepear.echarts.component.Legend;
import org.icepear.echarts.component.LineSeries;
import org.icepear.echarts.component.LogAxis;
import org.icepear.echarts.component.MinorSplitLine;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.SplitLine;
import org.icepear.echarts.component.Title;
import org.icepear.echarts.component.Tooltip;
import org.icepear.echarts.serializer.EChartSerializer;
import org.icepear.echarts.type.BoxLength;
import org.junit.Test;

public class LogAxisTest {
    @Test
    public void testLogAxis() {
        Title title = new Title()
                .setText("Log Axis")
                .setLeft(new BoxLength("center"));

        Tooltip tooltip = new Tooltip()
                .setTrigger("item")
                .setFormatter("{a} <br/>{b} : {c}");

        Legend legend = new Legend().setLeft(new BoxLength("left"));

        CategoryAxis xAxis = new CategoryAxis()
                .setType("category")
                .setName("x")
                .setSplitLine(new SplitLine().setShow(false))
                .setData(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I"));

        Grid grid = new Grid()
                .setLeft(new BoxLength("3%"))
                .setRight(new BoxLength("4%"))
                .setBottom(new BoxLength("3%"))
                .setContainLabel(true);

        LogAxis yAxis = new LogAxis()
                .setType("log")
                .setName("y")
                .setMinorSplitLine(new MinorSplitLine().setShow(true));

        LineSeries series1 = new LineSeries()
                .setName("Log2")
                .setType("line")
                .setData(Arrays.asList(1, 3, 9, 27, 81, 247, 741, 2223, 6669));

        LineSeries series2 = new LineSeries()
                .setName("Log3")
                .setType("line")
                .setData(Arrays.asList(1, 2, 4, 8, 16, 32, 64, 128, 256));

        LineSeries series3 = new LineSeries()
                .setName("Log1/2")
                .setType("line")
                .setData(Arrays.asList(
                        1.0 / 2,
                        1.0 / 4,
                        1.0 / 8,
                        1.0 / 16,
                        1.0 / 32,
                        1.0 / 64,
                        1.0 / 128,
                        1.0 / 256,
                        1.0 / 512));

        Option option = new Option()
                .setTitle(title)
                .setTooltip(tooltip)
                .setLegend(legend)
                .setXAxis(xAxis)
                .setGrid(grid)
                .setYAxis(yAxis)
                .setSeries(Arrays.asList(series1, series2, series3));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/log-axis.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
