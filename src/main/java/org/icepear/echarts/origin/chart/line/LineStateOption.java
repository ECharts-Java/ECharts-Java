package org.icepear.echarts.origin.chart.line;

import org.icepear.echarts.origin.util.LabelOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L55
 */
public interface LineStateOption {
    void setItemStyle(Object itemStyle);

    void setLabel(LabelOption label);

    void setEndLabel(LabelOption endLabel);
}
