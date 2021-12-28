package org.icepear.echarts.components.marker;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.marker.MarkLine1DDataItemOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLineLabelOption;

@Accessors(chain = true)
@Data
public class MarkLine1DDataItem implements MarkLine1DDataItemOption {

    private LineStyleOption lineStyle;

    private ItemStyleOption itemStyle;

    private SeriesLineLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    private String name;

    @Setter(AccessLevel.NONE)
    private Object xAxis;

    public MarkLine1DDataItem setXAxis(Number xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public MarkLine1DDataItem setXAxis(String xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object yAxis;

    public MarkLine1DDataItem setYAxis(Number yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    public MarkLine1DDataItem setYAxis(String yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    private Object type;

    private Number valueIndex;

    private String valueDim;

    @Setter(AccessLevel.NONE)
    private Object symbol;

    public MarkLine1DDataItem setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public MarkLine1DDataItem setSymbol(String[] symbol) {
        this.symbol = symbol;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public MarkLine1DDataItem setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public MarkLine1DDataItem setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object symbolRotate;

    public MarkLine1DDataItem setSymbolRotate(Number symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    public MarkLine1DDataItem setSymbolRotate(Number[] symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public MarkLine1DDataItem setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public MarkLine1DDataItem setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public MarkLine1DDataItem setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public MarkLine1DDataItem setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }
}
