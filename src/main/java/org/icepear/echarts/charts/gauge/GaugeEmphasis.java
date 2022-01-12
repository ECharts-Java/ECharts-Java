package org.icepear.echarts.charts.gauge;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.gauge.GaugeEmphasisOption;
import org.icepear.echarts.origin.util.ItemStyleOption;

@Accessors(chain = true)
@Data
public class GaugeEmphasis implements GaugeEmphasisOption {

    private String focus;

    private ItemStyleOption itemStyle;

    private Object blurScope;
}
