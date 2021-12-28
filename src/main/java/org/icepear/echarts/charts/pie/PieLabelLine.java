package org.icepear.echarts.charts.pie;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.pie.PieLabelLineOption;
import org.icepear.echarts.origin.util.LineStyleOption;

@Accessors(chain = true)
@Data
public class PieLabelLine implements PieLabelLineOption {

    private Boolean show;

    private Boolean showAbove;

    private Number length;

    private Number length2;

    @Setter(AccessLevel.NONE)
    private Object smooth;

    public PieLabelLine setSmooth(Boolean smooth) {
        this.smooth = smooth;
        return this;
    }

    public PieLabelLine setSmooth(Number smooth) {
        this.smooth = smooth;
        return this;
    }

    private Number minTurnAngle;

    private LineStyleOption lineStyle;

    private Number maxSurfaceAngle;
}
