package org.icepear.echarts.origin.coord.cartesian;

import org.icepear.echarts.origin.coord.AxisBaseOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/cartesian/AxisModel.ts#L33
 */
public interface CartesianAxisOption extends AxisBaseOption {
    void setGridIndex(Number gridIndex);

    void setGridId(String gridId);

    void setPosition(String position);

    void setOffset(Number offset);

    void setCategorySortInfo(Object categorySortInfo);
}
