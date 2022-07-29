package org.icepear.echarts.simple.sankey;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Sankey;
import org.icepear.echarts.charts.sankey.SankeyEdgeItem;
import org.icepear.echarts.charts.sankey.SankeyEmphasis;
import org.icepear.echarts.charts.sankey.SankeyNodeItem;
import org.icepear.echarts.charts.sankey.SankeySeries;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicSankeyTest {
    @Test
    public void testBasicSankey() {
        Sankey sankey = new Sankey()
                .addSeries(new SankeySeries()
                        .setEmphasis(new SankeyEmphasis().setFocus("adjacency"))
                        .setData(new SankeyNodeItem[] {
                                new SankeyNodeItem().setName("a"),
                                new SankeyNodeItem().setName("b"),
                                new SankeyNodeItem().setName("a1"),
                                new SankeyNodeItem().setName("a2"),
                                new SankeyNodeItem().setName("b1"),
                                new SankeyNodeItem().setName("c")
                        })
                        .setLinks(new SankeyEdgeItem[] {
                                new SankeyEdgeItem().setSource("a").setTarget("a1").setValue(5),
                                new SankeyEdgeItem().setSource("a").setTarget("a2").setValue(3),
                                new SankeyEdgeItem().setSource("b").setTarget("b1").setValue(8),
                                new SankeyEdgeItem().setSource("a").setTarget("b1").setValue(3),
                                new SankeyEdgeItem().setSource("b1").setTarget("a1").setValue(1),
                                new SankeyEdgeItem().setSource("b1").setTarget("c").setValue(2)
                        }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/sankey/basic-sankey.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(sankey.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(sankey.getOption()));
    }
}
