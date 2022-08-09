package org.icepear.echarts.origin.chart.treemap;

import org.icepear.echarts.origin.util.DecalObject;
import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/treemap/TreemapSeries.ts#L129
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/util/types.ts#L69
 */
public interface TreemapSeriesLevelOption extends TreemapSeriesVisualOption, TreemapStateOption, StatesOptionMixin {

    TreemapSeriesLevelOption setColor(String color);

    TreemapSeriesLevelOption setColor(String[] color);

    TreemapSeriesLevelOption setDecal(DecalObject[] decal);

    TreemapSeriesLevelOption setDecal(String decal);
}
