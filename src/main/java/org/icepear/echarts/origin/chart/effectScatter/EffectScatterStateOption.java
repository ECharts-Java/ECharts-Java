package org.icepear.echarts.origin.chart.effectScatter;

import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://echarts.apache.org/en/option.html#series-effectScatter.itemStyle
 * https://echarts.apache.org/en/option.html#series-effectScatter.label
 */
public interface EffectScatterStateOption {

    EffectScatterStateOption setItemStyle(ItemStyleOption itemStyle);

    EffectScatterStateOption setLabel(SeriesLabelOption label);
}
