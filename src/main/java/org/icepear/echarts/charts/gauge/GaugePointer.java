package org.icepear.echarts.charts.gauge;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.gauge.GaugePointerOption;
import org.icepear.echarts.origin.util.ItemStyleOption;

@Accessors(chain = true)
@Data
public class GaugePointer implements GaugePointerOption {

    private String icon;

    private Boolean show;

    private Boolean showAbove;

    private Boolean keepAspect;

    private ItemStyleOption itemStyle;

    @Setter(AccessLevel.NONE)
    private Object offsetCenter;

    public GaugePointer setOffsetCenter(Number[] offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }

    public GaugePointer setOffsetCenter(String[] offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object length;

    public GaugePointer setLength(Number length) {
        this.length = length;
        return this;
    }

    public GaugePointer setLength(String length) {
        this.length = length;
        return this;
    }

    private Number width;
}
