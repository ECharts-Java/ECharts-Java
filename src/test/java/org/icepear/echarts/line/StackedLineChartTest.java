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
        Title title = new Title();
        title.setText("Stacked Line");

        Tooltip tooltip = new Tooltip();
        tooltip.setTrigger("axis");

        Legend legend = new Legend();
        legend.setData(Arrays.asList("Email", "Union Ads", "Video Ads", "Direct", "Search Engine"));

        Grid grid = new Grid();
        grid.setLeft(new BoxLength<String>("3%"));
        grid.setRight(new BoxLength<String>("4%"));
        grid.setBottom(new BoxLength<String>("3%"));
        grid.setContainLabel(true);

        Toolbox toolbox = new Toolbox();
        Map<String, ToolboxFeatureOption> feature = new HashMap<>();
        feature.put("saveAsImage", new ToolboxSaveAsImageFeature());
        toolbox.setFeature(feature);

        CategoryAxis xCategoryAxis = new CategoryAxis();
        xCategoryAxis.setType("category");
        xCategoryAxis.setBoundaryGap(false);
        xCategoryAxis.setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
        Axis xAxis = new Axis();
        xAxis.setAxisBaseOption(xCategoryAxis);

        ValueAxis yValueAxis = new ValueAxis();
        yValueAxis.setType("value");
        Axis yAxis = new Axis();
        yAxis.setAxisBaseOption(yValueAxis);

        LineSeries series1 = new LineSeries();
        series1.setName("Email");
        series1.setType("line");
        series1.setStack("Total");
        series1.setData(Arrays.asList(120, 132, 101, 134, 90, 230, 210));

        LineSeries series2 = new LineSeries();
        series2.setName("Union Ads");
        series2.setType("line");
        series2.setStack("Total");
        series2.setData(Arrays.asList(220, 182, 191, 234, 290, 330, 310));

        LineSeries series3 = new LineSeries();
        series3.setName("Video Ads");
        series3.setType("line");
        series3.setStack("Total");
        series3.setData(Arrays.asList(150, 232, 201, 154, 190, 330, 410));

        LineSeries series4 = new LineSeries();
        series4.setName("Direct");
        series4.setType("line");
        series4.setStack("Total");
        series4.setData(Arrays.asList(320, 332, 301, 334, 390, 330, 320));

        LineSeries series5 = new LineSeries();
        series5.setName("Search Engine");
        series5.setType("line");
        series5.setStack("Total");
        series5.setData(Arrays.asList(820, 932, 901, 934, 1290, 1330, 1320));

        Option option = new Option();
        option.setTitle(Arrays.asList(title));
        option.setTooltip(Arrays.asList(tooltip));
        option.setLegend(Arrays.asList(legend));
        option.setGrid(Arrays.asList(grid));
        option.setToolbox(Arrays.asList(toolbox));
        option.setXAxis(Arrays.asList(xAxis));
        option.setYAxis(Arrays.asList(yAxis));
        option.setSeries(Arrays.asList(series1, series2, series3, series4, series5));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/stacked-line-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
