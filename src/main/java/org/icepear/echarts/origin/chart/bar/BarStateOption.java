package org.icepear.echarts.origin.chart.bar;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/bar/BarSeries.ts#L46
 */
public interface BarStateOption {

    BarStateOption setItemStyle(BarItemStyleOption itemStyle);

    BarStateOption setLabel(BarLabelOption label);
}
