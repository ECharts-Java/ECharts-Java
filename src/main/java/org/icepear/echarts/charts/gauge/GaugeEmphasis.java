package org.icepear.echarts.charts.gauge;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.gauge.GaugeEmphasisOption;
import org.icepear.echarts.origin.util.ItemStyleOption;

@Accessors(chain = true)
@Data
public class GaugeEmphasis implements GaugeEmphasisOption, Serializable {

    private static final long serialVersionUID = 1L;

    private String focus;

    private ItemStyleOption itemStyle;

    private Object blurScope;
}
