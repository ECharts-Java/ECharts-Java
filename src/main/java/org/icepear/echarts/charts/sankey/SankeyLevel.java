package org.icepear.echarts.charts.sankey;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sankey.SankeyEdgeStyleOption;
import org.icepear.echarts.origin.chart.sankey.SankeyLevelOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class SankeyLevel implements SankeyLevelOption {

    private SeriesLabelOption label;

    private ItemStyleOption itemStyle;

    private SankeyEdgeStyleOption lineStyle;

    private Number depth;
}
