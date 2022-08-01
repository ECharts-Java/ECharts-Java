package org.icepear.echarts.simple.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Line;
import org.icepear.echarts.charts.line.LineAreaStyle;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.series.LineStyle;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class StackedAreaTest {
    private LineSeries createSeries(String name, Object[] data) {
        return new LineSeries()
                .setName(name)
                .setStack("Total")
                .setSmooth(true)
                .setLineStyle(new LineStyle().setWidth(0))
                .setShowSymbol(false)
                .setAreaStyle(new LineAreaStyle())
                .setData(data);
    }

    @Test
    public void testStackedArea() {
        Line line = new Line()
                .setTitle("Stacked Area")
                .setTooltip("axis")
                .setLegend()
                .addXAxis(new CategoryAxis().setBoundaryGap(false)
                        .setData(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" }))
                .addYAxis()
                .addSeries(createSeries("Line 1", new Number[] { 140, 232, 101, 264, 90, 340, 250 }))
                .addSeries(createSeries("Line 2", new Number[] { 120, 282, 111, 234, 220, 340, 310 }))
                .addSeries(createSeries("Line 3", new Number[] { 320, 132, 201, 334, 190, 130, 220 }))
                .addSeries(createSeries("Line 4", new Number[] { 220, 402, 231, 134, 190, 230, 120 }))
                .addSeries(createSeries("Line 5", new Number[] { 220, 302, 181, 234, 210, 290, 150 }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/line/stacked-area.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(line.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(line.getOption()));
    }
}
