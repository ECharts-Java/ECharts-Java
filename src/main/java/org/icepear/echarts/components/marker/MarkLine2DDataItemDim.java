package org.icepear.echarts.components.marker;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.marker.MarkLine2DDataItemDimOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLineLabelOption;

@Accessors(chain = true)
@Data
public class MarkLine2DDataItemDim implements MarkLine2DDataItemDimOption {

    private LineStyleOption lineStyle;

    private ItemStyleOption itemStyle;

    private SeriesLineLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    private String name;

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public MarkLine2DDataItemDim setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public MarkLine2DDataItemDim setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public MarkLine2DDataItemDim setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public MarkLine2DDataItemDim setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public MarkLine2DDataItemDim setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public MarkLine2DDataItemDim setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object x;

    public MarkLine2DDataItemDim setX(Number x) {
        this.x = x;
        return this;
    }

    public MarkLine2DDataItemDim setX(String x) {
        this.x = x;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object y;

    public MarkLine2DDataItemDim setY(Number y) {
        this.y = y;
        return this;
    }

    public MarkLine2DDataItemDim setY(String y) {
        this.y = y;
        return this;
    }

    private Object[] coord;

    private Object xAxis;

    private Object yAxis;

    private Object radiusAxis;

    private Object angleAxis;

    private Object type;

    private Number valueIndex;

    private String valueDim;

    @Setter(AccessLevel.NONE)
    private Object value;

    public MarkLine2DDataItemDim setValue(Number value) {
        this.value = value;
        return this;
    }

    public MarkLine2DDataItemDim setValue(String value) {
        this.value = value;
        return this;
    }
}
