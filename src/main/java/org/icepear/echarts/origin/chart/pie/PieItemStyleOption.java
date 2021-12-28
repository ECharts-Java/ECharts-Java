package org.icepear.echarts.origin.chart.pie;

import org.icepear.echarts.origin.util.ItemStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/pie/PieSeries.ts#L43
 */
public interface PieItemStyleOption extends ItemStyleOption {

    PieItemStyleOption setBorderRadius(Number borderRadius);

    PieItemStyleOption setBorderRadius(Number[] borderRadius);

    PieItemStyleOption setBorderRadius(String borderRadius);

    PieItemStyleOption setBorderRadius(String[] borderRadius);
}
