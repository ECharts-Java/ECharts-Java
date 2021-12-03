package org.icepear.echarts.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.Legend;
import org.icepear.echarts.component.LineSeries;
import org.icepear.echarts.component.MarkLine;
import org.icepear.echarts.component.MarkLine1DDataItem;
import org.icepear.echarts.component.MarkLine2DDataItem;
import org.icepear.echarts.component.MarkLine2DDataItemDim;
import org.icepear.echarts.component.MarkPoint;
import org.icepear.echarts.component.MarkPointDataItem;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.SeriesLineLabel;
import org.icepear.echarts.component.Title;
import org.icepear.echarts.component.Toolbox;
import org.icepear.echarts.component.ToolboxDataViewFeature;
import org.icepear.echarts.component.ToolboxDataZoomFeature;
import org.icepear.echarts.component.ToolboxFeatureMap;
import org.icepear.echarts.component.ToolboxMagicTypeFeature;
import org.icepear.echarts.component.ToolboxRestoreFeature;
import org.icepear.echarts.component.ToolboxSaveAsImageFeature;
import org.icepear.echarts.component.Tooltip;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.component.ValueAxisLabel;
import org.icepear.echarts.serializer.EChartSerializer;
import org.icepear.echarts.type.AxisIndex;
import org.icepear.echarts.type.EChartsNumber;
import org.junit.Test;

public class TemperatureChangeInTheComingWeekTest {
    @Test
    public void testTemperatureChangeInTheComingWeek() {
        Title title = new Title().setText("Temperature Change in the Coming Week");

        Tooltip tooltip = new Tooltip().setTrigger("axis");

        Legend legend = new Legend();

        Toolbox toolbox = new Toolbox()
                .setShow(true)
                .setFeature(new ToolboxFeatureMap()
                        .setDataZoom(new ToolboxDataZoomFeature().setYAxisIndex(new AxisIndex("none")))
                        .setDataView(new ToolboxDataViewFeature().setReadOnly(false))
                        .setMagicType(new ToolboxMagicTypeFeature().setType(Arrays.asList("line", "bar")))
                        .setRestore(new ToolboxRestoreFeature())
                        .setSaveAsImage(new ToolboxSaveAsImageFeature()));

        CategoryAxis xAxis = new CategoryAxis()
                .setType("category")
                .setBoundaryGap(false)
                .setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));

        ValueAxis yAxis = new ValueAxis()
                .setType("value")
                .setAxisLabel(new ValueAxisLabel().setFormatter("{value} °C"));

        LineSeries series1 = new LineSeries()
                .setName("Highest")
                .setType("line")
                .setData(Arrays.asList(10, 11, 13, 11, 12, 12, 9))
                .setMarkPoint(new MarkPoint()
                        .setData(Arrays.asList(
                                new MarkPointDataItem()
                                        .setType("max")
                                        .setName("Max"),
                                new MarkPointDataItem()
                                        .setType("min")
                                        .setName("Min"))))
                .setMarkLine(new MarkLine()
                        .setData(Arrays.asList(
                                new MarkLine1DDataItem()
                                        .setType("average")
                                        .setName("Avg"))));

        LineSeries series2 = new LineSeries()
                .setName("Lowest")
                .setType("line")
                .setData(Arrays.asList(1, -2, 2, 5, 3, 2, 0))
                .setMarkPoint(new MarkPoint()
                        .setData(Arrays.asList(new MarkPointDataItem()
                                .setName("周最低")
                                .setValue(-2)
                                .setXAxis(new EChartsNumber(1))
                                .setYAxis(new EChartsNumber(-1.5)))))
                .setMarkLine(new MarkLine()
                        .setData(Arrays.asList(
                                new MarkLine1DDataItem()
                                        .setType("average")
                                        .setName("Avg"),
                                new MarkLine2DDataItem()
                                        .setStartPoint(new MarkLine2DDataItemDim()
                                                .setSymbol("none")
                                                .setX(new EChartsNumber("90%"))
                                                .setYAxis(new EChartsNumber("max")))
                                        .setEndPoint(new MarkLine2DDataItemDim()
                                                .setSymbol("circle")
                                                .setLabel(new SeriesLineLabel()
                                                        .setPosition("start")
                                                        .setFormatter("Max"))
                                                .setType("max")
                                                .setName("最高点")))));

        Option option = new Option()
                .setTitle(title)
                .setTooltip(tooltip)
                .setLegend(legend)
                .setToolbox(toolbox)
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(Arrays.asList(series1, series2));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/temperature-change-in-the-coming-week.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
