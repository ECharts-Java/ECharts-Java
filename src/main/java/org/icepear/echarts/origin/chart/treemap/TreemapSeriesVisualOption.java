package org.icepear.echarts.origin.chart.treemap;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/treemap/TreemapSeries.ts#L99
 */
public interface TreemapSeriesVisualOption {

    TreemapSeriesVisualOption setVisualDimension(Number visualDimension);

    TreemapSeriesVisualOption setVisualDimension(String visualDimension);

    TreemapSeriesVisualOption setColorMappingBy(String colorMappingBy);

    TreemapSeriesVisualOption setVisualMin(Number visualMin);

    TreemapSeriesVisualOption setVisualMax(Number visualMax);

    TreemapSeriesVisualOption setColorAlpha(Number[] colorAlpha);

    TreemapSeriesVisualOption setColorAlpha(String colorAlpha);

    TreemapSeriesVisualOption setColorSaturation(Number[] colorSaturation);

    TreemapSeriesVisualOption setColorSaturation(String colorSaturation);

    TreemapSeriesVisualOption setVisibleMin(Number visibleMin);

    TreemapSeriesVisualOption setChildrenVisibleMin(Number childrenVisibleMin);
}
