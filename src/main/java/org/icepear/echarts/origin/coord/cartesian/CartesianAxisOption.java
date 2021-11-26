package org.icepear.echarts.origin.coord.cartesian;

import org.icepear.echarts.origin.coord.AxisBaseOption;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/cartesian/AxisModel.ts#L33
 */
public interface CartesianAxisOption extends AxisBaseOption {
    @Getter
    @Setter
    public Number gridIndex = null;

    @Getter
    @Setter
    public String gridId = null;

    @Getter
    @Setter
    public String position = null;

    @Getter
    @Setter
    public Number offset = null;

    @Getter
    @Setter
    public Object categorySortInfo = null;
}
