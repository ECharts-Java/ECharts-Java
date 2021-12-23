package org.icepear.echarts.simple.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Line;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class MultipleSeriesLineTest {
    @Test
    public void testMultipleSeriesLine() {
        Line line = new Line()
                .setTitle("Multiple Series Line")
                .setTooltip("axis")
                .setLegend(true)
                .addXAxis(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" })
                .addYAxis()
                .addSeries("Email", new Number[] { 120, 132, 101, 134, 90, 230, 210 })
                .addSeries("Union Ads", new Number[] { 220, 182, 191, 234, 290, 330, 310 })
                .addSeries("Video Ads", new Number[] { 150, 232, 201, 154, 190, 330, 410 })
                .addSeries("Direct", new Number[] { 320, 332, 301, 334, 390, 330, 320 })
                .addSeries("Search Engine", new Number[] { 820, 932, 901, 934, 1290, 1330, 1320 });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/line/multiple-series-line.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartsSerializer.toJsonTree(line.getOption());
        assertEquals(expected, actual);

        // System.out.println(EChartsSerializer.toJson(line.getOption()));
    }
}
