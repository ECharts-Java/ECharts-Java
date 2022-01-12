package org.icepear.echarts.origin.chart.pie;

import org.icepear.echarts.origin.util.EmphasisOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1541
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/pie/PieSeries.ts#L101
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/pie/PieSeries.ts#L59
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/pie/PieSeries.ts#L87
 */
public interface PieEmphasisOption extends PieStateOption, EmphasisOption {

    PieEmphasisOption setFocus(String focus);

    PieEmphasisOption setScale(Boolean scale);

    PieEmphasisOption setScaleSize(Number scaleSize);
}
