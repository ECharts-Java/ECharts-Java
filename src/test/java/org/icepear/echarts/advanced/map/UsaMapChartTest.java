package org.icepear.echarts.advanced.map;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.MapChart;
import org.icepear.echarts.charts.map.MapDataItem;
import org.icepear.echarts.charts.map.MapEmphasis;
import org.icepear.echarts.charts.map.MapItemStyle;
import org.icepear.echarts.charts.map.MapSeries;
import org.icepear.echarts.components.series.SeriesLabel;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.components.visualMap.ContinousVisualMap;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

/**
 * Reproduces the official USA map example referenced in issue #100:
 * https://echarts.apache.org/examples/en/editor.html?c=map-usa
 */
public class UsaMapChartTest {

    @Test
    public void testUsaMapChart() {
        MapDataItem[] data = new MapDataItem[] {
                new MapDataItem().setName("Alabama").setValue(4822023),
                new MapDataItem().setName("Alaska").setValue(731449),
                new MapDataItem().setName("Arizona").setValue(6553255),
                new MapDataItem().setName("California").setValue(38041430),
                new MapDataItem().setName("Texas").setValue(26059203),
                new MapDataItem().setName("New York").setValue(19570261),
                new MapDataItem().setName("Puerto Rico").setValue(3667084)
        };

        MapSeries series = new MapSeries()
                .setName("USA PopEstimates")
                .setMap("USA")
                .setRoam(true)
                .setItemStyle(new MapItemStyle().setAreaColor("rgb(135, 169, 240)").setBorderColor("#fff"))
                .setEmphasis(new MapEmphasis()
                        .setLabel(new SeriesLabel().setShow(true))
                        .setItemStyle(new MapItemStyle().setAreaColor("rgb(177, 195, 245)")))
                .setData(data);

        ContinousVisualMap visualMap = new ContinousVisualMap()
                .setLeft("right")
                .setMin(500000)
                .setMax(38000000)
                .setText(new String[] { "High", "Low" })
                .setRealtime(false)
                .setCalculable(true)
                .setColor(new String[] { "orangered", "yellow", "lightskyblue" });

        MapChart chart = new MapChart()
                .setTitle(new Title().setText("USA Population Estimates (2012)").setLeft("right"))
                .setTooltip(new Tooltip().setTrigger("item").setShowDelay(0).setTransitionDuration(0.2))
                .setVisualMap(visualMap)
                .addSeries(series);

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/map/usa-map-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(chart.getOption());
        assertEquals(expected, actual);
    }
}
