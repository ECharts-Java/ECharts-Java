package org.icepear.echarts.component;

import org.icepear.echarts.origin.coord.AxisBaseOption;
import org.icepear.echarts.origin.coord.cartesian.YAxisOption;

import lombok.Data;

@Data
public class YAxis implements YAxisOption {
    private AxisBaseOption axisBaseOption;

    private Number gridIndex;

    private String gridId;

    private String position;

    private Number offset;

    private Object categorySortInfo;
}
