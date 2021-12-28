package org.icepear.echarts.charts.graph;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.graph.GraphForceOption;

@Accessors(chain = true)
@Data
public class GraphForce implements GraphForceOption {

    private String initLayout;

    @Setter(AccessLevel.NONE)
    private Object repulsion;

    public GraphForce setRepulsion(Number repulsion) {
        this.repulsion = repulsion;
        return this;
    }

    public GraphForce setRepulsion(Number[] repulsion) {
        this.repulsion = repulsion;
        return this;
    }

    private Number gravity;

    private Number friction;

    @Setter(AccessLevel.NONE)
    private Object edgeLength;

    public GraphForce setEdgeLength(Number edgeLength) {
        this.edgeLength = edgeLength;
        return this;
    }

    public GraphForce setEdgeLength(Number[] edgeLength) {
        this.edgeLength = edgeLength;
        return this;
    }

    private Boolean layoutAnimation;
}
