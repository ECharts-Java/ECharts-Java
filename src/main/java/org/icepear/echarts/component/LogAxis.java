package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.coord.AxisLabelBaseOption;
import org.icepear.echarts.origin.coord.AxisLineOption;
import org.icepear.echarts.origin.coord.AxisTickOption;
import org.icepear.echarts.origin.coord.LogAxisBaseOption;
import org.icepear.echarts.origin.coord.MinorSplitLineOption;
import org.icepear.echarts.origin.coord.SplitLineOption;
import org.icepear.echarts.origin.coord.cartesian.AxisOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class LogAxis implements AxisOption, LogAxisBaseOption {
    private Number gridIndex;

    private String gridId;

    private String position;

    private Number offset;

    private Object categorySortInfo;

    private Number logBase;

    private List<Number> boundaryGap;

    private Number splitNumber;

    private Number interval;

    private Number minInterval;

    private Number maxInterval;

    private Boolean show;

    private Boolean inverse;

    private String nameLocation;

    private Number nameRotate;

    private Object nameTruncate;

    private Object nameTextStyle;

    private Number nameGap;

    private Boolean silent;

    private Boolean triggerEvent;

    private Object tooltip;

    private AxisLabelBaseOption axisLabel;

    private Object axisPointer;

    private AxisLineOption axisLine;

    private AxisTickOption axisTick;

    private Object minorTick;

    private SplitLineOption splitLine;

    private MinorSplitLineOption minorSplitLine;

    private Object splitArea;

    private Number min;

    private Number max;

    private String mainType;

    private String type;

    private String id;

    private String name;

    private Number z;

    private Number zlevel;

    private String animation;

    private Number animationThreshold;

    private Number animationDuration;

    private String animationEasing;

    private Number animationDelay;

    private Number animationDurationUpdate;

    private String animationEasingUpdate;

    private Number animationDelayUpdate;
}
