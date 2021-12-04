package org.icepear.echarts.origin.chart.pie;

import org.icepear.echarts.origin.util.OptionDataItemObject;
import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/56fbf07640a25bbd3e710094da824f5bed6c647d/src/chart/pie/PieSeries.ts#L95
 */
public interface PieDataItemOption extends OptionDataItemObject, PieStateOption, StatesOptionMixin {
    PieDataItemOption setCursor(String cursor);
}
