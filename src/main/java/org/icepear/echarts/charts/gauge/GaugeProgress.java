package org.icepear.echarts.charts.gauge;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.gauge.GaugeProgressOption;
import org.icepear.echarts.origin.util.ItemStyleOption;

@Accessors(chain = true)
@Data
public class GaugeProgress implements GaugeProgressOption {

    private Boolean show;

    private Boolean overlap;

    private Number width;

    private Boolean roundCap;

    private Boolean clip;

    private ItemStyleOption itemStyle;
}
