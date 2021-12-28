package org.icepear.echarts.charts.gauge;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.gauge.GaugeAnchorOption;
import org.icepear.echarts.origin.util.ItemStyleOption;

@Accessors(chain = true)
@Data
public class GaugeAnchor implements GaugeAnchorOption {

    private Boolean show;

    private Boolean showAbove;

    private Number size;

    private String icon;

    @Setter(AccessLevel.NONE)
    private Object offsetCenter;

    public GaugeAnchor setOffsetCenter(Number[] offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }

    public GaugeAnchor setOffsetCenter(String[] offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }

    private Boolean keepAspect;

    private ItemStyleOption itemStyle;
}
