package org.icepear.echarts.origin.chart.boxplot;

import org.icepear.echarts.origin.util.EmphasisOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/boxplot/BoxplotSeries.ts#L52
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1541
 */
public interface BoxplotEmphasisOption extends BoxplotStateOption, EmphasisOption {

    BoxplotEmphasisOption setFocus(String focus);

    BoxplotEmphasisOption setScale(Boolean scale);
}
