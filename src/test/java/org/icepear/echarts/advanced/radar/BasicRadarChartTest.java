package org.icepear.echarts.advanced.radar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Option;
import org.icepear.echarts.charts.radar.RadarDataItem;
import org.icepear.echarts.charts.radar.RadarSeries;
import org.icepear.echarts.components.coord.radar.RadarAxis;
import org.icepear.echarts.components.coord.radar.RadarIndicator;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicRadarChartTest {
    @Test
    public void testBasicRadarChart() {
        Title title = new Title().setText("Basic Radar Chart");

        Legend legend = new Legend().setData(new String[] { "Allocated Budget", "Actual Spending" });

        RadarAxis radar = new RadarAxis().setIndicator(new RadarIndicator[] {
                new RadarIndicator().setName("Sales").setMax(6500),
                new RadarIndicator().setName("Administration").setMax(16000),
                new RadarIndicator().setName("Information Technology").setMax(30000),
                new RadarIndicator().setName("Customer Support").setMax(38000),
                new RadarIndicator().setName("Development").setMax(52000),
                new RadarIndicator().setName("Marketing").setMax(25000) });

        RadarSeries series = new RadarSeries()
                .setName("Budget vs spending")
                .setType("radar")
                .setData(new RadarDataItem[] {
                        new RadarDataItem()
                                .setValue(new Number[] { 4200, 3000, 20000, 35000, 50000, 18000 })
                                .setName("Allocated Budget"),
                        new RadarDataItem()
                                .setValue(new Number[] { 5000, 14000, 28000, 26000, 42000, 21000 })
                                .setName("Actual Spending") });

        Option option = new Option()
                .setTitle(title)
                .setLegend(legend)
                .setRadar(radar)
                .setSeries(new SeriesOption[] { series });

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/radar/basic-radar-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(option));
    }
}
