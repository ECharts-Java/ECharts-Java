package org.icepear.echarts.origin.chart.bar;

import org.icepear.echarts.origin.util.DefaultOptionDataItemObject;
import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/bar/BarSeries.ts#L59
 */
public interface BarDataItemOption extends BarStateOption, StatesOptionMixin, DefaultOptionDataItemObject {

    BarDataItemOption setCursor(String cursor);
}
