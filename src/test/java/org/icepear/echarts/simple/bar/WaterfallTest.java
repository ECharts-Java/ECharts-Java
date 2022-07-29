package org.icepear.echarts.simple.bar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Bar;
import org.icepear.echarts.charts.bar.BarItemStyle;
import org.icepear.echarts.charts.bar.BarSeries;
import org.icepear.echarts.charts.bar.BarLabel;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class WaterfallTest {
    @Test
    public void testWaterfall() {
        Bar bar = new Bar()
                .setTitle("Waterfall")
                .addXAxis(new String[] { "Total", "Rent", "Utilities", "Transportation", "Meals", "Other" })
                .addYAxis()
                .addSeries(new BarSeries().setName("Placeholder").setStack("Total")
                        .setItemStyle(new BarItemStyle().setBorderColor("transparent").setColor("transparent"))
                        .setData(new Number[] { 0, 1700, 1400, 1200, 300, 0 }))
                .addSeries(new BarSeries().setName("Life Cost").setStack("Total")
                        .setLabel(new BarLabel().setShow(true).setPosition("inside"))
                        .setData(new Number[] { 2900, 1200, 300, 200, 900, 300 }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/bar/waterfall.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(bar.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(bar.getOption()));
    }
}
