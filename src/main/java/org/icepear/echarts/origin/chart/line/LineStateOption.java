package org.icepear.echarts.origin.chart.line;

import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L55
 */
public interface LineStateOption {

    LineStateOption setItemStyle(ItemStyleOption itemStyle);

    LineStateOption setLabel(SeriesLabelOption label);

    LineStateOption setEndLabel(Object endLabel);
}
