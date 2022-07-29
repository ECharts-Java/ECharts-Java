package org.icepear.echarts.simple.pie;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Pie;
import org.icepear.echarts.charts.pie.PieDataItem;
import org.icepear.echarts.charts.pie.PieLabel;
import org.icepear.echarts.charts.pie.PieSeries;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class NestedPieTest {
    @Test
    public void testNestedPie() {
        Pie pie = new Pie()
                .setTooltip("item")
                .setLegend()
                .addSeries(new PieSeries()
                        .setSelectedMode("single")
                        .setRadius(new String[] { "0", "30%" })
                        .setLabel(new PieLabel().setPosition("inner"))
                        .setData(new PieDataItem[] {
                                new PieDataItem().setValue(1548).setName("Search Engine"),
                                new PieDataItem().setValue(775).setName("Direct"),
                                new PieDataItem().setValue(679).setName("Marketing").setSelected(true)
                        }))
                .addSeries(new PieSeries()
                        .setRadius(new String[] { "45%", "60%" })
                        .setData(new PieDataItem[] {
                                new PieDataItem().setValue(1048).setName("Baidu"),
                                new PieDataItem().setValue(335).setName("Direct"),
                                new PieDataItem().setValue(310).setName("Email"),
                                new PieDataItem().setValue(251).setName("Google"),
                                new PieDataItem().setValue(234).setName("Union Ads"),
                                new PieDataItem().setValue(147).setName("Bing"),
                                new PieDataItem().setValue(135).setName("Video Ads"),
                                new PieDataItem().setValue(102).setName("Others")
                        }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/pie/nested-pie.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(pie.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(pie.getOption()));
    }
}
