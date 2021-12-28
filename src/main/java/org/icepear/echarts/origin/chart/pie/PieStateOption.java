package org.icepear.echarts.origin.chart.pie;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/pie/PieSeries.ts#L59
 */
public interface PieStateOption {

    PieStateOption setItemStyle(PieItemStyleOption itemStyle);

    PieStateOption setLabel(PieLabelOption label);
}
