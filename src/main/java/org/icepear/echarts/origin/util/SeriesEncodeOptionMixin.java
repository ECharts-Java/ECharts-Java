package org.icepear.echarts.origin.util;

import java.util.List;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1711
 */
public interface SeriesEncodeOptionMixin {
    void setDatasetIndex(Number datasetIndex);

    void setDatasetId(String datasetId);

    void setSeriesLayoutBy(String seriesLayoutBy);

    void setSourceHeader(String sourceHeader);

    void setDimensions(List<Object> dimensions);

    void setEncode(String encode);
}
