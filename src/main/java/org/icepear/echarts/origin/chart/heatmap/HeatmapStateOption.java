package org.icepear.echarts.origin.chart.heatmap;

import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/heatmap/HeatmapSeries.ts#L44
 */
public interface HeatmapStateOption {

    HeatmapStateOption setItemStyle(ItemStyleOption itemStyle);

    HeatmapStateOption setLabel(SeriesLabelOption label);
}
