package org.icepear.echarts.charts.treemap;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.treemap.TreemapEmphasisOption;
import org.icepear.echarts.origin.chart.treemap.TreemapSeriesItemStyleOption;
import org.icepear.echarts.origin.chart.treemap.TreemapSeriesLabelOption;

@Accessors(chain = true)
@Data
public class TreemapEmphasis implements TreemapEmphasisOption {

    private TreemapSeriesItemStyleOption itemStyle;

    private TreemapSeriesLabelOption label;

    private TreemapSeriesLabelOption upperLabel;

    private Object blurScope;

    private String focus;
}
