package org.icepear.echarts.charts.sankey;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sankey.SankeyEdgeStyleOption;
import org.icepear.echarts.origin.chart.sankey.SankeyEmphasisOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class SankeyEmphasis implements SankeyEmphasisOption {

    private SeriesLabelOption label;

    private ItemStyleOption itemStyle;

    private SankeyEdgeStyleOption lineStyle;

    private Object blurScope;

    private String focus;
}
