package org.icepear.echarts.origin.chart.graph;

import org.icepear.echarts.origin.util.EmphasisOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/graph/GraphSeries.ts#L184
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1541
 */
public interface GraphEmphasisOption extends EmphasisOption {

    GraphEmphasisOption setFocus(String focus);

    GraphEmphasisOption setScale(Boolean scale);

    GraphEmphasisOption setLabel(SeriesLabelOption label);

    GraphEmphasisOption setEdgeLabel(SeriesLabelOption edgeLabel);

    GraphEmphasisOption setItemStyle(ItemStyleOption itemStyle);

    GraphEmphasisOption setLineStyle(LineStyleOption lineStyle);
}
