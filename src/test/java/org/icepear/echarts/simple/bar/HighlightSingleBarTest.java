package org.icepear.echarts.simple.bar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Bar;
import org.icepear.echarts.charts.bar.BarDataItem;
import org.icepear.echarts.charts.bar.BarItemStyle;
import org.icepear.echarts.charts.bar.BarSeries;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class HighlightSingleBarTest {
    @Test
    public void testHighlightSingleBar() {
        Bar bar = new Bar()
                .addXAxis(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" })
                .addYAxis()
                .addSeries(new BarSeries().setData(new BarDataItem[] {
                        new BarDataItem().setValue(120),
                        new BarDataItem().setValue(200).setItemStyle(new BarItemStyle().setColor("#a90000")),
                        new BarDataItem().setValue(150),
                        new BarDataItem().setValue(80),
                        new BarDataItem().setValue(70),
                        new BarDataItem().setValue(110),
                        new BarDataItem().setValue(130)
                }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/bar/highlight-single-bar.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(bar.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(bar.getOption()));
    }
}
