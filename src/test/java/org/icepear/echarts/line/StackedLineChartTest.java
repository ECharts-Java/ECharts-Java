package org.icepear.echarts.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.Grid;
import org.icepear.echarts.component.Legend;
import org.icepear.echarts.component.LineSeries;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.Title;
import org.icepear.echarts.component.Toolbox;
import org.icepear.echarts.component.ToolboxSaveAsImageFeature;
import org.icepear.echarts.component.Tooltip;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.component.Axis;
import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.serializer.EChartSerializer;
import org.icepear.echarts.type.BoxLength;
import org.junit.Test;

public class StackedLineChartTest {
    @Test
    public void testStackedLineChart() {
        Title title = new Title().setText("Stacked Line");

        Tooltip tooltip = new Tooltip().setTrigger("axis");

        Legend legend = new Legend()
                .setData(Arrays.asList("Email", "Union Ads", "Video Ads", "Direct", "Search Engine"));

        Grid grid = new Grid()
                .setLeft(new BoxLength<String>("3%"))
                .setRight(new BoxLength<String>("4%"))
                .setBottom(new BoxLength<String>("3%"))
                .setContainLabel(true);

        
        Map<String, ToolboxFeatureOption> feature = new HashMap<>();
        feature.put("saveAsImage", new ToolboxSaveAsImageFeature());
        Toolbox toolbox = new Toolbox().setFeature(feature);

        Axis xAxis = new Axis()
                .setAxisBaseOption(new CategoryAxis()
                        .setType("category")
                        .setBoundaryGap(false)
                        .setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")));

        Axis yAxis = new Axis()
                .setAxisBaseOption(new ValueAxis()
                        .setType("value"));

        LineSeries series1 = new LineSeries()
                .setName("Email")
                .setType("line")
                .setStack("Total")
                .setData(Arrays.asList(120, 132, 101, 134, 90, 230, 210));

        LineSeries series2 = new LineSeries().
                setName("Union Ads")
                .setType("line")
                .setStack("Total")
                .setData(Arrays.asList(220, 182, 191, 234, 290, 330, 310));

        LineSeries series3 = new LineSeries()
                .setName("Video Ads")
                .setType("line")
                .setStack("Total")
                .setData(Arrays.asList(150, 232, 201, 154, 190, 330, 410));

        LineSeries series4 = new LineSeries()
                .setName("Direct")
                .setType("line")
                .setStack("Total")
                .setData(Arrays.asList(320, 332, 301, 334, 390, 330, 320));

        LineSeries series5 = new LineSeries()
                .setName("Search Engine")
                .setType("line")
                .setStack("Total")
                .setData(Arrays.asList(820, 932, 901, 934, 1290, 1330, 1320));

        Option option = new Option()
                .setTitle(title)
                .setTooltip(tooltip)
                .setLegend(legend)
                .setGrid(grid)
                .setToolbox(toolbox)
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(Arrays.asList(series1, series2, series3, series4, series5));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/stacked-line-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
