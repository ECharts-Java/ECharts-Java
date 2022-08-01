package org.icepear.echarts.simple.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Line;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class StackedLineTest {
    @Test
    public void testMultipleSeriesLine() {
        Line line = new Line()
                .setTitle("Stacked Line")
                .setTooltip("axis")
                .setLegend()
                .addXAxis(new CategoryAxis()
                        .setBoundaryGap(false)
                        .setData(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" }))
                .addYAxis()
                .addSeries(new LineSeries().setName("Email").setStack("Total")
                        .setData(new Number[] { 120, 132, 101, 134, 90, 230, 210 }))
                .addSeries(new LineSeries().setName("Union Ads").setStack("Total")
                        .setData(new Number[] { 220, 182, 191, 234, 290, 330, 310 }))
                .addSeries(new LineSeries().setName("Video Ads").setStack("Total")
                        .setData(new Number[] { 150, 232, 201, 154, 190, 330, 410 }))
                .addSeries(new LineSeries().setName("Direct").setStack("Total")
                        .setData(new Number[] { 320, 332, 301, 334, 390, 330, 320 }))
                .addSeries(new LineSeries().setName("Search Engine").setStack("Total")
                        .setData(new Number[] { 820, 932, 901, 934, 1290, 1330, 1320 }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/line/stacked-line.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(line.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(line.getOption()));
    }
}
