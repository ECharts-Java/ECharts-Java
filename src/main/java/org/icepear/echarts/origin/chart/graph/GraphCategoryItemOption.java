package org.icepear.echarts.origin.chart.graph;

import org.icepear.echarts.origin.util.StatesOptionMixin;
import org.icepear.echarts.origin.util.SymbolOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/graph/GraphSeries.ts#L132
 */
public interface GraphCategoryItemOption extends SymbolOptionMixin, GraphNodeStateOption, StatesOptionMixin {

    GraphCategoryItemOption setName(String name);

    GraphCategoryItemOption setValue(Number value);

    GraphCategoryItemOption setValue(Object value);

    GraphCategoryItemOption setValue(String value);
}
