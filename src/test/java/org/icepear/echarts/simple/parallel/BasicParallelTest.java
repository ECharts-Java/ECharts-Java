package org.icepear.echarts.simple.parallel;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Parallel;
import org.icepear.echarts.charts.parallel.ParallelSeries;
import org.icepear.echarts.components.series.LineStyle;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicParallelTest {
    @Test
    public void testBasicParallel() {
        Parallel parallel = new Parallel()
                .addParallelAxis("Price", 0)
                .addParallelAxis("Net Weight", 1)
                .addParallelAxis("Amount", 2)
                .addParallelAxis("Score", 3, new String[] { "Excellent", "Good", "OK", "Bad" })
                .addSeries(new ParallelSeries()
                        .setLineStyle(new LineStyle().setWidth(4))
                        .setData(new Object[][] {
                                { 12.99, 100, 82, "Good" },
                                { 9.99, 80, 77, "OK" },
                                { 20, 120, 60, "Excellent" }
                        }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/parallel/basic-parallel.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(parallel.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(parallel.getOption()));
    }
}
