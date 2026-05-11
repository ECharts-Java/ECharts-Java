package org.icepear.echarts.charts.pictorialBar;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.bar.BarItemStyleOption;
import org.icepear.echarts.origin.chart.bar.BarLabelOption;
import org.icepear.echarts.origin.chart.pictorialBar.PictorialBarDataItemOption;

@Accessors(chain = true)
@Data
public class PictorialBarDataItem implements PictorialBarDataItemOption, Serializable {

    private static final long serialVersionUID = 1L;

    private BarItemStyleOption itemStyle;

    private BarLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object id;

    public PictorialBarDataItem setId(Number id) {
        this.id = id;
        return this;
    }

    public PictorialBarDataItem setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public PictorialBarDataItem setName(Number name) {
        this.name = name;
        return this;
    }

    public PictorialBarDataItem setName(String name) {
        this.name = name;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object groupId;

    public PictorialBarDataItem setGroupId(Number groupId) {
        this.groupId = groupId;
        return this;
    }

    public PictorialBarDataItem setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    private Boolean selected;

    @Setter(AccessLevel.NONE)
    private Object value;

    public PictorialBarDataItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public PictorialBarDataItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public PictorialBarDataItem setValue(Object value) {
        this.value = value;
        return this;
    }

    public PictorialBarDataItem setValue(Object[] value) {
        this.value = value;
        return this;
    }

    public PictorialBarDataItem setValue(String value) {
        this.value = value;
        return this;
    }

    public PictorialBarDataItem setValue(String[] value) {
        this.value = value;
        return this;
    }

    private String cursor;

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public PictorialBarDataItem setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public PictorialBarDataItem setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public PictorialBarDataItem setSymbolSize(String symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public PictorialBarDataItem setSymbolSize(String[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private String symbolPosition;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public PictorialBarDataItem setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public PictorialBarDataItem setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    private Number symbolRotate;

    @Setter(AccessLevel.NONE)
    private Object symbolRepeat;

    public PictorialBarDataItem setSymbolRepeat(Boolean symbolRepeat) {
        this.symbolRepeat = symbolRepeat;
        return this;
    }

    public PictorialBarDataItem setSymbolRepeat(Number symbolRepeat) {
        this.symbolRepeat = symbolRepeat;
        return this;
    }

    public PictorialBarDataItem setSymbolRepeat(String symbolRepeat) {
        this.symbolRepeat = symbolRepeat;
        return this;
    }

    private String symbolRepeatDirection;

    @Setter(AccessLevel.NONE)
    private Object symbolMargin;

    public PictorialBarDataItem setSymbolMargin(Number symbolMargin) {
        this.symbolMargin = symbolMargin;
        return this;
    }

    public PictorialBarDataItem setSymbolMargin(String symbolMargin) {
        this.symbolMargin = symbolMargin;
        return this;
    }

    private Boolean symbolClip;

    @Setter(AccessLevel.NONE)
    private Object symbolBoundingData;

    public PictorialBarDataItem setSymbolBoundingData(Number symbolBoundingData) {
        this.symbolBoundingData = symbolBoundingData;
        return this;
    }

    public PictorialBarDataItem setSymbolBoundingData(Number[] symbolBoundingData) {
        this.symbolBoundingData = symbolBoundingData;
        return this;
    }

    private Number symbolPatternSize;

    private Boolean hoverAnimation;
}
