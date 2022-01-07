package org.icepear.echarts.components.coord.parallel;

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
import org.icepear.echarts.origin.coord.parallel.CategoryParallelAxisOption;
import org.icepear.echarts.origin.util.CommonAxisPointerOption;

@Accessors(chain = true)
@Data
public class CategoryParallelAxis implements CategoryParallelAxisOption {

    @Setter(AccessLevel.NONE)
    private Object dim;

    public CategoryParallelAxis setDim(Number dim) {
        this.dim = dim;
        return this;
    }

    public CategoryParallelAxis setDim(Number[] dim) {
        this.dim = dim;
        return this;
    }

    private Number parallelIndex;

    private Object areaSelectStyle;

    private Boolean realtime;

    private String mainType;

    private String type = "category";

    @Setter(AccessLevel.NONE)
    private Object id;

    public CategoryParallelAxis setId(Number id) {
        this.id = id;
        return this;
    }

    public CategoryParallelAxis setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public CategoryParallelAxis setName(Number name) {
        this.name = name;
        return this;
    }

    public CategoryParallelAxis setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public CategoryParallelAxis setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public CategoryParallelAxis setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public CategoryParallelAxis setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public CategoryParallelAxis setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public CategoryParallelAxis setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public CategoryParallelAxis setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public CategoryParallelAxis setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public CategoryParallelAxis setAnimationDelayUpdate(Object animationDelayUpdate) {
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

    public CategoryParallelAxis setAxisLabel(AxisLabelBaseOption axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    public CategoryParallelAxis setAxisLabel(Object axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    private CommonAxisPointerOption axisPointer;

    private AxisLineOption axisLine;

    @Setter(AccessLevel.NONE)
    private Object axisTick;

    public CategoryParallelAxis setAxisTick(AxisTickOption axisTick) {
        this.axisTick = axisTick;
        return this;
    }

    public CategoryParallelAxis setAxisTick(Object axisTick) {
        this.axisTick = axisTick;
        return this;
    }

    private MinorTickOption minorTick;

    private SplitLineOption splitLine;

    private MinorSplitLineOption minorSplitLine;

    private SplitAreaOption splitArea;

    @Setter(AccessLevel.NONE)
    private Object min;

    public CategoryParallelAxis setMin(Number min) {
        this.min = min;
        return this;
    }

    public CategoryParallelAxis setMin(String min) {
        this.min = min;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object max;

    public CategoryParallelAxis setMax(Number max) {
        this.max = max;
        return this;
    }

    public CategoryParallelAxis setMax(String max) {
        this.max = max;
        return this;
    }

    private Object[] data;

    private Boolean boundaryGap;

    private Boolean deduplication;
}
