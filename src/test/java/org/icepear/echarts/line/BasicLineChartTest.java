package org.icepear.echarts.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.LineSeries;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.serializer.EChartSerializer;
import org.junit.Test;

public class BasicLineChartTest {
    @Test
    public void testBasicLineChart() {
        CategoryAxis xAxis = new CategoryAxis()
                .setType("category")
                .setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));

        ValueAxis yAxis = new ValueAxis().setType("value");

        LineSeries series = new LineSeries()
                .setData(Arrays.asList(150, 230, 224, 218, 135, 147, 260))
                .setType("line");

        Option option = new Option()
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(Arrays.asList(series));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/basic-line-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}