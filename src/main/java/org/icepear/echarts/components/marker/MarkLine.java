package org.icepear.echarts.components.marker;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.marker.MarkLineDataItemOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLineLabelOption;

@Accessors(chain = true)
@Data
public class MarkLine implements MarkLineOption {

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public MarkLine setId(Number id) {
        this.id = id;
        return this;
    }

    public MarkLine setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public MarkLine setName(Number name) {
        this.name = name;
        return this;
    }

    public MarkLine setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public MarkLine setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public MarkLine setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public MarkLine setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public MarkLine setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public MarkLine setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public MarkLine setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public MarkLine setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public MarkLine setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    private Boolean silent;

    @Setter(AccessLevel.NONE)
    private Object data;

    public MarkLine setData(MarkLineDataItemOption[] data) {
        this.data = data;
        return this;
    }

    public MarkLine setData(Object[] data) {
        this.data = data;
        return this;
    }

    private Object tooltip;

    private LineStyleOption lineStyle;

    private ItemStyleOption itemStyle;

    private SeriesLineLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object symbol;

    public MarkLine setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public MarkLine setSymbol(String[] symbol) {
        this.symbol = symbol;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object symbolSize;

    public MarkLine setSymbolSize(Number symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public MarkLine setSymbolSize(Number[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object symbolRotate;

    public MarkLine setSymbolRotate(Number symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    public MarkLine setSymbolRotate(Number[] symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object symbolOffset;

    public MarkLine setSymbolOffset(Number symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public MarkLine setSymbolOffset(Number[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public MarkLine setSymbolOffset(String symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public MarkLine setSymbolOffset(String[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    private Number precision;
}
