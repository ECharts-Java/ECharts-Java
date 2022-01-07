package org.icepear.echarts.components.coord.cartesian;

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
import org.icepear.echarts.origin.coord.cartesian.LogAxisOption;
import org.icepear.echarts.origin.util.CommonAxisPointerOption;

@Accessors(chain = true)
@Data
public class LogAxis implements LogAxisOption {

    private Number gridIndex;

    private String gridId;

    private String position;

    private Number offset;

    private Object categorySortInfo;

    private String mainType;

    private String type = "log";

    @Setter(AccessLevel.NONE)
    private Object id;

    public LogAxis setId(Number id) {
        this.id = id;
        return this;
    }

    public LogAxis setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public LogAxis setName(Number name) {
        this.name = name;
        return this;
    }

    public LogAxis setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public LogAxis setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public LogAxis setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public LogAxis setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public LogAxis setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public LogAxis setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public LogAxis setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public LogAxis setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public LogAxis setAnimationDelayUpdate(Object animationDelayUpdate) {
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

    public LogAxis setAxisLabel(AxisLabelBaseOption axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    public LogAxis setAxisLabel(Object axisLabel) {
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

    public LogAxis setMin(Number min) {
        this.min = min;
        return this;
    }

    public LogAxis setMin(String min) {
        this.min = min;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object max;

    public LogAxis setMax(Number max) {
        this.max = max;
        return this;
    }

    public LogAxis setMax(String max) {
        this.max = max;
        return this;
    }

    private Object[] data;

    @Setter(AccessLevel.NONE)
    private Object boundaryGap;

    public LogAxis setBoundaryGap(Number[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    public LogAxis setBoundaryGap(String[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    private Number splitNumber;

    private Number interval;

    private Number minInterval;

    private Number maxInterval;

    private Number logBase;
}
