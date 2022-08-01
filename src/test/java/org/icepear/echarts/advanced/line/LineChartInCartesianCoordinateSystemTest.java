package org.icepear.echarts.advanced.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.line.LineSeries;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class LineChartInCartesianCoordinateSystemTest {
    @Test
    public void testLineChartInCartesianCoordinateSystem() {
        CategoryAxis xAxis = new CategoryAxis().setType(null);

        ValueAxis yAxis = new ValueAxis().setType(null);

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

        Reader reader = new InputStreamReader(this.getClass()
                .getResourceAsStream("/advanced/line/line-chart-in-cartesian-coordinate-system.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
