package org.icepear.echarts.origin.chart.sankey;

import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/sankey/SankeySeries.ts#L47
 */
public interface SankeyNodeStateOption {

    SankeyNodeStateOption setLabel(SeriesLabelOption label);

    SankeyNodeStateOption setItemStyle(ItemStyleOption itemStyle);
}
