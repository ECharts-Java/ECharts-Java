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
    private List<Integer> boundaryGap = null;

    @Getter
    @Setter
    private Integer splitNumber = null;

    @Getter
    @Setter
    private Integer interval = null;

    @Getter
    @Setter
    private Integer minInterval = null;

    @Getter
    @Setter
    private Integer maxInterval = null;

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
    private Integer nameRotate = null;

    @Getter
    @Setter
    private Object nameTruncate = null;

    @Getter
    @Setter
    private Object nameTextStyle = null;

    @Getter
    @Setter
    private Integer nameGap = null;

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
    private Integer min = null;

    @Getter
    @Setter
    private Integer max = null;

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
    private Integer z = null;

    @Getter
    @Setter
    private Integer zlevel = null;

    @Getter
    @Setter
    private String animation = null;

    @Getter
    @Setter
    private Integer animationThreshold = null;

    @Getter
    @Setter
    private Integer animationDuration = null;

    @Getter
    @Setter
    private String animationEasing = null;

    @Getter
    @Setter
    private Integer animationDelay = null;

    @Getter
    @Setter
    private Integer animationDurationUpdate = null;

    @Getter
    @Setter
    private String animationEasingUpdate = null;

    @Getter
    @Setter
    private Integer animationDelayUpdate = null;
}
