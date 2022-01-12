package org.icepear.echarts.charts.bar;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.bar.BarEmphasisOption;
import org.icepear.echarts.origin.chart.bar.BarItemStyleOption;
import org.icepear.echarts.origin.chart.bar.BarLabelOption;

@Accessors(chain = true)
@Data
public class BarEmphasis implements BarEmphasisOption {

    private String focus;

    private BarItemStyleOption itemStyle;

    private BarLabelOption label;

    private Object blurScope;
}
