package org.icepear.echarts.origin.chart.treemap;

import org.icepear.echarts.origin.util.DecalObject;
import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/treemap/TreemapSeries.ts#L136
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L624
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L625
 */
public interface TreemapSeriesNodeItemOption extends TreemapSeriesVisualOption, TreemapStateOption, StatesOptionMixin {

    TreemapSeriesNodeItemOption setId(Number id);

    TreemapSeriesNodeItemOption setId(String id);

    TreemapSeriesNodeItemOption setName(Number name);

    TreemapSeriesNodeItemOption setName(String name);

    TreemapSeriesNodeItemOption setValue(Number value);

    TreemapSeriesNodeItemOption setValue(Number[] value);

    TreemapSeriesNodeItemOption setChildren(TreemapSeriesNodeItemOption[] children);

    TreemapSeriesNodeItemOption setColor(String color);

    TreemapSeriesNodeItemOption setColor(String[] color);

    TreemapSeriesNodeItemOption setDecal(DecalObject[] decal);

    TreemapSeriesNodeItemOption setDecal(String decal);
}
