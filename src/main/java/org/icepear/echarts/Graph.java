package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.graph.GraphSeries;

public class Graph extends Chart<Graph, GraphSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Graph() {
        super(Graph.class, GraphSeries.class);
    }

    @Override
    public GraphSeries createSeries() {
        return new GraphSeries().setType("graph");
    }
}
