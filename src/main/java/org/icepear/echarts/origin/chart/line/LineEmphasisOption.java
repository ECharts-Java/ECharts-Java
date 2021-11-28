package org.icepear.echarts.origin.chart.line;

import org.icepear.echarts.origin.util.EmphasisOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L73
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L48
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1534
 */
public interface LineEmphasisOption extends LineStateOption, EmphasisOption {
    void setFocus(String focus);

    void setScale(Boolean scale);

    void setLineStyle(Object lineStyle);

    void setAreaStyle(Object areaStyle);

    void setBlurScope(Object blurScope);
}
