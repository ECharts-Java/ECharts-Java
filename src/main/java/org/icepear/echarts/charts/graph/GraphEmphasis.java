package org.icepear.echarts.charts.graph;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.graph.GraphEmphasisOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class GraphEmphasis implements GraphEmphasisOption {

    private Object blurScope;

    private String focus;

    private Boolean scale;

    private SeriesLabelOption label;

    private SeriesLabelOption edgeLabel;

    private ItemStyleOption itemStyle;

    private LineStyleOption lineStyle;
}
