package org.icepear.echarts;

import org.icepear.echarts.charts.graph.GraphSeries;

public class Graph extends Chart<Graph, GraphSeries> {
    public Graph() {
        super(Graph.class, GraphSeries.class);
    }

    @Override
    public GraphSeries createSeries() {
        return new GraphSeries().setType("graph");
    }
}
