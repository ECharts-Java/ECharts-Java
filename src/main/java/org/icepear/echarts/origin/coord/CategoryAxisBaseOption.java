package org.icepear.echarts.origin.coord;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L110
 */
public interface CategoryAxisBaseOption extends AxisBaseOptionCommon {

    CategoryAxisBaseOption setType(String type);

    CategoryAxisBaseOption setBoundaryGap(Boolean boundaryGap);

    CategoryAxisBaseOption setAxisLabel(Object axisLabel);

    CategoryAxisBaseOption setData(Object[] data);

    CategoryAxisBaseOption setDeduplication(Boolean deduplication);

    CategoryAxisBaseOption setAxisTick(Object axisTick);
}
