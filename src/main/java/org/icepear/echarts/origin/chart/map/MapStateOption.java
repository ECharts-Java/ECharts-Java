package org.icepear.echarts.origin.chart.map;

import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://echarts.apache.org/en/option.html#series-map.itemStyle
 * https://echarts.apache.org/en/option.html#series-map.label
 */
public interface MapStateOption {

    MapStateOption setItemStyle(MapItemStyleOption itemStyle);

    MapStateOption setLabel(SeriesLabelOption label);
}
