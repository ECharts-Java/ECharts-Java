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
import org.icepear.echarts.origin.coord.parallel.TimeParallelAxisOption;
import org.icepear.echarts.origin.util.CommonAxisPointerOption;

@Accessors(chain = true)
@Data
public class TimeParallelAxis implements TimeParallelAxisOption {

    @Setter(AccessLevel.NONE)
    private Object dim;

    public TimeParallelAxis setDim(Number dim) {
        this.dim = dim;
        return this;
    }

    public TimeParallelAxis setDim(Number[] dim) {
        this.dim = dim;
        return this;
    }

    private Number parallelIndex;

    private Object areaSelectStyle;

    private Boolean realtime;

    private String mainType;

    private String type = "time";

    @Setter(AccessLevel.NONE)
    private Object id;

    public TimeParallelAxis setId(Number id) {
        this.id = id;
        return this;
    }

    public TimeParallelAxis setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public TimeParallelAxis setName(Number name) {
        this.name = name;
        return this;
    }

    public TimeParallelAxis setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public TimeParallelAxis setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public TimeParallelAxis setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public TimeParallelAxis setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public TimeParallelAxis setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public TimeParallelAxis setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public TimeParallelAxis setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public TimeParallelAxis setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public TimeParallelAxis setAnimationDelayUpdate(Object animationDelayUpdate) {
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

    public TimeParallelAxis setAxisLabel(AxisLabelBaseOption axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    public TimeParallelAxis setAxisLabel(Object axisLabel) {
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

    public TimeParallelAxis setMin(Number min) {
        this.min = min;
        return this;
    }

    public TimeParallelAxis setMin(String min) {
        this.min = min;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object max;

    public TimeParallelAxis setMax(Number max) {
        this.max = max;
        return this;
    }

    public TimeParallelAxis setMax(String max) {
        this.max = max;
        return this;
    }

    private Object[] data;

    @Setter(AccessLevel.NONE)
    private Object boundaryGap;

    public TimeParallelAxis setBoundaryGap(Number[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    public TimeParallelAxis setBoundaryGap(String[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    private Number splitNumber;

    private Number interval;

    private Number minInterval;

    private Number maxInterval;
}
