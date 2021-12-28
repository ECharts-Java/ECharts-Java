package org.icepear.echarts.components.coord;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.AxisLineOption;
import org.icepear.echarts.origin.util.LineStyleOption;

@Accessors(chain = true)
@Data
public class AxisLine implements AxisLineOption {

    @Setter(AccessLevel.NONE)
    private Object show;

    public AxisLine setShow(Boolean show) {
        this.show = show;
        return this;
    }

    public AxisLine setShow(String show) {
        this.show = show;
        return this;
    }

    private Boolean onZero;

    private Number onZeroAxisIndex;

    @Setter(AccessLevel.NONE)
    private Object symbol;

    public AxisLine setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public AxisLine setSymbol(String[] symbol) {
        this.symbol = symbol;
        return this;
    }

    private Number[] symbolSize;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public AxisLine setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public AxisLine setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public AxisLine setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public AxisLine setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    private LineStyleOption lineStyle;
}
