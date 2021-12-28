package org.icepear.echarts.origin.chart.scatter;

import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/scatter/ScatterSeries.ts#L45
 */
public interface ScatterStateOption {

    ScatterStateOption setItemStyle(ItemStyleOption itemStyle);

    ScatterStateOption setLabel(SeriesLabelOption label);
}
