package org.icepear.echarts.charts.tree;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.tree.TreeSeriesLeavesOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain=true)
@Data
public class TreeSeriesLeaves implements TreeSeriesLeavesOption {

	private ItemStyleOption itemStyle;

	private Object lineStyle;

	private SeriesLabelOption label;

	private Object emphasis;

	private Object select;

	private Object blur;
}
