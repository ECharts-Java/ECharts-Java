package org.icepear.echarts.simple.boxplot;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Boxplot;
import org.icepear.echarts.charts.boxplot.BoxplotSeries;
import org.icepear.echarts.charts.boxplot.BoxplotTransform;
import org.icepear.echarts.charts.boxplot.PrepareBoxplotData;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.dataset.Dataset;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class DataTransformBoxplotTest {
    @Test
    public void testDataTransformBoxplot() {
        Boxplot boxplot = new Boxplot()
                .addDataset(new Number[][] {
                        { 850, 740, 900, 1070, 930, 850, 950, 980, 980, 880, 1000, 980, 930, 650, 760, 810, 1000, 1000,
                                960, 960 },
                        { 960, 940, 960, 940, 880, 800, 850, 880, 900, 840, 830, 790, 810, 880, 880, 830, 800, 790, 760,
                                800 },
                        { 880, 880, 880, 860, 720, 720, 620, 860, 970, 950, 880, 910, 850, 870, 840, 840, 850, 840, 840,
                                840 },
                        { 890, 810, 810, 820, 800, 770, 760, 740, 750, 760, 910, 920, 890, 860, 880, 720, 840, 850, 850,
                                780 },
                        { 890, 840, 780, 810, 760, 810, 790, 810, 820, 850, 870, 870, 810, 740, 810, 940, 950, 800, 810,
                                870 }
                })
                .addDataset(new Dataset()
                        .setTransform(new BoxplotTransform()
                                .setConfig(new PrepareBoxplotData().setItemNameFormatter("expr {value}"))))
                .setTooltip("item")
                .addXAxis(new CategoryAxis())
                .addYAxis()
                .addSeries(new BoxplotSeries().setName("boxplot").setDatasetIndex(1));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/boxplot/data-transform-boxplot.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(boxplot.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(boxplot.getOption()));
    }
}
