package org.icepear.echarts.bar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.BarSeries;
import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.component.XAxis;
import org.icepear.echarts.component.YAxis;
import org.icepear.echarts.serializer.EChartSerializer;
import org.junit.Test;

public class BasicBarTest {
    @Test
    public void testBasicBar() {
        CategoryAxis xCategoryAxis = new CategoryAxis();
        xCategoryAxis.setType("category");
        xCategoryAxis.setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
        XAxis xAxis = new XAxis();
        xAxis.setAxisBaseOption(xCategoryAxis);

        ValueAxis yValueAxis = new ValueAxis();
        yValueAxis.setType("value");
        YAxis yAxis = new YAxis();
        yAxis.setAxisBaseOption(yValueAxis);

        BarSeries series = new BarSeries();
        series.setData(Arrays.asList(120, 200, 150, 80, 70, 110, 130));
        series.setType("bar");

        Option option = new Option();
        option.setXAxis(Arrays.asList(xAxis));
        option.setYAxis(Arrays.asList(yAxis));
        option.setSeries(Arrays.asList(series));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/bar/basic-bar.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
