package org.icepear.echarts.origin.coord;

import java.util.List;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L110
 */
public interface CategoryAxisBaseOption extends AxisBaseOption, AxisBaseOptionCommon {
    void setBoundaryGap(Boolean boundaryGap);

    void setData(List<Object> data);

    void setDeduplication(Boolean deduplication);
}
