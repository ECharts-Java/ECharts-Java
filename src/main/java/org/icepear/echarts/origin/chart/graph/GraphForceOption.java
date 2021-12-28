package org.icepear.echarts.origin.chart.graph;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/graph/GraphSeries.ts#L213
 */
public interface GraphForceOption {

    GraphForceOption setInitLayout(String initLayout);

    GraphForceOption setRepulsion(Number repulsion);

    GraphForceOption setRepulsion(Number[] repulsion);

    GraphForceOption setGravity(Number gravity);

    GraphForceOption setFriction(Number friction);

    GraphForceOption setEdgeLength(Number edgeLength);

    GraphForceOption setEdgeLength(Number[] edgeLength);

    GraphForceOption setLayoutAnimation(Boolean layoutAnimation);
}
