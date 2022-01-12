package org.icepear.echarts.origin.chart.line;

import org.icepear.echarts.origin.util.AreaStyleOption;
import org.icepear.echarts.origin.util.EmphasisOption;
import org.icepear.echarts.origin.util.LineStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L74
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1541
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L55
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L48
 */
public interface LineEmphasisOption extends LineStateOption, EmphasisOption {

    LineEmphasisOption setLineStyle(LineStyleOption lineStyle);

    LineEmphasisOption setLineStyle(Object lineStyle);

    LineEmphasisOption setAreaStyle(AreaStyleOption areaStyle);

    LineEmphasisOption setFocus(String focus);

    LineEmphasisOption setScale(Boolean scale);
}
