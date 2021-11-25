package org.icepear.echarts;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.LineSeries;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.component.XAxis;
import org.icepear.echarts.component.YAxis;
import org.icepear.echarts.serializer.XAxisSerializer;
import org.icepear.echarts.serializer.YAxisSerializer;
import org.junit.Test;

public class LineTest {
    @Test
    public void testBasicLineChart() {
        CategoryAxis xCategoryAxis = new CategoryAxis();
        xCategoryAxis.setType("category");
        xCategoryAxis.setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
        XAxis xAxis = new XAxis();
        xAxis.setAxisBaseOption(xCategoryAxis);

        ValueAxis yValueAxis = new ValueAxis();
        yValueAxis.setType("value");
        YAxis yAxis = new YAxis();
        yAxis.setAxisBaseOption(yValueAxis);

        LineSeries series = new LineSeries();
        series.setData(Arrays.asList(150, 230, 224, 218, 135, 147, 260));
        series.setType("line");

        Option option = new Option();
        option.setXAxis(Arrays.asList(xAxis));
        option.setYAxis(Arrays.asList(yAxis));
        option.setSeries(Arrays.asList(series));

        Gson gson = new GsonBuilder().registerTypeAdapter(XAxis.class, new XAxisSerializer())
                .registerTypeAdapter(YAxis.class, new YAxisSerializer()).create();

        Reader reader = new InputStreamReader(this.getClass().getResourceAsStream("reference/basic-line-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = gson.toJsonTree(option);
        assertEquals(expected, actual);
    }
}
