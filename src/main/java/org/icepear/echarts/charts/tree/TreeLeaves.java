package org.icepear.echarts.charts.tree;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.tree.TreeLeavesOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class TreeLeaves implements TreeLeavesOption, Serializable {

    private static final long serialVersionUID = 1L;

    private ItemStyleOption itemStyle;

    private Object lineStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;
}
