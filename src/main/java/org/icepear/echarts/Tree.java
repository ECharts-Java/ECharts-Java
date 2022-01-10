package org.icepear.echarts;

import org.icepear.echarts.charts.tree.TreeSeries;

public class Tree extends Chart<Tree, TreeSeries> {
    public Tree() {
        super(Tree.class, TreeSeries.class);
    }

    @Override
    public TreeSeries createSeries() {
        return new TreeSeries().setType("tree");
    }
}
