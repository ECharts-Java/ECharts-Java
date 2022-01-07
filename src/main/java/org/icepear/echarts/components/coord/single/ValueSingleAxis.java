package org.icepear.echarts.components.coord.single;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.AxisLabelBaseOption;
import org.icepear.echarts.origin.coord.AxisLineOption;
import org.icepear.echarts.origin.coord.AxisNameTextStyleOption;
import org.icepear.echarts.origin.coord.AxisTickOption;
import org.icepear.echarts.origin.coord.MinorSplitLineOption;
import org.icepear.echarts.origin.coord.MinorTickOption;
import org.icepear.echarts.origin.coord.SplitAreaOption;
import org.icepear.echarts.origin.coord.SplitLineOption;
import org.icepear.echarts.origin.coord.single.ValueSingleAxisOption;
import org.icepear.echarts.origin.util.CommonAxisPointerOption;

@Accessors(chain = true)
@Data
public class ValueSingleAxis implements ValueSingleAxisOption {

    @Setter(AccessLevel.NONE)
    private Object width;

    public ValueSingleAxis setWidth(Number width) {
        this.width = width;
        return this;
    }

    public ValueSingleAxis setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public ValueSingleAxis setHeight(Number height) {
        this.height = height;
        return this;
    }

    public ValueSingleAxis setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public ValueSingleAxis setTop(Number top) {
        this.top = top;
        return this;
    }

    public ValueSingleAxis setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public ValueSingleAxis setRight(Number right) {
        this.right = right;
        return this;
    }

    public ValueSingleAxis setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public ValueSingleAxis setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public ValueSingleAxis setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public ValueSingleAxis setLeft(Number left) {
        this.left = left;
        return this;
    }

    public ValueSingleAxis setLeft(String left) {
        this.left = left;
        return this;
    }

    private String position;

    private String orient;

    private String mainType;

    private String type = "value";

    @Setter(AccessLevel.NONE)
    private Object id;

    public ValueSingleAxis setId(Number id) {
        this.id = id;
        return this;
    }

    public ValueSingleAxis setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public ValueSingleAxis setName(Number name) {
        this.name = name;
        return this;
    }

    public ValueSingleAxis setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public ValueSingleAxis setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public ValueSingleAxis setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public ValueSingleAxis setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public ValueSingleAxis setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public ValueSingleAxis setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public ValueSingleAxis setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public ValueSingleAxis setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public ValueSingleAxis setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    private Boolean show;

    private Boolean inverse;

    private String nameLocation;

    private Number nameRotate;

    private Object nameTruncate;

    private AxisNameTextStyleOption nameTextStyle;

    private Number nameGap;

    private Boolean silent;

    private Boolean triggerEvent;

    private Object tooltip;

    @Setter(AccessLevel.NONE)
    private Object axisLabel;

    public ValueSingleAxis setAxisLabel(AxisLabelBaseOption axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    public ValueSingleAxis setAxisLabel(Object axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    private CommonAxisPointerOption axisPointer;

    private AxisLineOption axisLine;

    private AxisTickOption axisTick;

    private MinorTickOption minorTick;

    private SplitLineOption splitLine;

    private MinorSplitLineOption minorSplitLine;

    private SplitAreaOption splitArea;

    @Setter(AccessLevel.NONE)
    private Object min;

    public ValueSingleAxis setMin(Number min) {
        this.min = min;
        return this;
    }

    public ValueSingleAxis setMin(String min) {
        this.min = min;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object max;

    public ValueSingleAxis setMax(Number max) {
        this.max = max;
        return this;
    }

    public ValueSingleAxis setMax(String max) {
        this.max = max;
        return this;
    }

    private Object[] data;

    @Setter(AccessLevel.NONE)
    private Object boundaryGap;

    public ValueSingleAxis setBoundaryGap(Number[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    public ValueSingleAxis setBoundaryGap(String[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    private Number splitNumber;

    private Number interval;

    private Number minInterval;

    private Number maxInterval;

    private Boolean scale;
}
