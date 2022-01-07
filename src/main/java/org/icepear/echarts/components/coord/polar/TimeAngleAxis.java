package org.icepear.echarts.components.coord.polar;

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
import org.icepear.echarts.origin.coord.polar.TimeAngleAxisOption;
import org.icepear.echarts.origin.util.CommonAxisPointerOption;

@Accessors(chain = true)
@Data
public class TimeAngleAxis implements TimeAngleAxisOption {

    private Number polarIndex;

    private String polarId;

    private Number startAngle;

    private Boolean clockwise;

    private String mainType;

    private String type = "time";

    @Setter(AccessLevel.NONE)
    private Object id;

    public TimeAngleAxis setId(Number id) {
        this.id = id;
        return this;
    }

    public TimeAngleAxis setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public TimeAngleAxis setName(Number name) {
        this.name = name;
        return this;
    }

    public TimeAngleAxis setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private Boolean animation;

    private Number animationThreshold;

    @Setter(AccessLevel.NONE)
    private Object animationDuration;

    public TimeAngleAxis setAnimationDuration(Number animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public TimeAngleAxis setAnimationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    private Object animationEasing;

    @Setter(AccessLevel.NONE)
    private Object animationDelay;

    public TimeAngleAxis setAnimationDelay(Number animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    public TimeAngleAxis setAnimationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object animationDurationUpdate;

    public TimeAngleAxis setAnimationDurationUpdate(Number animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    public TimeAngleAxis setAnimationDurationUpdate(Object animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    private Object animationEasingUpdate;

    @Setter(AccessLevel.NONE)
    private Object animationDelayUpdate;

    public TimeAngleAxis setAnimationDelayUpdate(Number animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return this;
    }

    public TimeAngleAxis setAnimationDelayUpdate(Object animationDelayUpdate) {
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

    public TimeAngleAxis setAxisLabel(AxisLabelBaseOption axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    public TimeAngleAxis setAxisLabel(Object axisLabel) {
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

    public TimeAngleAxis setMin(Number min) {
        this.min = min;
        return this;
    }

    public TimeAngleAxis setMin(String min) {
        this.min = min;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object max;

    public TimeAngleAxis setMax(Number max) {
        this.max = max;
        return this;
    }

    public TimeAngleAxis setMax(String max) {
        this.max = max;
        return this;
    }

    private Object[] data;

    @Setter(AccessLevel.NONE)
    private Object boundaryGap;

    public TimeAngleAxis setBoundaryGap(Number[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    public TimeAngleAxis setBoundaryGap(String[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    private Number splitNumber;

    private Number interval;

    private Number minInterval;

    private Number maxInterval;
}
