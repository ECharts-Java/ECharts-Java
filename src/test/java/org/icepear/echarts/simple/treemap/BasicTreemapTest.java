package org.icepear.echarts.simple.treemap;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import org.icepear.echarts.Treemap;
import org.icepear.echarts.charts.treemap.TreemapSeries;
import org.icepear.echarts.charts.treemap.TreemapSeriesNodeItem;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class BasicTreemapTest {
    @Test
    public void testBasicTreemap() {
        TreemapSeriesNodeItem[] nodeAChildren = new TreemapSeriesNodeItem[] {
                new TreemapSeriesNodeItem().setName("nodeAa").setValue(4),
                new TreemapSeriesNodeItem().setName("nodeAb").setValue(6)
        };
        TreemapSeriesNodeItem[] data = new TreemapSeriesNodeItem[] {
                new TreemapSeriesNodeItem().setName("nodeA").setValue(10).setChildren(nodeAChildren),
                new TreemapSeriesNodeItem().setName("nodeB").setValue(20).setChildren(
                        new TreemapSeriesNodeItem[] {
                                new TreemapSeriesNodeItem().setName("nodeBa").setValue(20).setChildren(
                                        new TreemapSeriesNodeItem[] {
                                                new TreemapSeriesNodeItem().setName("nodeBa1").setValue(20)
                                        })
                        })
        };
        Treemap treemap = new Treemap()
                .addSeries(new TreemapSeries().setData(data).setType("treemap"));
        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/advanced/treemap/basic-treemap-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(treemap.getOption());
        assertEquals(expected, actual);
    }
}
