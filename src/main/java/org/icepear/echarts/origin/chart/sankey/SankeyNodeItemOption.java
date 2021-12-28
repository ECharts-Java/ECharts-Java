package org.icepear.echarts.origin.chart.sankey;

import org.icepear.echarts.origin.util.DefaultOptionDataItemObject;
import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/sankey/SankeySeries.ts#L68
 */
public interface SankeyNodeItemOption extends SankeyNodeStateOption, StatesOptionMixin, DefaultOptionDataItemObject {

    SankeyNodeItemOption setId(String id);

    SankeyNodeItemOption setLocalX(Number localX);

    SankeyNodeItemOption setLocalY(Number localY);

    SankeyNodeItemOption setDepth(Number depth);

    SankeyNodeItemOption setDraggable(Boolean draggable);

    SankeyNodeItemOption setFocusNodeAdjacency(Boolean focusNodeAdjacency);

    SankeyNodeItemOption setFocusNodeAdjacency(String focusNodeAdjacency);
}
