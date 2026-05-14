package org.icepear.echarts.simple.map;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.MapChart;
import org.icepear.echarts.charts.map.MapDataItem;
import org.icepear.echarts.charts.map.MapSeries;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicMapTest {

    @Test
    public void testBasicMap() {
        MapDataItem[] data = new MapDataItem[] {
                new MapDataItem().setName("California").setValue(393),
                new MapDataItem().setName("Texas").setValue(295),
                new MapDataItem().setName("New York").setValue(202)
        };
        MapChart chart = new MapChart()
                .addSeries(new MapSeries().setMap("USA").setRoam(true).setData(data));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/map/basic-map.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(chart.getOption());
        assertEquals(expected, actual);
    }
}
