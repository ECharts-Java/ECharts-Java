package org.icepear.echarts.origin.util;

import java.util.List;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1711
 */
public interface SeriesEncodeOptionMixin {
    SeriesEncodeOptionMixin setDatasetIndex(Number datasetIndex);

    SeriesEncodeOptionMixin setDatasetId(String datasetId);

    // Duplicated with SeriesOption.setSeriesLayoutBy(String)
    // SeriesEncodeOptionMixin setSeriesLayoutBy(String seriesLayoutBy);

    SeriesEncodeOptionMixin setSourceHeader(String sourceHeader);

    SeriesEncodeOptionMixin setDimensions(List<Object> dimensions);

    SeriesEncodeOptionMixin setEncode(String encode);
}
