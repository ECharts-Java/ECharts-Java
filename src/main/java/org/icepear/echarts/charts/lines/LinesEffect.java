package org.icepear.echarts.charts.lines;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.lines.LinesEffectOption;

@Accessors(chain = true)
@Data
public class LinesEffect implements LinesEffectOption, Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean show;

    private Number period;

    private Number delay;

    private Number constantSpeed;

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public LinesEffect setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public LinesEffect setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private String color;

    private Number trailLength;

    private Boolean loop;

    private Boolean roundTrip;
}
