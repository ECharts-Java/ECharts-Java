package org.icepear.echarts.charts.heatmap;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.heatmap.HeatmapEmphasisOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class HeatmapEmphasis implements HeatmapEmphasisOption, Serializable {

    private static final long serialVersionUID = 1L;

    private String focus;

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object blurScope;
}
