package org.icepear.echarts.components.coord.single;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.AxisLabelBaseOption;
import org.icepear.echarts.origin.coord.AxisLineOption;
import org.icepear.echarts.origin.coord.AxisTickOption;
import org.icepear.echarts.origin.coord.MinorSplitLineOption;
import org.icepear.echarts.origin.coord.MinorTickOption;
import org.icepear.echarts.origin.coord.SplitAreaOption;
import org.icepear.echarts.origin.coord.SplitLineOption;
import org.icepear.echarts.origin.coord.single.DefaultSingleAxisOption;
import org.icepear.echarts.origin.util.CommonAxisPointerOption;

@Accessors(chain = true)
@Data
public class DefaultSingleAxis implements DefaultSingleAxisOption {

    @Setter(AccessLevel.NONE)
    private Object width;

    public DefaultSingleAxis setWidth(Number width) {
        this.width = width;
        return this;
    }

    public DefaultSingleAxis setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public DefaultSingleAxis setHeight(Number height) {
        this.height = height;
        return this;
    }

    public DefaultSingleAxis setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public DefaultSingleAxis setTop(Number top) {
        this.top = top;
        return this;
    }

    public DefaultSingleAxis setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public DefaultSingleAxis setRight(Number right) {
        this.right = right;
        return this;
    }

    public DefaultSingleAxis setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public DefaultSingleAxis setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public DefaultSingleAxis setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public DefaultSingleAxis setLeft(Number left) {
        this.left = left;
        return this;
    }

    public DefaultSingleAxis setLeft(String left) {
        this.left = left;
        return this;
    }

    private String position;

    private String orient;

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public DefaultSingleAxis setId(Number id) {
        this.id = id;
        return this;
    }

    public DefaultSingleAxis setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public DefaultSingleAxis setName(Number name) {
        this.name = name;
        return this;
    }

    public DefaultSingleAxis setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public DefaultSingleAxis setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public DefaultSingleAxis setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public DefaultSingleAxis setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public DefaultSingleAxis setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public DefaultSingleAxis setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public DefaultSingleAxis setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public DefaultSingleAxis setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public DefaultSingleAxis setAnimationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    private Boolean show;

    private Boolean inverse;

    private String nameLocation;

    private Number nameRotate;

    private Object nameTruncate;

    private Object nameTextStyle;

    private Number nameGap;

    private Boolean silent;

    private Boolean triggerEvent;

    private Object tooltip;

    private AxisLabelBaseOption axisLabel;

    private CommonAxisPointerOption axisPointer;

    private AxisLineOption axisLine;

    private AxisTickOption axisTick;

    private MinorTickOption minorTick;

    private SplitLineOption splitLine;

    private MinorSplitLineOption minorSplitLine;

    private SplitAreaOption splitArea;

    @Setter(AccessLevel.NONE)
    private Object min;

    public DefaultSingleAxis setMin(Number min) {
        this.min = min;
        return this;
    }

    public DefaultSingleAxis setMin(String min) {
        this.min = min;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object max;

    public DefaultSingleAxis setMax(Number max) {
        this.max = max;
        return this;
    }

    public DefaultSingleAxis setMax(String max) {
        this.max = max;
        return this;
    }

    private Object[] data;
}
