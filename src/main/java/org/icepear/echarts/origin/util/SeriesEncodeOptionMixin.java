package org.icepear.echarts.origin.util;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1711
 */
public interface SeriesEncodeOptionMixin {
    @Getter
    @Setter
    public Integer datasetIndex = null;

    @Getter
    @Setter
    public String datasetId = null;

    @Getter
    @Setter
    public String seriesLayoutBy = null;

    @Getter
    @Setter
    public String sourceHeader = null;

    @Getter
    @Setter
    public List<Object> dimensions = null;

    @Getter
    @Setter
    public String encode = null;
}
