package org.icepear.echarts.simple.bar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Bar;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class MultipleSeriesBarTest {
    @Test
    public void testMultipleSeriesBar() {
        Bar bar = new Bar()
                .setLegend()
                .setTooltip("item")
                .addXAxis(new String[] { "Matcha Latte", "Milk Tea", "Cheese Cocoa", "Walnut Brownie" })
                .addYAxis()
                .addSeries("2015", new Number[] { 43.3, 83.1, 86.4, 72.4 })
                .addSeries("2016", new Number[] { 85.8, 73.4, 65.2, 53.9 })
                .addSeries("2017", new Number[] { 93.7, 55.1, 82.5, 39.1 });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/bar/multiple-series-bar.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(bar.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(bar.getOption()));
    }
}
