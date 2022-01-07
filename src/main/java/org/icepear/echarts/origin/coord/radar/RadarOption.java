package org.icepear.echarts.origin.coord.radar;

import org.icepear.echarts.origin.coord.AxisLabelBaseOption;
import org.icepear.echarts.origin.coord.AxisLineOption;
import org.icepear.echarts.origin.coord.AxisTickOption;
import org.icepear.echarts.origin.coord.SplitAreaOption;
import org.icepear.echarts.origin.coord.SplitLineOption;
import org.icepear.echarts.origin.util.CircleLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/radar/RadarModel.ts#L54
 */
public interface RadarOption extends ComponentOption, CircleLayoutOptionMixin {

    RadarOption setMainType(String mainType);

    RadarOption setStartAngle(Number startAngle);

    RadarOption setShape(String shape);

    RadarOption setAxisLine(AxisLineOption axisLine);

    RadarOption setAxisTick(AxisTickOption axisTick);

    RadarOption setAxisLabel(AxisLabelBaseOption axisLabel);

    RadarOption setSplitLine(SplitLineOption splitLine);

    RadarOption setSplitArea(SplitAreaOption splitArea);

    RadarOption setAxisName(RadarAxisNameOption axisName);

    RadarOption setAxisNameGap(Number axisNameGap);

    RadarOption setTriggerEvent(Boolean triggerEvent);

    RadarOption setScale(Boolean scale);

    RadarOption setSplitNumber(Number splitNumber);

    RadarOption setBoundaryGap(Boolean boundaryGap);

    RadarOption setBoundaryGap(Number[] boundaryGap);

    RadarOption setBoundaryGap(String[] boundaryGap);

    RadarOption setIndicator(RadarIndicatorOption[] indicator);
}
