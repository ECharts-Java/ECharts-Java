package org.icepear.echarts.origin.chart.boxplot;

import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/boxplot/BoxplotSeries.ts#L41
 */
public interface BoxplotStateOption {

    BoxplotStateOption setItemStyle(ItemStyleOption itemStyle);

    BoxplotStateOption setLabel(SeriesLabelOption label);
}
