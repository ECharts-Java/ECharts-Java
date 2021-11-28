package org.icepear.echarts.component;

import org.icepear.echarts.origin.coord.AxisBaseOption;
import org.icepear.echarts.origin.coord.cartesian.XAxisOption;

import lombok.Data;

@Data
public class XAxis implements XAxisOption {
    private AxisBaseOption axisBaseOption;

    private Number gridIndex;

    private String gridId;

    private String position;

    private Number offset;

    private Object categorySortInfo;
}
