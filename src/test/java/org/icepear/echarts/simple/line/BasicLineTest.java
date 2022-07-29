package org.icepear.echarts.simple.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Line;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicLineTest {
    @Test
    public void testBasicLine() {
        Line line = new Line()
                .addXAxis(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" })
                .addYAxis()
                .addSeries(new Number[] { 150, 230, 224, 218, 135, 147, 260 });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/line/basic-line.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(line.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(line.getOption()));
    }
}
