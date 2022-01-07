package org.icepear.echarts.origin.coord;

import org.icepear.echarts.origin.util.AnimationOptionMixin;
import org.icepear.echarts.origin.util.CommonAxisPointerOption;
import org.icepear.echarts.origin.util.ComponentOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L30
 */
public interface AxisBaseOptionCommon extends ComponentOption, AnimationOptionMixin {

    AxisBaseOptionCommon setType(String type);

    AxisBaseOptionCommon setShow(Boolean show);

    AxisBaseOptionCommon setInverse(Boolean inverse);

    AxisBaseOptionCommon setName(String name);

    AxisBaseOptionCommon setNameLocation(String nameLocation);

    AxisBaseOptionCommon setNameRotate(Number nameRotate);

    AxisBaseOptionCommon setNameTruncate(Object nameTruncate);

    AxisBaseOptionCommon setNameTextStyle(AxisNameTextStyleOption nameTextStyle);

    AxisBaseOptionCommon setNameGap(Number nameGap);

    AxisBaseOptionCommon setSilent(Boolean silent);

    AxisBaseOptionCommon setTriggerEvent(Boolean triggerEvent);

    AxisBaseOptionCommon setTooltip(Object tooltip);

    AxisBaseOptionCommon setAxisLabel(AxisLabelBaseOption axisLabel);

    AxisBaseOptionCommon setAxisPointer(CommonAxisPointerOption axisPointer);

    AxisBaseOptionCommon setAxisLine(AxisLineOption axisLine);

    AxisBaseOptionCommon setAxisTick(AxisTickOption axisTick);

    AxisBaseOptionCommon setMinorTick(MinorTickOption minorTick);

    AxisBaseOptionCommon setSplitLine(SplitLineOption splitLine);

    AxisBaseOptionCommon setMinorSplitLine(MinorSplitLineOption minorSplitLine);

    AxisBaseOptionCommon setSplitArea(SplitAreaOption splitArea);

    AxisBaseOptionCommon setMin(Number min);

    AxisBaseOptionCommon setMin(String min);

    AxisBaseOptionCommon setMax(Number max);

    AxisBaseOptionCommon setMax(String max);

    AxisBaseOptionCommon setData(Object[] data);
}
