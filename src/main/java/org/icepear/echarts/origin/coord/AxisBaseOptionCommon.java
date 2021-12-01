package org.icepear.echarts.origin.coord;

import org.icepear.echarts.origin.util.AnimationOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L30
 */
public interface AxisBaseOptionCommon extends ComponentOption, AnimationOptionMixin {
    AxisBaseOptionCommon setShow(Boolean show);

    AxisBaseOptionCommon setInverse(Boolean inverse);

    AxisBaseOptionCommon setNameLocation(String nameLocation);

    AxisBaseOptionCommon setNameRotate(Number nameRotate);

    AxisBaseOptionCommon setNameTruncate(Object nameTruncate);

    AxisBaseOptionCommon setNameTextStyle(Object nameTextStyle);

    AxisBaseOptionCommon setNameGap(Number nameGap);

    AxisBaseOptionCommon setSilent(Boolean silent);

    AxisBaseOptionCommon setTriggerEvent(Boolean triggerEvent);

    AxisBaseOptionCommon setTooltip(Object tooltip);

    AxisBaseOptionCommon setAxisLabel(Object axisLabel);

    AxisBaseOptionCommon setAxisPointer(Object axisPointer);

    AxisBaseOptionCommon setAxisLine(Object axisLine);

    AxisBaseOptionCommon setAxisTick(AxisTickOption axisTick);

    AxisBaseOptionCommon setMinorTick(Object minorTick);

    AxisBaseOptionCommon setSplitLine(SplitLineOption splitLine);

    AxisBaseOptionCommon setMinorSplitLine(MinorSplitLineOption minorSplitLine);

    AxisBaseOptionCommon setSplitArea(Object splitArea);

    AxisBaseOptionCommon setMin(Number min);

    AxisBaseOptionCommon setMax(Number max);
}
