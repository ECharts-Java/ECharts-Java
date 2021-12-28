package org.icepear.echarts.components.marker;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.marker.MarkPointDataItemOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class MarkPointDataItem implements MarkPointDataItemOption {

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public MarkPointDataItem setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public MarkPointDataItem setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public MarkPointDataItem setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public MarkPointDataItem setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public MarkPointDataItem setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public MarkPointDataItem setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object x;

    public MarkPointDataItem setX(Number x) {
        this.x = x;
        return this;
    }

    public MarkPointDataItem setX(String x) {
        this.x = x;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object y;

    public MarkPointDataItem setY(Number y) {
        this.y = y;
        return this;
    }

    public MarkPointDataItem setY(String y) {
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

    public MarkPointDataItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public MarkPointDataItem setValue(String value) {
        this.value = value;
        return this;
    }

    private String name;
}
