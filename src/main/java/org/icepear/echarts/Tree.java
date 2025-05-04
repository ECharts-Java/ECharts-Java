package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.tree.TreeSeries;

public class Tree extends Chart<Tree, TreeSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Tree() {
        super(Tree.class, TreeSeries.class);
    }

    @Override
    public TreeSeries createSeries() {
        return new TreeSeries().setType("tree");
    }
}
