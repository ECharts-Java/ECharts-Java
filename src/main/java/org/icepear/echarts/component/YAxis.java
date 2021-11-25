package org.icepear.echarts.component;

import org.icepear.echarts.origin.coord.AxisBaseOption;
import org.icepear.echarts.origin.coord.cartesian.YAxisOption;

import lombok.Getter;
import lombok.Setter;

public class YAxis implements YAxisOption {
    @Getter
    @Setter
    private AxisBaseOption axisBaseOption;

    @Getter
    @Setter
    private Integer gridIndex = null;

    @Getter
    @Setter
    private String gridId = null;

    @Getter
    @Setter
    private String position = null;

    @Getter
    @Setter
    private Integer offset = null;

    @Getter
    @Setter
    private Object categorySortInfo = null;
}
