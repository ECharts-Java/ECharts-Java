package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.coord.AxisTickOption;
import org.icepear.echarts.origin.coord.CategoryAxisBaseOption;
import org.icepear.echarts.origin.coord.cartesian.AxisOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class CategoryAxis implements AxisOption, CategoryAxisBaseOption {
    private Number gridIndex;

    private String gridId;

    private String position;

    private Number offset;

    private Object categorySortInfo;

    private Boolean boundaryGap;

    private List<Object> data;

    private Boolean deduplication;

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

    private Object axisLabel;

    private Object axisPointer;

    private Object axisLine;

    private AxisTickOption axisTick;

    private Object minorTick;

    private Object splitLine;

    private Object minorSplitLine;

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
