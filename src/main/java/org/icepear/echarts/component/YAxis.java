package org.icepear.echarts.component;

import org.icepear.echarts.origin.coord.AxisBaseOption;
import org.icepear.echarts.origin.coord.cartesian.YAxisOption;

import lombok.Data;

@Data
public class YAxis implements YAxisOption {
    private AxisBaseOption axisBaseOption;

    private Number gridIndex = null;

    private String gridId = null;

    private String position = null;

    private Number offset = null;

    private Object categorySortInfo = null;
}
