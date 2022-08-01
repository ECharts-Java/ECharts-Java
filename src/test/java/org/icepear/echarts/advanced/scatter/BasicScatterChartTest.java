package org.icepear.echarts.advanced.scatter;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.scatter.ScatterSeries;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicScatterChartTest {
    @Test
    public void testBasicScatterChart() {
        ValueAxis xAxis = new ValueAxis().setType(null);

        CategoryAxis yAxis = new CategoryAxis().setType(null);

        ScatterSeries series = new ScatterSeries()
                .setSymbolSize(20)
                .setData(new Number[][] {
                        { 10.0, 8.04 },
                        { 8.07, 6.95 },
                        { 13.0, 7.58 },
                        { 9.05, 8.81 },
                        { 11.0, 8.33 },
                        { 14.0, 7.66 },
                        { 13.4, 6.81 },
                        { 10.0, 6.33 },
                        { 14.0, 8.96 },
                        { 12.5, 6.82 },
                        { 9.15, 7.2 },
                        { 11.5, 7.2 },
                        { 3.03, 4.23 },
                        { 12.2, 7.83 },
                        { 2.02, 4.47 },
                        { 1.05, 3.33 },
                        { 4.05, 4.96 },
                        { 6.03, 7.24 },
                        { 12.0, 6.26 },
                        { 12.0, 8.84 },
                        { 7.08, 5.82 },
                        { 5.02, 5.68 } })
                .setType("scatter");

        Option option = new Option()
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(new SeriesOption[] { series });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/scatter/basic-scatter-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
