package org.icepear.echarts.origin.coord;

import org.icepear.echarts.origin.util.AnimationOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L30
 */
public interface AxisBaseOptionCommon extends ComponentOption, AnimationOptionMixin {
    @Getter
    @Setter
    public Boolean show = null;

    @Getter
    @Setter
    public Boolean inverse = null;

    @Getter
    @Setter
    public String nameLocation = null;

    @Getter
    @Setter
    public Integer nameRotate = null;

    @Getter
    @Setter
    public Object nameTruncate = null;

    @Getter
    @Setter
    public Object nameTextStyle = null;

    @Getter
    @Setter
    public Integer nameGap = null;

    @Getter
    @Setter
    public Boolean silent = null;

    @Getter
    @Setter
    public Boolean triggerEvent = null;

    @Getter
    @Setter
    public Object tooltip = null;

    @Getter
    @Setter
    public Object axisLabel = null;

    @Getter
    @Setter
    public Object axisPointer = null;

    @Getter
    @Setter
    public Object axisLine = null;

    @Getter
    @Setter
    public Object axisTick = null;

    @Getter
    @Setter
    public Object minorTick = null;

    @Getter
    @Setter
    public Object splitLine = null;

    @Getter
    @Setter
    public Object minorSplitLine = null;

    @Getter
    @Setter
    public Object splitArea = null;

    @Getter
    @Setter
    public Integer min = null;

    @Getter
    @Setter
    public Integer max = null;
}
