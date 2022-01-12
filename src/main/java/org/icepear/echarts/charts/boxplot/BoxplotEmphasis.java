package org.icepear.echarts.charts.boxplot;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.boxplot.BoxplotEmphasisOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class BoxplotEmphasis implements BoxplotEmphasisOption {

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object blurScope;

    private String focus;

    private Boolean scale;
}
