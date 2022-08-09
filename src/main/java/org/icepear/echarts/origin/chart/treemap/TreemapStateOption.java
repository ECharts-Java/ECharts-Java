package org.icepear.echarts.origin.chart.treemap;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/treemap/TreemapSeries.ts#L93
 */
public interface TreemapStateOption {

    TreemapStateOption setItemStyle(TreemapSeriesItemStyleOption itemStyle);

    TreemapStateOption setLabel(TreemapSeriesLabelOption label);

    TreemapStateOption setUpperLabel(TreemapSeriesLabelOption upperLabel);
}
