package org.icepear.echarts.origin.chart.treemap;

import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LabelOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/treemap/TreemapSeries.ts#L51
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1090
 */
public interface BreadcrumbItemStyleOption extends ItemStyleOption {

    BreadcrumbItemStyleOption setTextStyle(LabelOption textStyle);
}
