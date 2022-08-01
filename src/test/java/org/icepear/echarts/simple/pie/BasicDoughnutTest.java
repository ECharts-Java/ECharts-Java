package org.icepear.echarts.simple.pie;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Pie;
import org.icepear.echarts.charts.pie.PieDataItem;
import org.icepear.echarts.charts.pie.PieEmphasis;
import org.icepear.echarts.charts.pie.PieItemStyle;
import org.icepear.echarts.charts.pie.PieLabel;
import org.icepear.echarts.charts.pie.PieSeries;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicDoughnutTest {
    @Test
    public void testBasicDoughnut() {
        Pie pie = new Pie()
                .setTooltip("item")
                .setLegend()
                .addSeries(new PieSeries().setRadius(new String[] { "40%", "70%" })
                        .setItemStyle(new PieItemStyle()
                                .setBorderRadius(10)
                                .setBorderColor("#fff")
                                .setBorderWidth(2))
                        .setLabel(new PieLabel().setShow(false).setPosition("center"))
                        .setEmphasis(new PieEmphasis().setLabel(new PieLabel()
                                .setShow(true).setFontSize(40).setFontWeight("bold")))
                        .setData(new PieDataItem[] {
                                new PieDataItem().setValue(1048).setName("Search Engine"),
                                new PieDataItem().setValue(735).setName("Direct"),
                                new PieDataItem().setValue(580).setName("Email"),
                                new PieDataItem().setValue(484).setName("Union Ads"),
                                new PieDataItem().setValue(300).setName("Video Ads")
                        }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/pie/basic-doughnut.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(pie.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(pie.getOption()));
    }
}
