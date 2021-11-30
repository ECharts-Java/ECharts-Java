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
import org.icepear.echarts.component.Axis;
import org.icepear.echarts.serializer.EChartSerializer;
import org.junit.Test;

public class BasicAreaChartTest {
    @Test
    public void testBasicAreaChart() {
        Axis xAxis = new Axis()
                .setAxisBaseOption(new CategoryAxis()
                        .setType("category")
                        .setBoundaryGap(false)
                        .setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")));

        Axis yAxis = new Axis()
                .setAxisBaseOption(new ValueAxis()
                        .setType("value"));

        LineSeries series = new LineSeries()
                .setData(Arrays.asList(820, 932, 901, 934, 1290, 1330, 1320))
                .setType("line")
                .setAreaStyle(new AreaStyle());

        Option option = new Option()
                .setXAxis(Arrays.asList(xAxis))
                .setYAxis(Arrays.asList(yAxis))
                .setSeries(Arrays.asList(series));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/basic-area-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
