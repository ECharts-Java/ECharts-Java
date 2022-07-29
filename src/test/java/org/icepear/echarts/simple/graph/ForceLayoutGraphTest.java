package org.icepear.echarts.simple.graph;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.icepear.echarts.Graph;
import org.icepear.echarts.charts.graph.GraphCategoryItem;
import org.icepear.echarts.charts.graph.GraphEdgeItem;
import org.icepear.echarts.charts.graph.GraphForce;
import org.icepear.echarts.charts.graph.GraphNodeItem;
import org.icepear.echarts.charts.graph.GraphSeries;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Before;
import org.junit.Test;

public class ForceLayoutGraphTest {
    private List<GraphNodeItem> nodes;
    private List<GraphEdgeItem> links;
    private List<GraphCategoryItem> categories;

    @Before
    public void loadData() {
        Reader reader = new InputStreamReader(this.getClass().getResourceAsStream("/mock/les-miserables.json"));
        JsonObject data = JsonParser.parseReader(reader).getAsJsonObject();
        nodes = new ArrayList<>();
        for (JsonElement node : data.get("nodes").getAsJsonArray()) {
            nodes.add(new GraphNodeItem()
                    .setId(node.getAsJsonObject().get("id").getAsString())
                    .setName(node.getAsJsonObject().get("name").getAsString())
                    .setSymbolSize(5)
                    .setValue(node.getAsJsonObject().get("value").getAsDouble())
                    .setCategory(node.getAsJsonObject().get("category").getAsInt()));
        }
        links = new ArrayList<>();
        for (JsonElement link : data.get("links").getAsJsonArray()) {
            links.add(new GraphEdgeItem()
                    .setSource(link.getAsJsonObject().get("source").getAsString())
                    .setTarget(link.getAsJsonObject().get("target").getAsString()));
        }
        categories = new ArrayList<>();
        for (JsonElement category : data.get("categories").getAsJsonArray()) {
            categories.add(new GraphCategoryItem()
                    .setName(category.getAsJsonObject().get("name").getAsString()));
        }
    }

    @Test
    public void testForceLayoutGraph() {
        Graph graph = new Graph()
                .setTitle("Les Miserables")
                .setTooltip("item")
                .setLegend()
                .addSeries(new GraphSeries().setName("Les Miserables")
                        .setLayout("force")
                        .setData(nodes.toArray(new GraphNodeItem[0]))
                        .setLinks(links.toArray(new GraphEdgeItem[0]))
                        .setCategories(categories.toArray(new GraphCategoryItem[0]))
                        .setForce(new GraphForce().setRepulsion(100)));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/graph/force-layout-graph.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(graph.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(graph.getOption()));
    }
}
