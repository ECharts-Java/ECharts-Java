package org.icepear.echarts.origin.util;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1669
 */
public interface SeriesOnCartesianOptionMixin {
    @Getter
    @Setter
    public Number xAxisIndex = null;

    @Getter
    @Setter
    public Number yAxisIndex = null;

    @Getter
    @Setter
    public String xAxisId = null;

    @Getter
    @Setter
    public String yAxisId = null;
}
