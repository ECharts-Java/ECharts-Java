package org.icepear.echarts.simple.pie;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Pie;
import org.icepear.echarts.charts.pie.PieDataItem;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicPieTest {
    @Test
    public void testBasicPie() {
        Pie pie = new Pie()
                .setTitle("Basic Pie")
                .setTooltip("item")
                .setLegend()
                .addSeries(new PieDataItem[] {
                        new PieDataItem().setValue(1048).setName("Search Engine"),
                        new PieDataItem().setValue(735).setName("Direct"),
                        new PieDataItem().setValue(580).setName("Email"),
                        new PieDataItem().setValue(484).setName("Union Ads"),
                        new PieDataItem().setValue(300).setName("Video Ads")
                });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/pie/basic-pie.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(pie.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(pie.getOption()));
    }
}
