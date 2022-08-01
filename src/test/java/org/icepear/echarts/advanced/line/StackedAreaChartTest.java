package org.icepear.echarts.advanced.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.line.LineAreaStyle;
import org.icepear.echarts.charts.line.LineEmphasis;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.components.axisPointer.AxisPointerLabel;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.components.grid.Grid;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.series.SeriesLabel;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.toolbox.Toolbox;
import org.icepear.echarts.components.toolbox.ToolboxSaveAsImageFeature;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.components.tooltip.TooltipAxisPointer;
import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class StackedAreaChartTest {
    @Test
    public void testStackedAreaChart() {
        Title title = new Title().setText("Stacked Area Chart");

        Tooltip tooltip = new Tooltip()
                .setTrigger("axis")
                .setAxisPointer(new TooltipAxisPointer()
                        .setType("cross")
                        .setLabel(new AxisPointerLabel()
                                .setBackgroundColor("#6a7985")));

        Legend legend = new Legend()
                .setData(new String[] { "Email", "Union Ads", "Video Ads", "Direct", "Search Engine" });

        Toolbox toolbox = new Toolbox()
                .setFeature(new HashMap<String, ToolboxFeatureOption>() {
                    {
                        put("saveAsImage", new ToolboxSaveAsImageFeature());
                    }
                });

        Grid grid = new Grid()
                .setLeft("3%")
                .setRight("4%")
                .setBottom("3%")
                .setContainLabel(true);

        CategoryAxis xAxis = new CategoryAxis()
                .setType("category")
                .setBoundaryGap(false)
                .setData(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" });

        ValueAxis yAxis = new ValueAxis().setType("value");

        LineEmphasis emphasis = new LineEmphasis().setFocus("series");

        LineSeries series1 = new LineSeries()
                .setName("Email")
                .setType("line")
                .setStack("Total")
                .setAreaStyle(new LineAreaStyle())
                .setEmphasis(emphasis)
                .setData(new Number[] { 120, 132, 101, 134, 90, 230, 210 });

        LineSeries series2 = new LineSeries()
                .setName("Union Ads")
                .setType("line")
                .setStack("Total")
                .setAreaStyle(new LineAreaStyle())
                .setEmphasis(emphasis)
                .setData(new Number[] { 220, 182, 191, 234, 290, 330, 310 });

        LineSeries series3 = new LineSeries()
                .setName("Video Ads")
                .setType("line")
                .setStack("Total")
                .setAreaStyle(new LineAreaStyle())
                .setEmphasis(emphasis)
                .setData(new Number[] { 150, 232, 201, 154, 190, 330, 410 });

        LineSeries series4 = new LineSeries()
                .setName("Direct")
                .setType("line")
                .setStack("Total")
                .setAreaStyle(new LineAreaStyle())
                .setEmphasis(emphasis)
                .setData(new Number[] { 320, 332, 301, 334, 390, 330, 320 });

        LineSeries series5 = new LineSeries()
                .setName("Search Engine")
                .setType("line")
                .setStack("Total")
                .setAreaStyle(new LineAreaStyle())
                .setEmphasis(emphasis)
                .setLabel(new SeriesLabel()
                        .setShow(true)
                        .setPosition("top"))
                .setData(new Number[] { 820, 932, 901, 934, 1290, 1330, 1320 });

        Option option = new Option()
                .setTitle(title)
                .setTooltip(tooltip)
                .setLegend(legend)
                .setGrid(grid)
                .setToolbox(toolbox)
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(new SeriesOption[] { series1, series2, series3, series4, series5 });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/line/stacked-area-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
