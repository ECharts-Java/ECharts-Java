package org.icepear.echarts.origin.coord;

import java.util.List;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L110
 */
public interface CategoryAxisBaseOption extends AxisBaseOption, AxisBaseOptionCommon {
    CategoryAxisBaseOption setBoundaryGap(Boolean boundaryGap);

    CategoryAxisBaseOption setData(List<Object> data);

    CategoryAxisBaseOption setDeduplication(Boolean deduplication);

    CategoryAxisBaseOption setAxisTick(AxisTickOption axisTick);
}
