package org.icepear.echarts.origin.coord.cartesian;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/cartesian/AxisModel.ts#L33
 */
public interface CartesianAxisOption {

    CartesianAxisOption setGridIndex(Number gridIndex);

    CartesianAxisOption setGridId(String gridId);

    CartesianAxisOption setPosition(String position);

    CartesianAxisOption setOffset(Number offset);

    CartesianAxisOption setCategorySortInfo(Object categorySortInfo);
}
