package org.icepear.echarts.charts.graph;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.graph.GraphEmphasisOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class GraphEmphasis implements GraphEmphasisOption, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Object blurScope;

    private String focus;

    private Boolean scale;

    private SeriesLabelOption label;

    private SeriesLabelOption edgeLabel;

    private ItemStyleOption itemStyle;

    private LineStyleOption lineStyle;
}
