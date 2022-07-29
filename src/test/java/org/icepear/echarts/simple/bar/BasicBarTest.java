package org.icepear.echarts.simple.bar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Bar;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicBarTest {
    @Test
    public void testBasicBar() {
        Bar bar = new Bar()
                .addXAxis(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" })
                .addYAxis()
                .addSeries(new Number[] { 120, 200, 150, 80, 70, 110, 130 });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/bar/basic-bar.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(bar.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(bar.getOption()));
    }
}
