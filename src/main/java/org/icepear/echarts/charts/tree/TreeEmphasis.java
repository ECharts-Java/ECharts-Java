package org.icepear.echarts.charts.tree;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.tree.TreeEmphasisOption;

@Accessors(chain = true)
@Data
public class TreeEmphasis implements TreeEmphasisOption {

    private Object blurScope;

    private String focus;

    private Boolean scale;
}
