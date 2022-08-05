package org.icepear.echarts.origin.chart.treemap;

import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/treemap/TreemapSeries.ts#L198
 */
public interface BreadcrumbOption extends BoxLayoutOptionMixin {

    BreadcrumbOption setShow(Boolean show);

    BreadcrumbOption setHeight(Number height);

    BreadcrumbOption setEmptyItemWidth(Number emptyItemWidth);

    BreadcrumbOption setItemStyle(BreadcrumbItemStyleOption itemStyle);

    BreadcrumbOption setEmphasis(BreadcrumbEmphasisItemStyleOption emphasis);
}
