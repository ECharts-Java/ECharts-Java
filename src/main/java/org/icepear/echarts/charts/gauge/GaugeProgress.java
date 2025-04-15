package org.icepear.echarts.charts.gauge;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.gauge.GaugeProgressOption;
import org.icepear.echarts.origin.util.ItemStyleOption;

@Accessors(chain = true)
@Data
public class GaugeProgress implements GaugeProgressOption, Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean show;

    private Boolean overlap;

    private Number width;

    private Boolean roundCap;

    private Boolean clip;

    private ItemStyleOption itemStyle;
}
