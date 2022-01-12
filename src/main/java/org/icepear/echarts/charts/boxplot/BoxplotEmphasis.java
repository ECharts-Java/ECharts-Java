package org.icepear.echarts.charts.boxplot;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.boxplot.BoxplotEmphasisOption;

@Accessors(chain = true)
@Data
public class BoxplotEmphasis implements BoxplotEmphasisOption {

    private String focus;

    private Boolean scale;
}
