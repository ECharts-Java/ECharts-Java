package org.icepear.echarts.charts.effectScatter;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.effectScatter.RippleEffectOption;

@Accessors(chain = true)
@Data
public class RippleEffect implements RippleEffectOption, Serializable {

    private static final long serialVersionUID = 1L;

    private String color;

    private Number number;

    private Number period;

    private Number scale;

    private String brushType;
}
