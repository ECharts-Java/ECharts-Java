package org.icepear.echarts.coord.cartesian;

import org.icepear.echarts.coord.AxisBaseOption;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/cartesian/AxisModel.ts#L33
 */
@Getter
@Setter
public class CartesianAxisOption {
    private AxisBaseOption axisBaseOption;

    private Integer gridIndex;

    private String gridId;

    private String position;

    private Integer offset;

    private Object categorySortInfo;
}
