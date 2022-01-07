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
import org.icepear.echarts.origin.coord.single.CategorySingleAxisOption;
import org.icepear.echarts.origin.util.CommonAxisPointerOption;

@Accessors(chain = true)
@Data
public class CategorySingleAxis implements CategorySingleAxisOption {

    @Setter(AccessLevel.NONE)
    private Object width;

    public CategorySingleAxis setWidth(Number width) {
        this.width = width;
        return this;
    }

    public CategorySingleAxis setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public CategorySingleAxis setHeight(Number height) {
        this.height = height;
        return this;
    }

    public CategorySingleAxis setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public CategorySingleAxis setTop(Number top) {
        this.top = top;
        return this;
    }

    public CategorySingleAxis setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public CategorySingleAxis setRight(Number right) {
        this.right = right;
        return this;
    }

    public CategorySingleAxis setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public CategorySingleAxis setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public CategorySingleAxis setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public CategorySingleAxis setLeft(Number left) {
        this.left = left;
        return this;
    }

    public CategorySingleAxis setLeft(String left) {
        this.left = left;
        return this;
    }

    private String position;

    private String orient;

    private String mainType;

    private String type = "category";

    @Setter(AccessLevel.NONE)
    private Object id;

    public CategorySingleAxis setId(Number id) {
        this.id = id;
        return this;
    }

    public CategorySingleAxis setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public CategorySingleAxis setName(Number name) {
        this.name = name;
        return this;
    }

    public CategorySingleAxis setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public CategorySingleAxis setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public CategorySingleAxis setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public CategorySingleAxis setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public CategorySingleAxis setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public CategorySingleAxis setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public CategorySingleAxis setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public CategorySingleAxis setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public CategorySingleAxis setAnimationDelayUpdate(Object animationDelayUpdate) {
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

    public CategorySingleAxis setAxisLabel(AxisLabelBaseOption axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    public CategorySingleAxis setAxisLabel(Object axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    private CommonAxisPointerOption axisPointer;

    private AxisLineOption axisLine;

    @Setter(AccessLevel.NONE)
    private Object axisTick;

    public CategorySingleAxis setAxisTick(AxisTickOption axisTick) {
        this.axisTick = axisTick;
        return this;
    }

    public CategorySingleAxis setAxisTick(Object axisTick) {
        this.axisTick = axisTick;
        return this;
    }

    private MinorTickOption minorTick;

    private SplitLineOption splitLine;

    private MinorSplitLineOption minorSplitLine;

    private SplitAreaOption splitArea;

    @Setter(AccessLevel.NONE)
    private Object min;

    public CategorySingleAxis setMin(Number min) {
        this.min = min;
        return this;
    }

    public CategorySingleAxis setMin(String min) {
        this.min = min;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object max;

    public CategorySingleAxis setMax(Number max) {
        this.max = max;
        return this;
    }

    public CategorySingleAxis setMax(String max) {
        this.max = max;
        return this;
    }

    private Object[] data;

    private Boolean boundaryGap;

    private Boolean deduplication;
}
