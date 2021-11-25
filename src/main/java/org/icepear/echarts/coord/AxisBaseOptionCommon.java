package org.icepear.echarts.coord;

import org.icepear.echarts.util.AnimationOptionMixin;
import org.icepear.echarts.util.ComponentOption;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L30
 */
@Getter
@Setter
public class AxisBaseOptionCommon {
    private ComponentOption componentOption;

    private AnimationOptionMixin animationOptionMixin;

    private Boolean show;

    private Boolean inverse;

    private String nameLocation;
    
    private Integer nameRotate;

    private Object nameTruncate;

    private Object nameTextStyle;

    private Integer nameGap;

    private Boolean silent;
    
    private Boolean triggerEvent;

    private Object tooltip;

    private Object axisLabel;

    private Object axisPointer;

    private Object axisLine;

    private Object axisTick;

    private Object minorTick;

    private Object splitLine;

    private Object minorSplitLine;

    private Object splitArea;

    private Integer min;

    private Integer max;
}
