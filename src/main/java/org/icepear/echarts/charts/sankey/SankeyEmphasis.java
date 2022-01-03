package org.icepear.echarts.charts.sankey;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sankey.SankeyEmphasisOption;

@Accessors(chain = true)
@Data
public class SankeyEmphasis implements SankeyEmphasisOption {

    private Object blurScope;

    private String focus;
}
