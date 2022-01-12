package org.icepear.echarts.charts.scatter;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.scatter.ScatterEmphasisOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class ScatterEmphasis implements ScatterEmphasisOption {

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object blurScope;

    private String focus;

    private Boolean scale;
}
