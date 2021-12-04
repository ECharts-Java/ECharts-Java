package org.icepear.echarts.origin.chart.pie;

import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.type.EChartsRadius;

/**
 * https://github.com/apache/echarts/blob/56fbf07640a25bbd3e710094da824f5bed6c647d/src/chart/pie/PieSeries.ts#L43
 */
public interface PieItemStyleOption extends ItemStyleOption {
    PieItemStyleOption setBorderRadius(EChartsRadius borderRadius);
}
