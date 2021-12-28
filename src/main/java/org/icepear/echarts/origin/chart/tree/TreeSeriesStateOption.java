package org.icepear.echarts.origin.chart.tree;

import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/tree/TreeSeries.ts#L47
 */
public interface TreeSeriesStateOption {

    TreeSeriesStateOption setItemStyle(ItemStyleOption itemStyle);

    TreeSeriesStateOption setLineStyle(Object lineStyle);

    TreeSeriesStateOption setLabel(SeriesLabelOption label);
}
