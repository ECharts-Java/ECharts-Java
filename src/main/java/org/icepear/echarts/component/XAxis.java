package org.icepear.echarts.component;

import org.icepear.echarts.origin.coord.AxisBaseOption;
import org.icepear.echarts.origin.coord.cartesian.XAxisOption;

import lombok.Getter;
import lombok.Setter;

public class XAxis implements XAxisOption {
    @Getter
    @Setter
    private AxisBaseOption axisBaseOption;

    @Getter
    @Setter
    private Number gridIndex = null;

    @Getter
    @Setter
    private String gridId = null;

    @Getter
    @Setter
    private String position = null;

    @Getter
    @Setter
    private Number offset = null;

    @Getter
    @Setter
    private Object categorySortInfo = null;
}
