package org.icepear.echarts.advanced.pie;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.pie.PieDataItem;
import org.icepear.echarts.charts.pie.PieLabel;
import org.icepear.echarts.charts.pie.PieSeries;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class PieLabelAlignTest {
    @Test
    public void testPieLabelAlign() {
        PieDataItem[] data = new PieDataItem[] {
                new PieDataItem().setName("Apples").setValue(70),
                new PieDataItem().setName("Strawberries").setValue(68),
                new PieDataItem().setName("Bananas").setValue(48),
                new PieDataItem().setName("Oranges").setValue(40),
                new PieDataItem().setName("Pears").setValue(32),
                new PieDataItem().setName("Pineapples").setValue(27),
                new PieDataItem().setName("Grapes").setValue(18) };

        Title[] title = new Title[] {
                new Title()
                        .setText("Pie label alignTo")
                        .setLeft("center"),
                new Title()
                        .setSubtext("alignTo: \"none\" (default)")
                        .setLeft("16.67%")
                        .setTop("75%")
                        .setTextAlign("center"),
                new Title()
                        .setSubtext("alignTo: \"labelLine\"")
                        .setLeft("50%")
                        .setTop("75%")
                        .setTextAlign("center"),
                new Title()
                        .setSubtext("alignTo: \"edge\"")
                        .setLeft("83.33%")
                        .setTop("75%")
                        .setTextAlign("center") };

        PieSeries series1 = new PieSeries()
                .setType("pie")
                .setRadius("25%")
                .setCenter(new String[] { "50%", "50%" })
                .setData(data)
                .setLabel(new PieLabel()
                        .setPosition("outer")
                        .setAlignTo("none")
                        .setBleedMargin(5))
                .setLeft(0)
                .setRight("66.6667%")
                .setTop(0)
                .setBottom(0);

        PieSeries series2 = new PieSeries()
                .setType("pie")
                .setRadius("25%")
                .setCenter(new String[] { "50%", "50%" })
                .setData(data)
                .setLabel(new PieLabel()
                        .setPosition("outer")
                        .setAlignTo("labelLine")
                        .setBleedMargin(5))
                .setLeft("33.3333%")
                .setRight("33.3333%")
                .setTop(0)
                .setBottom(0);

        PieSeries series3 = new PieSeries()
                .setType("pie")
                .setRadius("25%")
                .setCenter(new String[] { "50%", "50%" })
                .setData(data)
                .setLabel(new PieLabel()
                        .setPosition("outer")
                        .setAlignTo("edge")
                        .setMargin(20))
                .setLeft("66.6667%")
                .setRight(0)
                .setTop(0)
                .setBottom(0);

        Option option = new Option()
                .setTitle(title)
                .setSeries(new SeriesOption[] { series1, series2, series3 });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/pie/pie-label-align.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
