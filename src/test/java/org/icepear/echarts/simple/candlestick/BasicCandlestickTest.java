package org.icepear.echarts.simple.candlestick;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Candlestick;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicCandlestickTest {
    @Test
    public void testBasicCandlestick() {
        Candlestick candlestick = new Candlestick()
                .addXAxis(new String[] { "2017-10-24", "2017-10-25", "2017-10-26", "2017-10-27" })
                .addYAxis()
                .addSeries(new Number[][] {
                        { 20, 34, 10, 38 },
                        { 40, 35, 30, 50 },
                        { 31, 38, 33, 44 },
                        { 38, 15, 5, 42 }
                });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/candlestick/basic-candlestick.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(candlestick.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(candlestick.getOption()));
    }
}
