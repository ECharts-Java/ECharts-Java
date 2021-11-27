package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.coord.CategoryAxisBaseOption;

import lombok.Data;

@Data
public class CategoryAxis implements CategoryAxisBaseOption {
    private Boolean boundaryGap = null;

    private List<Object> data = null;

    private Boolean deduplication = null;

    private Boolean show = null;

    private Boolean inverse = null;

    private String nameLocation = null;

    private Number nameRotate = null;

    private Object nameTruncate = null;

    private Object nameTextStyle = null;

    private Number nameGap = null;

    private Boolean silent = null;

    private Boolean triggerEvent = null;

    private Object tooltip = null;

    private Object axisLabel = null;

    private Object axisPointer = null;

    private Object axisLine = null;

    private Object axisTick = null;

    private Object minorTick = null;

    private Object splitLine = null;

    private Object minorSplitLine = null;

    private Object splitArea = null;

    private Number min = null;

    private Number max = null;

    private String mainType = null;

    private String type = null;

    private String id = null;

    private String name = null;

    private Number z = null;

    private Number zlevel = null;

    private String animation = null;

    private Number animationThreshold = null;

    private Number animationDuration = null;

    private String animationEasing = null;

    private Number animationDelay = null;

    private Number animationDurationUpdate = null;

    private String animationEasingUpdate = null;

    private Number animationDelayUpdate = null;
}
