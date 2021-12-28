package org.icepear.echarts.origin.chart.graph;

import org.icepear.echarts.origin.util.StatesOptionMixin;
import org.icepear.echarts.origin.util.SymbolOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/graph/GraphSeries.ts#L82
 */
public interface GraphNodeItemOption extends SymbolOptionMixin, GraphNodeStateOption, StatesOptionMixin {

    GraphNodeItemOption setId(String id);

    GraphNodeItemOption setName(String name);

    GraphNodeItemOption setValue(Number value);

    GraphNodeItemOption setValue(Number[] value);

    GraphNodeItemOption setValue(Object value);

    GraphNodeItemOption setValue(Object[] value);

    GraphNodeItemOption setValue(String value);

    GraphNodeItemOption setValue(String[] value);

    GraphNodeItemOption setX(Number x);

    GraphNodeItemOption setY(Number y);

    GraphNodeItemOption setFixed(Boolean fixed);

    GraphNodeItemOption setCategory(Number category);

    GraphNodeItemOption setCategory(String category);

    GraphNodeItemOption setDraggable(Boolean draggable);
}
