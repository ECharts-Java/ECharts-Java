package org.icepear.echarts.origin.chart.tree;

import org.icepear.echarts.origin.util.EmphasisOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/tree/TreeSeries.ts#L57
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1541
 */
public interface TreeEmphasisOption extends TreeStateOption, EmphasisOption {

    TreeEmphasisOption setFocus(String focus);

    TreeEmphasisOption setScale(Boolean scale);
}
