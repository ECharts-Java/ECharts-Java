package org.icepear.echarts.origin.chart.treemap;

import org.icepear.echarts.origin.util.ItemStyleOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/treemap/TreemapSeries.ts#L61
 */
public interface TreemapSeriesItemStyleOption extends ItemStyleOption {

    TreemapSeriesItemStyleOption setBorderRadius(Number borderRadius);

    TreemapSeriesItemStyleOption setBorderRadius(Number[] borderRadius);

    TreemapSeriesItemStyleOption setColorAlpha(Number colorAlpha);

    TreemapSeriesItemStyleOption setColorSaturation(Number colorSaturation);

    TreemapSeriesItemStyleOption setBorderColorSaturation(Number borderColorSaturation);

    TreemapSeriesItemStyleOption setGapWidth(Number gapWidth);
}
