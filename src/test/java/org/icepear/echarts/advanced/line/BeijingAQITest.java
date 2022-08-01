package org.icepear.echarts.advanced.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.components.dataZoom.DataZoom;
import org.icepear.echarts.components.grid.Grid;
import org.icepear.echarts.components.marker.MarkLine;
import org.icepear.echarts.components.marker.MarkLine1DDataItem;
import org.icepear.echarts.components.series.LineStyle;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.toolbox.Toolbox;
import org.icepear.echarts.components.toolbox.ToolboxDataZoomFeature;
import org.icepear.echarts.components.toolbox.ToolboxRestoreFeature;
import org.icepear.echarts.components.toolbox.ToolboxSaveAsImageFeature;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.components.visualMap.PiecewiseVisualMap;
import org.icepear.echarts.components.visualMap.VisualPiece;
import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BeijingAQITest {
    private JsonArray getData() {
        Reader reader = new InputStreamReader(this.getClass().getResourceAsStream("/mock/aqi-beijing.json"));
        JsonElement data = JsonParser.parseReader(reader);
        return data.getAsJsonArray();
    }

    @Test
    public void testBeijingAQI() {
        JsonArray data = getData();
        int size = data.size();
        String[] xAxisData = new String[size];
        Number[] seriesData = new Number[size];

        for (int i = 0; i < size; i++) {
            xAxisData[i] = data.get(i).getAsJsonArray().get(0).getAsString();
            seriesData[i] = data.get(i).getAsJsonArray().get(1).getAsNumber();
        }

        Title title = new Title()
                .setText("Beijing AQI")
                .setLeft("1%");

        Tooltip tooltip = new Tooltip()
                .setTrigger("axis");

        Grid grid = new Grid()
                .setLeft("5%")
                .setRight("15%")
                .setBottom("10%");

        CategoryAxis xAxis = new CategoryAxis().setType(null).setData(xAxisData);

        ValueAxis yAxis = new ValueAxis().setType(null);

        Toolbox toolbox = new Toolbox().setRight(10).setFeature(new HashMap<String, ToolboxFeatureOption>() {
            {
                put("dataZoom", new ToolboxDataZoomFeature().setYAxisIndex("none"));
                put("restore", new ToolboxRestoreFeature());
                put("saveAsImage", new ToolboxSaveAsImageFeature());
            }
        });

        DataZoom dataZoom1 = new DataZoom().setStartValue("2014-06-01");

        DataZoom dataZoom2 = new DataZoom().setType("inside");

        VisualPiece visualPieces1 = new VisualPiece()
                .setGt(0)
                .setLte(50)
                .setColor("#93CE07");

        VisualPiece visualPieces2 = new VisualPiece()
                .setGt(50)
                .setLte(100)
                .setColor("#FBDB0F");

        VisualPiece visualPieces3 = new VisualPiece()
                .setGt(100)
                .setLte(150)
                .setColor("#FC7D02");

        VisualPiece visualPieces4 = new VisualPiece()
                .setGt(150)
                .setLte(200)
                .setColor("#FD0100");

        VisualPiece visualPieces5 = new VisualPiece()
                .setGt(200)
                .setLte(300)
                .setColor("#AA069F");

        VisualPiece visualPieces6 = new VisualPiece()
                .setGt(300)
                .setColor("#AC3B2A");

        PiecewiseVisualMap visualMap = new PiecewiseVisualMap()
                .setTop(50)
                .setRight(10)
                .setPieces(new VisualPiece[] { visualPieces1, visualPieces2, visualPieces3, visualPieces4,
                        visualPieces5, visualPieces6 });

        MarkLine1DDataItem dataItem1 = new MarkLine1DDataItem().setYAxis(50);
        MarkLine1DDataItem dataItem2 = new MarkLine1DDataItem().setYAxis(100);
        MarkLine1DDataItem dataItem3 = new MarkLine1DDataItem().setYAxis(150);
        MarkLine1DDataItem dataItem4 = new MarkLine1DDataItem().setYAxis(200);
        MarkLine1DDataItem dataItem5 = new MarkLine1DDataItem().setYAxis(300);
        MarkLine1DDataItem[] markLineData = {
                dataItem1, dataItem2, dataItem3, dataItem4, dataItem5
        };

        LineSeries series = new LineSeries()
                .setName("Beijing AQI")
                .setType("line")
                .setData(seriesData)
                .setMarkLine(new MarkLine()
                        .setSilent(true)
                        .setLineStyle(new LineStyle().setColor("#333"))
                        .setData(markLineData));

        Option option = new Option()
                .setTitle(title)
                .setTooltip(tooltip)
                .setGrid(grid)
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setToolbox(toolbox)
                .setDataZoom(new DataZoom[] { dataZoom1, dataZoom2 })
                .setVisualMap(visualMap)
                .setSeries(new SeriesOption[] { series });

        Reader reader = new InputStreamReader(this.getClass().getResourceAsStream("/advanced/line/beijing-aqi.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}