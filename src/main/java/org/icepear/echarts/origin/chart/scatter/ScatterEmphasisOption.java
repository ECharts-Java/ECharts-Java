package org.icepear.echarts.origin.chart.scatter;

import org.icepear.echarts.origin.util.EmphasisOption;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/scatter/ScatterSeries.ts#L51
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1541
 */
public interface ScatterEmphasisOption extends ScatterStateOption, EmphasisOption {

    ScatterEmphasisOption setFocus(String focus);

    ScatterEmphasisOption setScale(Boolean scale);
}
