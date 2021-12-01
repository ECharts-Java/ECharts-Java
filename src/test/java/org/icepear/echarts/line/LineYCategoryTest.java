package org.icepear.echarts.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.Axis;
import org.icepear.echarts.component.LineSeries;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.serializer.EChartSerializer;
import org.junit.Test;

public class LineYCategoryTest {
    @Test
    public void testLineYCategory() {
        Axis xAxis = new Axis();

        Axis yAxis = new Axis();

        LineSeries series = new LineSeries()
                .setData(Arrays.asList(
                        Arrays.asList(10, 40),
                        Arrays.asList(50, 100),
                        Arrays.asList(40, 20)))
                .setType("line");

        Option option = new Option()
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(Arrays.asList(series));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/line-y-category.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
