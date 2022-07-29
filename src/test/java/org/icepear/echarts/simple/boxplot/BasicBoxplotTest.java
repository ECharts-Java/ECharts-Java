package org.icepear.echarts.simple.boxplot;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Boxplot;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicBoxplotTest {
    @Test
    public void testBasicBoxplot() {
        Boxplot boxplot = new Boxplot()
                .setTooltip("item")
                .addXAxis(new String[] { "expr 0", "expr 1", "expr 2", "expr 3", "expr 4" })
                .addYAxis()
                .addSeries(new Number[][] {
                        { 650, 850, 940, 980, 1070 },
                        { 760, 800, 845, 890, 960 },
                        { 620, 840, 855, 880, 970 },
                        { 720, 765, 815, 870, 920 },
                        { 740, 805, 810, 870, 950 }
                });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/boxplot/basic-boxplot.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(boxplot.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(boxplot.getOption()));
    }
}
