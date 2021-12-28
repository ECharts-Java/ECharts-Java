package org.icepear.echarts.origin.chart.pie;

import org.icepear.echarts.origin.util.NumericOptionDataItemObject;
import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/pie/PieSeries.ts#L95
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L640
 */
public interface PieDataItemOption extends NumericOptionDataItemObject, PieStateOption, StatesOptionMixin {

    PieDataItemOption setCursor(String cursor);
}
