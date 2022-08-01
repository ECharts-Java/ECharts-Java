package org.icepear.echarts.advanced.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.components.series.ItemStyle;
import org.icepear.echarts.components.series.LineStyle;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class LineStyleAndItemStyleTest {
    @Test
    public void testLineStyleAndItemStyle() {
        CategoryAxis xAxis = new CategoryAxis()
                .setType("category")
                .setData(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" });

        ValueAxis yAxis = new ValueAxis().setType("value");

        LineSeries series = new LineSeries()
                .setData(new Number[] { 120, 200, 150, 80, 70, 110, 130 })
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
                .setSeries(new SeriesOption[] { series });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/line/line-style-and-item-style.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
