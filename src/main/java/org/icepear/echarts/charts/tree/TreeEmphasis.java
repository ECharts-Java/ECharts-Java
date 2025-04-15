package org.icepear.echarts.charts.tree;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.tree.TreeEmphasisOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class TreeEmphasis implements TreeEmphasisOption, Serializable {

    private static final long serialVersionUID = 1L;

    private ItemStyleOption itemStyle;

    private Object lineStyle;

    private SeriesLabelOption label;

    private Object blurScope;

    private String focus;

    private Boolean scale;
}
