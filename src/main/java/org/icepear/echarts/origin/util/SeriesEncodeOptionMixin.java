package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1711
 */
public interface SeriesEncodeOptionMixin {

    SeriesEncodeOptionMixin setDatasetIndex(Number datasetIndex);

    SeriesEncodeOptionMixin setDatasetId(Number datasetId);

    SeriesEncodeOptionMixin setDatasetId(String datasetId);

    SeriesEncodeOptionMixin setSeriesLayoutBy(Object seriesLayoutBy);

    SeriesEncodeOptionMixin setSourceHeader(Object sourceHeader);

    SeriesEncodeOptionMixin setDimensions(Object[] dimensions);

    SeriesEncodeOptionMixin setEncode(OptionEncode encode);
}
