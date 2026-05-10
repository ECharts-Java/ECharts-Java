package org.icepear.echarts.origin.chart.pictorialBar;

import org.icepear.echarts.origin.chart.bar.BarItemStyleOption;
import org.icepear.echarts.origin.chart.bar.BarLabelOption;

/**
 * https://echarts.apache.org/en/option.html#series-pictorialBar.itemStyle
 * https://echarts.apache.org/en/option.html#series-pictorialBar.label
 */
public interface PictorialBarStateOption {

    PictorialBarStateOption setItemStyle(BarItemStyleOption itemStyle);

    PictorialBarStateOption setLabel(BarLabelOption label);
}
