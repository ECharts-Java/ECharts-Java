package org.icepear.echarts.origin.chart.graph;

import org.icepear.echarts.origin.util.LineStyleOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/graph/GraphSeries.ts#L61
 */
public interface GraphEdgeLineStyleOption extends LineStyleOption {

    GraphEdgeLineStyleOption setCurveness(Number curveness);
}
