package org.icepear.echarts.advanced.candlestick;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.candlestick.CandlestickSeries;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicCandlestickTest {
    @Test
    public void testBasicCandlestick() {
        CategoryAxis xAxis = new CategoryAxis()
                .setType(null)
                .setData(new String[] { "2017-10-24", "2017-10-25", "2017-10-26", "2017-10-27" });

        ValueAxis yAxis = new ValueAxis().setType(null);

        CandlestickSeries series = new CandlestickSeries()
                .setType("candlestick")
                .setData(new Number[][] {
                        { 20, 34, 10, 38 },
                        { 40, 35, 30, 50 },
                        { 31, 38, 33, 44 },
                        { 38, 15, 5, 42 } });

        Option option = new Option()
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(new SeriesOption[] { series });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/candlestick/basic-candlestick.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
