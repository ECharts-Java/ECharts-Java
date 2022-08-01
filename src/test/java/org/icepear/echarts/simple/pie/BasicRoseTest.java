package org.icepear.echarts.simple.pie;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Pie;
import org.icepear.echarts.charts.pie.PieDataItem;
import org.icepear.echarts.charts.pie.PieItemStyle;
import org.icepear.echarts.charts.pie.PieSeries;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicRoseTest {
    @Test
    public void testBasicRose() {
        Pie pie = new Pie()
                .setLegend()
                .addSeries(new PieSeries()
                        .setRadius(new Number[] { 50, 250 })
                        .setRoseType("area")
                        .setItemStyle(new PieItemStyle().setBorderRadius(8))
                        .setData(new PieDataItem[] {
                                new PieDataItem().setValue(40).setName("rose 1"),
                                new PieDataItem().setValue(38).setName("rose 2"),
                                new PieDataItem().setValue(32).setName("rose 3"),
                                new PieDataItem().setValue(30).setName("rose 4"),
                                new PieDataItem().setValue(28).setName("rose 5"),
                                new PieDataItem().setValue(26).setName("rose 6"),
                                new PieDataItem().setValue(22).setName("rose 7"),
                                new PieDataItem().setValue(18).setName("rose 8")
                        }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/pie/basic-rose.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(pie.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(pie.getOption()));
    }
}
