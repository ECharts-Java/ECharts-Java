package org.icepear.echarts.origin.coord;

import org.icepear.echarts.origin.util.AnimationOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L30
 */
public interface AxisBaseOptionCommon extends ComponentOption, AnimationOptionMixin {
    void setShow(Boolean show);

    void setInverse(Boolean inverse);

    void setNameLocation(String nameLocation);

    void setNameRotate(Number nameRotate);

    void setNameTruncate(Object nameTruncate);

    void setNameTextStyle(Object nameTextStyle);

    void setNameGap(Number nameGap);

    void setSilent(Boolean silent);

    void setTriggerEvent(Boolean triggerEvent);

    void setTooltip(Object tooltip);

    void setAxisLabel(Object axisLabel);

    void setAxisPointer(Object axisPointer);

    void setAxisLine(Object axisLine);

    void setAxisTick(Object axisTick);

    void setMinorTick(Object minorTick);

    void setSplitLine(Object splitLine);

    void setMinorSplitLine(Object minorSplitLine);

    void setSplitArea(Object splitArea);

    void setMin(Number min);

    void setMax(Number max);
}
