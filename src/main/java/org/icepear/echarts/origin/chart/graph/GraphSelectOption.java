package org.icepear.echarts.origin.chart.graph;

import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/graph/GraphSeries.ts#L200
 */
public interface GraphSelectOption {

    GraphSelectOption setLabel(SeriesLabelOption label);

    GraphSelectOption setEdgeLabel(SeriesLabelOption edgeLabel);

    GraphSelectOption setItemStyle(ItemStyleOption itemStyle);

    GraphSelectOption setLineStyle(LineStyleOption lineStyle);
}
