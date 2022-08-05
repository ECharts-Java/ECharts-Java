package org.icepear.echarts.origin.chart.treemap;

import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/treemap/TreemapSeries.ts#L56
 */
public interface TreemapSeriesLabelOption extends SeriesLabelOption {

    TreemapSeriesLabelOption setEllipsis(Boolean ellipsis);

    TreemapSeriesLabelOption setFormatter(String formatter);
}
