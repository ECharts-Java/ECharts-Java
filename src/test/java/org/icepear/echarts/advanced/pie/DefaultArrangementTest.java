package org.icepear.echarts.advanced.pie;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.pie.PieSeries;
import org.icepear.echarts.components.dataset.Dataset;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.series.Encode;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class DefaultArrangementTest {
    @Test
    public void testDefaultArrangement() {
        Legend legend = new Legend();

        Tooltip tooltip = new Tooltip();

        Dataset dataset = new Dataset().setSource(new Object[][] {
                { "product", "2012", "2013", "2014", "2015", "2016", "2017" },
                { "Milk Tea", 86.5, 92.1, 85.7, 83.1, 73.4, 55.1 },
                { "Matcha Latte", 41.1, 30.4, 65.1, 53.3, 83.8, 98.7 },
                { "Cheese Cocoa", 24.1, 67.2, 79.5, 86.4, 65.2, 82.5 },
                { "Walnut Brownie", 55.2, 67.1, 69.2, 72.4, 53.9, 39.1 } });

        PieSeries series1 = new PieSeries()
                .setType("pie")
                .setRadius("20%")
                .setCenter(new String[] { "25%", "30%" });

        PieSeries series2 = new PieSeries()
                .setType("pie")
                .setRadius("20%")
                .setCenter(new String[] { "75%", "30%" })
                .setEncode(new Encode()
                        .setItemName("product")
                        .setValue("2013"));

        PieSeries series3 = new PieSeries()
                .setType("pie")
                .setRadius("20%")
                .setCenter(new String[] { "25%", "75%" })
                .setEncode(new Encode()
                        .setItemName("product")
                        .setValue("2014"));

        PieSeries series4 = new PieSeries()
                .setType("pie")
                .setRadius("20%")
                .setCenter(new String[] { "75%", "75%" })
                .setEncode(new Encode()
                        .setItemName("product")
                        .setValue("2015"));

        Option option = new Option()
                .setLegend(legend)
                .setTooltip(tooltip)
                .setDataset(dataset)
                .setSeries(new SeriesOption[] { series1, series2, series3, series4 });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/pie/default-arrangement.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}