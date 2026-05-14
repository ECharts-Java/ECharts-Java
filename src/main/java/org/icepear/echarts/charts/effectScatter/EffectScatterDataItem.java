package org.icepear.echarts.charts.effectScatter;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.effectScatter.EffectScatterDataItemOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class EffectScatterDataItem implements EffectScatterDataItemOption, Serializable {

    private static final long serialVersionUID = 1L;

    private String symbol;

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public EffectScatterDataItem setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public EffectScatterDataItem setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public EffectScatterDataItem setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public EffectScatterDataItem setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public EffectScatterDataItem setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public EffectScatterDataItem setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object id;

    public EffectScatterDataItem setId(Number id) {
        this.id = id;
        return this;
    }

    public EffectScatterDataItem setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public EffectScatterDataItem setName(Number name) {
        this.name = name;
        return this;
    }

    public EffectScatterDataItem setName(String name) {
        this.name = name;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object groupId;

    public EffectScatterDataItem setGroupId(Number groupId) {
        this.groupId = groupId;
        return this;
    }

    public EffectScatterDataItem setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    private Boolean selected;

    @Setter(AccessLevel.NONE)
    private Object value;

    public EffectScatterDataItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public EffectScatterDataItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public EffectScatterDataItem setValue(Object value) {
        this.value = value;
        return this;
    }

    public EffectScatterDataItem setValue(Object[] value) {
        this.value = value;
        return this;
    }

    public EffectScatterDataItem setValue(String value) {
        this.value = value;
        return this;
    }

    public EffectScatterDataItem setValue(String[] value) {
        this.value = value;
        return this;
    }
}
