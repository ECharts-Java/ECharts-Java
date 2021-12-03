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
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.Title;
import org.icepear.echarts.component.Toolbox;
import org.icepear.echarts.component.ToolboxFeatureMap;
import org.icepear.echarts.component.ToolboxSaveAsImageFeature;
import org.icepear.echarts.component.Tooltip;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.serializer.EChartSerializer;
import org.icepear.echarts.type.BoxLength;
import org.junit.Test;

public class StepLineTest {
    @Test
    public void testStepLine() {
        Title title = new Title().setText("Step Line");

        Tooltip tooltip = new Tooltip().setTrigger("axis");

        Legend legend = new Legend()
                .setData(Arrays.asList("Step Start", "Step Middle", "Step End"));

        Grid grid = new Grid()
                .setLeft(new BoxLength("3%"))
                .setRight(new BoxLength("4%"))
                .setBottom(new BoxLength("3%"))
                .setContainLabel(true);

        Toolbox toolbox = new Toolbox()
                .setFeature(new ToolboxFeatureMap()
                        .setSaveAsImage(new ToolboxSaveAsImageFeature()));

        CategoryAxis xAxis = new CategoryAxis()
                .setType("category")
                .setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));

        ValueAxis yAxis = new ValueAxis().setType("value");

        LineSeries series1 = new LineSeries()
                .setName("Step Start")
                .setType("line")
                .setStep("start")
                .setData(Arrays.asList(120, 132, 101, 134, 90, 230, 210));

        LineSeries series2 = new LineSeries().setName("Step Middle")
                .setType("line")
                .setStack("middle")
                .setData(Arrays.asList(220, 282, 201, 234, 290, 430, 410));

        LineSeries series3 = new LineSeries()
                .setName("Step End")
                .setType("line")
                .setStack("end")
                .setData(Arrays.asList(450, 432, 401, 454, 590, 530, 510));

        Option option = new Option()
                .setTitle(title)
                .setTooltip(tooltip)
                .setLegend(legend)
                .setGrid(grid)
                .setToolbox(toolbox)
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(Arrays.asList(series1, series2, series3));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/step-line.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
