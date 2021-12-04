package org.icepear.echarts.origin.chart.pie;

import org.icepear.echarts.origin.util.EmphasisOption;

/**
 * https://github.com/apache/echarts/blob/56fbf07640a25bbd3e710094da824f5bed6c647d/src/chart/pie/PieSeries.ts#L101
 * https://github.com/apache/echarts/blob/56fbf07640a25bbd3e710094da824f5bed6c647d/src/chart/pie/PieSeries.ts#L87
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1534
 */
public interface PieEmphasisOption extends PieStateOption, EmphasisOption {
    PieEmphasisOption setFocus(String focus);

    PieEmphasisOption setScale(Boolean scale);

    PieEmphasisOption setScaleSize(Number scaleSize);

    PieEmphasisOption setBlurScope(Object blurScope);
}
