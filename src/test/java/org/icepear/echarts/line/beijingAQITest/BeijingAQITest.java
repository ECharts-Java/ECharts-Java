package org.icepear.echarts.line.beijingAQITest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.DataZoom;
import org.icepear.echarts.component.DefaultAxis;
import org.icepear.echarts.component.Grid;
import org.icepear.echarts.component.LineSeries;
import org.icepear.echarts.component.LineStyle;
import org.icepear.echarts.component.MarkLine;
import org.icepear.echarts.component.MarkLine1DDataItem;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.PiecewiseVisualMap;
import org.icepear.echarts.component.Title;
import org.icepear.echarts.component.Toolbox;
import org.icepear.echarts.component.ToolboxDataZoomFeature;
import org.icepear.echarts.component.ToolboxRestoreFeature;
import org.icepear.echarts.component.ToolboxSaveAsImageFeature;
import org.icepear.echarts.component.Tooltip;
import org.icepear.echarts.component.VisualPiece;
import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.serializer.EChartSerializer;
import org.junit.Test;

public class BeijingAQITest {

    private static final String path = "src/test/mock/aqi-beijing.json";

    private AQIData readDTO(JsonReader reader) throws IOException {
        reader.beginArray();
        List<String> tempStr = new ArrayList<>();
        while (reader.hasNext()) {
            tempStr.add(reader.nextString());
        }
        reader.endArray();
        return new AQIData(tempStr.get(0), Integer.parseInt(tempStr.get(1)));
    }

    private List<AQIData> getData() throws IOException {
        List<AQIData> resList = new ArrayList<>();
        try (
                InputStream inputStream = Files.newInputStream(Path.of(path));
                JsonReader reader = new JsonReader(new InputStreamReader(inputStream));) {
            reader.beginArray();
            while (reader.hasNext()) {
                AQIData dto = readDTO(reader);
                resList.add(dto);
            }
            reader.endArray();
        }
        return resList;
    }

    @Test
    public void testBeijingAQI() {

        List<AQIData> data = new ArrayList<>();
        try {
            data = getData();
        } catch (Exception e) {
            System.out.println(e);
        }
        int size = data.size();
        String[] xAxisData = new String[size];
        Number[] seriesData = new Number[size];

        for (int i = 0; i < size; i++) {
            xAxisData[i] = data.get(i).getDate();
            seriesData[i] = data.get(i).getAqi();
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

        CategoryAxis xAxis = new CategoryAxis().setData(xAxisData);

        DefaultAxis yAxis = new DefaultAxis();
        Map<String, ToolboxFeatureOption> featureMap = new HashMap<>() {
            {
                put("dataZoom", new ToolboxDataZoomFeature().setYAxisIndex("none"));
                put("restore", new ToolboxRestoreFeature());
                put("saveAsImage", new ToolboxSaveAsImageFeature());
            }
        };
        Toolbox toolbox = new Toolbox().setRight(10).setFeature(featureMap);
        DataZoom dataZoomEle1 = new DataZoom().setStartValue("2014-06-01");
        DataZoom dataZoomEle2 = new DataZoom().setType("inside");
        DataZoom[] dataZoom = { dataZoomEle1, dataZoomEle2 };

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
        VisualPiece[] pieces = {
                visualPieces1, visualPieces2, visualPieces3, visualPieces4, visualPieces5, visualPieces6 };

        PiecewiseVisualMap visualMap = new PiecewiseVisualMap()
                .setTop(50)
                .setRight(10)
                .setPieces(pieces);

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
                .setMarkLine(
                        new MarkLine()
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
                .setDataZoom(dataZoom)
                .setVisualMap(visualMap)
                .setSeries(series);

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/beijing-aqi.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));

    }

}