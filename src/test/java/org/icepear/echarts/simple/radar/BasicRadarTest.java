package org.icepear.echarts.simple.radar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Radar;
import org.icepear.echarts.charts.radar.RadarDataItem;
import org.icepear.echarts.components.coord.radar.RadarIndicator;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicRadarTest {
    @Test
    public void testBasicRadar() {
        Radar radar = new Radar()
                .setTitle("Basic Radar")
                .setLegend()
                .setRadarAxis(new RadarIndicator[] {
                        new RadarIndicator().setName("Sales").setMax(6500),
                        new RadarIndicator().setName("Administration").setMax(16000),
                        new RadarIndicator().setName("Information Technology").setMax(30000),
                        new RadarIndicator().setName("Customer Support").setMax(38000),
                        new RadarIndicator().setName("Development").setMax(52000),
                        new RadarIndicator().setName("Marketing").setMax(25000) })
                .addSeries(new RadarDataItem[] {
                        new RadarDataItem()
                                .setValue(new Number[] { 4200, 3000, 20000, 35000, 50000, 18000 })
                                .setName("Allocated Budget"),
                        new RadarDataItem()
                                .setValue(new Number[] { 5000, 14000, 28000, 26000, 42000, 21000 })
                                .setName("Actual Spending") });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/radar/basic-radar.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(radar.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(radar.getOption()));
    }
}
