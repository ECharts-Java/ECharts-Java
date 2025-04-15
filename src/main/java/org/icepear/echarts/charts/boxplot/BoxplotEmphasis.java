package org.icepear.echarts.charts.boxplot;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.boxplot.BoxplotEmphasisOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class BoxplotEmphasis implements BoxplotEmphasisOption, Serializable {

    private static final long serialVersionUID = 1L;

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object blurScope;

    private String focus;

    private Boolean scale;
}
