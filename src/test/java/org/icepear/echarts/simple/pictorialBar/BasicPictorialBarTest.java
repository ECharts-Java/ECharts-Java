package org.icepear.echarts.simple.pictorialBar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.PictorialBar;
import org.icepear.echarts.charts.pictorialBar.PictorialBarSeries;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicPictorialBarTest {

    @Test
    public void testBasicPictorialBar() {
        PictorialBar chart = new PictorialBar()
                .addXAxis(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri" })
                .addYAxis()
                .addSeries(new PictorialBarSeries()
                        .setSymbol("circle")
                        .setSymbolRepeat(true)
                        .setSymbolSize(new Number[] { 16, 16 })
                        .setSymbolMargin("10%")
                        .setData(new Number[] { 8000, 9500, 12000, 11000, 15000 }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/pictorialBar/basic-pictorial-bar.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(chart.getOption());
        assertEquals(expected, actual);
    }
}
