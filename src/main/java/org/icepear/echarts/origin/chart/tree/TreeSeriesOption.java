package org.icepear.echarts.origin.chart.tree;

import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.RoamOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.origin.util.SymbolOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/tree/TreeSeries.ts#L83
 */
public interface TreeSeriesOption
        extends SeriesOption, TreeStateOption, SymbolOptionMixin, BoxLayoutOptionMixin, RoamOptionMixin {

    TreeSeriesOption setType(String type);

    TreeSeriesOption setLayout(String layout);

    TreeSeriesOption setEdgeShape(String edgeShape);

    TreeSeriesOption setEdgeForkPosition(Number edgeForkPosition);

    TreeSeriesOption setEdgeForkPosition(String edgeForkPosition);

    TreeSeriesOption setNodeScaleRatio(Number nodeScaleRatio);

    TreeSeriesOption setOrient(String orient);

    TreeSeriesOption setExpandAndCollapse(Boolean expandAndCollapse);

    TreeSeriesOption setInitialTreeDepth(Number initialTreeDepth);

    TreeSeriesOption setLeaves(TreeLeavesOption leaves);

    TreeSeriesOption setData(TreeNodeItemOption[] data);

    TreeSeriesOption setEmphasis(TreeEmphasisOption emphasis);
}
