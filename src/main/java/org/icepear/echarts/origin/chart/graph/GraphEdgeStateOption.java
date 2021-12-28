package org.icepear.echarts.origin.chart.graph;

import org.icepear.echarts.origin.util.SeriesLineLabelOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/graph/GraphSeries.ts#L111
 */
public interface GraphEdgeStateOption {

    GraphEdgeStateOption setLineStyle(GraphEdgeLineStyleOption lineStyle);

    GraphEdgeStateOption setLabel(SeriesLineLabelOption label);
}
