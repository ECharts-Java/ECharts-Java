package org.icepear.echarts.charts.sunburst;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sunburst.SunburstItemStyleOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstLabelOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstLevelOption;

@Accessors(chain = true)
@Data
public class SunburstSeriesLevel implements SunburstLevelOption, Serializable {

    private static final long serialVersionUID = 1L;

    private SunburstItemStyleOption itemStyle;

    private SunburstLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object radius;

    public SunburstSeriesLevel setRadius(Number[] radius) {
        this.radius = radius;
        return this;
    }

    public SunburstSeriesLevel setRadius(String[] radius) {
        this.radius = radius;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object r;

    public SunburstSeriesLevel setR(Number r) {
        this.r = r;
        return this;
    }

    public SunburstSeriesLevel setR(String r) {
        this.r = r;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object r0;

    public SunburstSeriesLevel setR0(Number r0) {
        this.r0 = r0;
        return this;
    }

    public SunburstSeriesLevel setR0(String r0) {
        this.r0 = r0;
        return this;
    }

    private Object highlight;
}
