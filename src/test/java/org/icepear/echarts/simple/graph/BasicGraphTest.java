package org.icepear.echarts.simple.graph;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Graph;
import org.icepear.echarts.charts.graph.GraphEdgeItem;
import org.icepear.echarts.charts.graph.GraphEdgeLineStyle;
import org.icepear.echarts.charts.graph.GraphNodeItem;
import org.icepear.echarts.charts.graph.GraphSeries;
import org.icepear.echarts.components.series.SeriesLabel;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicGraphTest {
    @Test
    public void testBasicGraph() {
        Graph graph = new Graph()
                .addSeries(new GraphSeries().setSymbolSize(50)
                        .setLabel(new SeriesLabel().setShow(true))
                        .setEdgeSymbol(new String[] { "circle", "arrow" })
                        .setData(new GraphNodeItem[] {
                                new GraphNodeItem().setName("Node 1").setX(300).setY(300),
                                new GraphNodeItem().setName("Node 2").setX(800).setY(300),
                                new GraphNodeItem().setName("Node 3").setX(550).setY(100),
                                new GraphNodeItem().setName("Node 4").setX(550).setY(500)
                        })
                        .setLinks(new GraphEdgeItem[] {
                                new GraphEdgeItem().setSource("Node 1").setTarget("Node 2")
                                        .setLineStyle(new GraphEdgeLineStyle().setCurveness(0.2)),
                                new GraphEdgeItem().setSource("Node 2").setTarget("Node 1")
                                        .setLineStyle(new GraphEdgeLineStyle().setCurveness(0.2)),
                                new GraphEdgeItem().setSource("Node 1").setTarget("Node 3"),
                                new GraphEdgeItem().setSource("Node 2").setTarget("Node 3"),
                                new GraphEdgeItem().setSource("Node 2").setTarget("Node 4"),
                                new GraphEdgeItem().setSource("Node 1").setTarget("Node 4")
                        })
                        .setLineStyle(new GraphEdgeLineStyle().setOpacity(0.9).setWidth(2).setCurveness(0)));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/graph/basic-graph.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(graph.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(graph.getOption()));
    }
}
