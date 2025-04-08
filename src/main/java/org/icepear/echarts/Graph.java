package org.icepear.echarts;

import org.icepear.echarts.charts.graph.GraphSeries;

import java.io.Serial;
import java.io.Serializable;

public class Graph extends Chart<Graph, GraphSeries> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public Graph() {
        super(Graph.class, GraphSeries.class);
    }

    @Override
    public GraphSeries createSeries() {
        return new GraphSeries().setType("graph");
    }
}
