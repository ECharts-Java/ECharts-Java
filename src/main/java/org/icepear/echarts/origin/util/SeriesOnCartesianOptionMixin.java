package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1669
 */
public interface SeriesOnCartesianOptionMixin {
    void setXAxisIndex(Number xAxisIndex);

    void setYAxisIndex(Number yAxisIndex);

    void setXAxisId(String xAxisId);

    void setYAxisId(String yAxisId);
}
