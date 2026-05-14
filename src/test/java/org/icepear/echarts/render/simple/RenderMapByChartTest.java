package org.icepear.echarts.render.simple;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.icepear.echarts.Chart;
import org.icepear.echarts.MapChart;
import org.icepear.echarts.charts.map.MapDataItem;
import org.icepear.echarts.charts.map.MapSeries;
import org.icepear.echarts.render.Engine;
import org.junit.Before;
import org.junit.Test;

public class RenderMapByChartTest {
    private Chart<?, ?> chart;

    @Before
    public void constructChart() {
        MapDataItem[] data = new MapDataItem[] {
                new MapDataItem().setName("California").setValue(393),
                new MapDataItem().setName("Texas").setValue(295)
        };
        this.chart = new MapChart()
                .setTitle("USA Map")
                .addSeries(new MapSeries().setMap("USA").setRoam(true).setData(data));
    }

    @Test
    public void testRenderMapJsonOption() {
        Engine engine = new Engine();
        String json = engine.renderJsonOption(chart);
        assertNotNull(json);
        assertTrue("rendered json must include map series type", json.contains("\"type\":\"map\""));
        assertTrue("rendered json must include the configured map name", json.contains("\"map\":\"USA\""));
    }

    @Test
    public void testRenderMapHtml() {
        Engine engine = new Engine();
        String html = engine.renderHtml(chart);
        assertNotNull(html);
        assertTrue("rendered html must contain echarts setOption", html.contains("setOption"));
        assertTrue("rendered html must embed series json", html.contains("\"map\":\"USA\""));
    }
}
