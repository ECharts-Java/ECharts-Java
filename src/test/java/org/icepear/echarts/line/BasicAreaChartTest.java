package org.icepear.echarts.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.AreaStyle;
import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.LineSeries;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.component.XAxis;
import org.icepear.echarts.component.YAxis;
import org.icepear.echarts.serializer.EChartSerializer;
import org.junit.Test;

public class BasicAreaChartTest {
    @Test
    public void testBasicAreaChart() {
        CategoryAxis xCategoryAxis = new CategoryAxis();
        xCategoryAxis.setType("category");
        xCategoryAxis.setBoundaryGap(false);
        xCategoryAxis.setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
        XAxis xAxis = new XAxis();
        xAxis.setAxisBaseOption(xCategoryAxis);

        ValueAxis yValueAxis = new ValueAxis();
        yValueAxis.setType("value");
        YAxis yAxis = new YAxis();
        yAxis.setAxisBaseOption(yValueAxis);

        LineSeries series = new LineSeries();
        series.setData(Arrays.asList(820, 932, 901, 934, 1290, 1330, 1320));
        series.setType("line");
        series.setAreaStyle(new AreaStyle());

        Option option = new Option();
        option.setXAxis(Arrays.asList(xAxis));
        option.setYAxis(Arrays.asList(yAxis));
        option.setSeries(Arrays.asList(series));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/basic-area-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
