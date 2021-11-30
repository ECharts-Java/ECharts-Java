package org.icepear.echarts.component;

import org.icepear.echarts.origin.coord.AxisBaseOption;
import org.icepear.echarts.origin.coord.cartesian.AxisOption;

import lombok.Data;

@Data
public class Axis implements AxisOption {
    private AxisBaseOption axisBaseOption;

    private Number gridIndex;

    private String gridId;

    private String position;

    private Number offset;

    private Object categorySortInfo;
}
