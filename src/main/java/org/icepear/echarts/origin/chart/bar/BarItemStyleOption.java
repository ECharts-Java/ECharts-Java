package org.icepear.echarts.origin.chart.bar;

import org.icepear.echarts.origin.util.ItemStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/bar/BarSeries.ts#L55
 */
public interface BarItemStyleOption extends ItemStyleOption {

    BarItemStyleOption setBorderRadius(Number borderRadius);

    BarItemStyleOption setBorderRadius(Number[] borderRadius);
}
