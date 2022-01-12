package org.icepear.echarts.charts.heatmap;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.heatmap.HeatmapEmphasisOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class HeatmapEmphasis implements HeatmapEmphasisOption {

    private String focus;

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object blurScope;
}
