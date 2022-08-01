package org.icepear.echarts.advanced.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.components.grid.Grid;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.toolbox.Toolbox;
import org.icepear.echarts.components.toolbox.ToolboxSaveAsImageFeature;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class StepLineTest {
    @Test
    public void testStepLine() {
        Title title = new Title().setText("Step Line");

        Tooltip tooltip = new Tooltip().setTrigger("axis");

        Legend legend = new Legend()
                .setData(new String[] { "Step Start", "Step Middle", "Step End" });

        Grid grid = new Grid()
                .setLeft("3%")
                .setRight("4%")
                .setBottom("3%")
                .setContainLabel(true);

        Toolbox toolbox = new Toolbox()
                .setFeature(new HashMap<String, ToolboxFeatureOption>() {
                    {
                        put("saveAsImage", new ToolboxSaveAsImageFeature());
                    }
                });

        CategoryAxis xAxis = new CategoryAxis()
                .setType("category")
                .setData(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" });

        ValueAxis yAxis = new ValueAxis().setType("value");

        LineSeries series1 = new LineSeries()
                .setName("Step Start")
                .setType("line")
                .setStep("start")
                .setData(new Number[] { 120, 132, 101, 134, 90, 230, 210 });

        LineSeries series2 = new LineSeries().setName("Step Middle")
                .setType("line")
                .setStack("middle")
                .setData(new Number[] { 220, 282, 201, 234, 290, 430, 410 });

        LineSeries series3 = new LineSeries()
                .setName("Step End")
                .setType("line")
                .setStack("end")
                .setData(new Number[] { 450, 432, 401, 454, 590, 530, 510 });

        Option option = new Option()
                .setTitle(title)
                .setTooltip(tooltip)
                .setLegend(legend)
                .setGrid(grid)
                .setToolbox(toolbox)
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(new SeriesOption[] { series1, series2, series3 });

        Reader reader = new InputStreamReader(this.getClass().getResourceAsStream("/advanced/line/step-line.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
