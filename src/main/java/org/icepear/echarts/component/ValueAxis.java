package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.coord.ValueAxisBaseOption;

import lombok.Getter;
import lombok.Setter;

public class ValueAxis implements ValueAxisBaseOption {
    @Getter
    @Setter
    private Boolean scale = null;

    @Getter
    @Setter
    private List<Number> boundaryGap = null;

    @Getter
    @Setter
    private Number splitNumber = null;

    @Getter
    @Setter
    private Number interval = null;

    @Getter
    @Setter
    private Number minInterval = null;

    @Getter
    @Setter
    private Number maxInterval = null;

    @Getter
    @Setter
    private Boolean show = null;

    @Getter
    @Setter
    private Boolean inverse = null;

    @Getter
    @Setter
    private String nameLocation = null;

    @Getter
    @Setter
    private Number nameRotate = null;

    @Getter
    @Setter
    private Object nameTruncate = null;

    @Getter
    @Setter
    private Object nameTextStyle = null;

    @Getter
    @Setter
    private Number nameGap = null;

    @Getter
    @Setter
    private Boolean silent = null;

    @Getter
    @Setter
    private Boolean triggerEvent = null;

    @Getter
    @Setter
    private Object tooltip = null;

    @Getter
    @Setter
    private Object axisLabel = null;

    @Getter
    @Setter
    private Object axisPointer = null;

    @Getter
    @Setter
    private Object axisLine = null;

    @Getter
    @Setter
    private Object axisTick = null;

    @Getter
    @Setter
    private Object minorTick = null;

    @Getter
    @Setter
    private Object splitLine = null;

    @Getter
    @Setter
    private Object minorSplitLine = null;

    @Getter
    @Setter
    private Object splitArea = null;

    @Getter
    @Setter
    private Number min = null;

    @Getter
    @Setter
    private Number max = null;

    @Getter
    @Setter
    private String mainType = null;

    @Getter
    @Setter
    private String type = null;

    @Getter
    @Setter
    private String id = null;

    @Getter
    @Setter
    private String name = null;

    @Getter
    @Setter
    private Number z = null;

    @Getter
    @Setter
    private Number zlevel = null;

    @Getter
    @Setter
    private String animation = null;

    @Getter
    @Setter
    private Number animationThreshold = null;

    @Getter
    @Setter
    private Number animationDuration = null;

    @Getter
    @Setter
    private String animationEasing = null;

    @Getter
    @Setter
    private Number animationDelay = null;

    @Getter
    @Setter
    private Number animationDurationUpdate = null;

    @Getter
    @Setter
    private String animationEasingUpdate = null;

    @Getter
    @Setter
    private Number animationDelayUpdate = null;
}
