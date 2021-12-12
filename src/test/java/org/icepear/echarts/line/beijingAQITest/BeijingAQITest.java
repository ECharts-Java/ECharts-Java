package org.icepear.echarts.line.beijingAQITest;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.stream.JsonReader;

import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.DataZoom;
import org.icepear.echarts.component.Grid;
import org.icepear.echarts.component.LineSeries;
import org.icepear.echarts.component.LineStyle;
import org.icepear.echarts.component.MarkLine;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.PiecewiseVisualMap;
import org.icepear.echarts.component.Title;
import org.icepear.echarts.component.Toolbox;
import org.icepear.echarts.component.ToolboxDataZoomFeature;
import org.icepear.echarts.component.ToolboxRestoreFeature;
import org.icepear.echarts.component.ToolboxSaveAsImageFeature;
import org.icepear.echarts.component.Tooltip;
import org.junit.Test;

public class BeijingAQITest {

	private static final String path = "src/test/data/aqi-beijing.json";

	private AQIData readDTO(JsonReader reader) throws IOException {
		reader.beginArray();
		List<String> tempStr = new ArrayList<>();
		while(reader.hasNext()) {
			tempStr.add(reader.nextString());
		}
		reader.endArray();
		return new AQIData(tempStr.get(0), Integer.parseInt(tempStr.get(1)));
	}

    private Number[] getSeriesData() throws IOException{
		List<Number> resList = new ArrayList<>();
		try (
			InputStream inputStream = Files.newInputStream(Path.of(path));
			JsonReader reader = new JsonReader(new InputStreamReader(inputStream));
		) {
			reader.beginArray();
			while(reader.hasNext()) {
				AQIData dto = readDTO(reader);
				resList.add(dto.getAqi());
			}
			reader.endArray();
		}
		Number[] res = resList.toArray(new Number[resList.size()]);
		return res;
	}

    @Test
    public void testBeijingAQI() {
        Title title = new Title()
                .setText("Beijing AQI")
                .setLeft("1%");
        Tooltip tooltip = new Tooltip()
                .setTrigger("axis");
        Grid grid = new Grid()
                .setLeft("5%")
                .setRight("15%")
                .setBottom("10%");
        // axis not clear
        Map featureMap = new HashMap(); // weird
        featureMap.put("dataZoom", new ToolboxDataZoomFeature());
        featureMap.put("restore", new ToolboxRestoreFeature());
        featureMap.put("saveAsImage", new ToolboxSaveAsImageFeature());
        Toolbox toolbox = new Toolbox().setRight(10).setFeature(featureMap);
        DataZoom dataZoomEle1 = new DataZoom().setStartValue("2014-06-01");
        DataZoom dataZoomEle2 = new DataZoom().setType("inside");
        // outofrange not implemented
        // piecewise/continuous => visualmap ?
        PiecewiseVisualMap visualMap = new PiecewiseVisualMap().setTop(50).setRight(10);
		Number[] data = {};
		try {
			data = getSeriesData();
		} catch (Exception e) {
			System.out.println(e);
		}
        // LineSeries series = new LineSeries().setName("Beijing AQI").setType("line").setData(data).setMarkLine(
        //         new MarkLine().setSilent(true).setLineStyle(new LineStyle().setColor("#333")).setData(markLineData));
        Option option = new Option().setDataZoom(Arrays.asList(dataZoomEle1, dataZoomEle2));

    }

}