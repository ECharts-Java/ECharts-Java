package org.icepear.echarts.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.ItemStyle;
import org.icepear.echarts.component.LineSeries;
import org.icepear.echarts.component.LineStyle;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.serializer.EChartSerializer;
import org.junit.Test;

public class LineStyleAndItemStyleTest {
    @Test
    public void testLineStyleAndItemStyle() {
        CategoryAxis xAxis = new CategoryAxis()
                .setType("category")
                .setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));

        ValueAxis yAxis = new ValueAxis().setType("value");

        LineSeries series = new LineSeries()
                .setData(Arrays.asList(120, 200, 150, 80, 70, 110, 130))
                .setType("line")
                .setSymbol("triangle")
                .setSymbolSize(20)
                .setLineStyle(new LineStyle()
                        .setColor("#5470C6")
                        .setWidth(4)
                        .setType("dashed"))
                .setItemStyle(new ItemStyle()
                        .setBorderWidth(3)
                        .setBorderColor("#EE6666")
                        .setColor("yellow"));

        Option option = new Option()
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(Arrays.asList(series));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/line-style-and-item-style.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
