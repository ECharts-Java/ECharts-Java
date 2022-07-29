package org.icepear.echarts.simple.tree;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Tree;
import org.icepear.echarts.charts.tree.TreeEmphasis;
import org.icepear.echarts.charts.tree.TreeLeaves;
import org.icepear.echarts.charts.tree.TreeNodeItem;
import org.icepear.echarts.charts.tree.TreeSeries;
import org.icepear.echarts.components.series.SeriesLabel;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicTreeTest {
    @Test
    public void testBasicTree() {
        Tree tree = new Tree()
                .setTooltip("item")
                .addSeries(new TreeSeries()
                        .setLabel(new SeriesLabel().setPosition("left").setAlign("right"))
                        .setLeaves(new TreeLeaves()
                                .setLabel(new SeriesLabel().setPosition("right").setAlign("left")))
                        .setEmphasis(new TreeEmphasis().setFocus("descendant"))
                        .setData(new TreeNodeItem[] {
                                new TreeNodeItem().setName("flare")
                                        .setChildren(new TreeNodeItem[] {
                                                new TreeNodeItem().setName("analytics")
                                                        .setChildren(new TreeNodeItem[] {
                                                                new TreeNodeItem().setName("cluster").setValue(3938),
                                                                new TreeNodeItem().setName("graph").setValue(3534)
                                                        }),
                                                new TreeNodeItem().setName("animate").setValue(17010)
                                        })
                        }));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/tree/basic-tree.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = new EChartsSerializer().toJsonTree(tree.getOption());
        assertEquals(expected, actual);

        // System.out.println(new EChartsSerializer().toJson(tree.getOption()));
    }
}
