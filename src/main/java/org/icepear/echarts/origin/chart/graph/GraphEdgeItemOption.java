package org.icepear.echarts.origin.chart.graph;

import org.icepear.echarts.origin.util.NumericGraphEdgeItemObject;
import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/graph/GraphSeries.ts#L115
 */
public interface GraphEdgeItemOption extends GraphEdgeStateOption, StatesOptionMixin, NumericGraphEdgeItemObject {

    GraphEdgeItemOption setValue(Number value);

    GraphEdgeItemOption setSymbol(String symbol);

    GraphEdgeItemOption setSymbol(String[] symbol);

    GraphEdgeItemOption setSymbolSize(Number symbolSize);

    GraphEdgeItemOption setSymbolSize(Number[] symbolSize);

    GraphEdgeItemOption setIgnoreForceLayout(Boolean ignoreForceLayout);
}
