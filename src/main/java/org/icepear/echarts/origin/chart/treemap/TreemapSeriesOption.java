package org.icepear.echarts.origin.chart.treemap;

import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.RoamOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/treemap/TreemapSeries.ts#L150
 */
public interface TreemapSeriesOption
        extends SeriesOption, TreemapStateOption, BoxLayoutOptionMixin, RoamOptionMixin, TreemapSeriesVisualOption {

    TreemapSeriesOption setType(String type);

    TreemapSeriesOption setSize(Number[] size);

    TreemapSeriesOption setSize(String[] size);

    TreemapSeriesOption setSort(Boolean sort);

    TreemapSeriesOption setSort(String sort);

    TreemapSeriesOption setClipWindow(String clipWindow);

    TreemapSeriesOption setSquareRatio(Number squareRatio);

    TreemapSeriesOption setLeafDepth(Number leafDepth);

    TreemapSeriesOption setDrillDownIcon(String drillDownIcon);

    TreemapSeriesOption setZoomToNodeRatio(Number zoomToNodeRatio);

    TreemapSeriesOption setNodeClick(String nodeClick);

    TreemapSeriesOption setBreadcrumb(BreadcrumbOption breadcrumb);

    TreemapSeriesOption setLevels(TreemapSeriesLevelOption[] levels);

    TreemapSeriesOption setData(TreemapSeriesNodeItemOption[] data);

    TreemapSeriesOption setEmphasis(TreemapEmphasisOption emphasis);
}
