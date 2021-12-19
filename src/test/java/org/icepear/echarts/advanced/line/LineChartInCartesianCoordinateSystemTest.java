package org.icepear.echarts.advanced.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.components.coord.cartesian.DefaultAxis;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartSerializer;
import org.junit.Test;

public class LineChartInCartesianCoordinateSystemTest {
    @Test
    public void testLineChartInCartesianCoordinateSystem() {
        DefaultAxis xAxis = new DefaultAxis();

        DefaultAxis yAxis = new DefaultAxis();

        LineSeries series = new LineSeries()
                .setData(new Number[][] {
                        { 10, 40 },
                        { 50, 100 },
                        { 40, 20 } })
                .setType("line");

        Option option = new Option()
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(new SeriesOption[] { series });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/line-chart-in-cartesian-coordinate-system.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
