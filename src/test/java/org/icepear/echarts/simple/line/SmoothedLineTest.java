package org.icepear.echarts.simple.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Line;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class SmoothedLineTest {
    @Test
    public void testSmoothedLine() {
        Line line = new Line()
                .addXAxis(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" })
                .addYAxis()
                .addSeries(new LineSeries()
                        .setData(new Number[] { 820, 932, 901, 934, 1290, 1330, 1320 })
                        .setSmooth(true));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/line/smoothed-line.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(line.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(line.getOption()));
    }
}
