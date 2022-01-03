package org.icepear.echarts.charts.tree;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.tree.TreeLeavesOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class TreeLeaves implements TreeLeavesOption {

    private ItemStyleOption itemStyle;

    private Object lineStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;
}
