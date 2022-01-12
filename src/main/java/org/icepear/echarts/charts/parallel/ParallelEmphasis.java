package org.icepear.echarts.charts.parallel;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.parallel.ParallelEmphasisOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class ParallelEmphasis implements ParallelEmphasisOption {

    private String focus;

    private LineStyleOption lineStyle;

    private SeriesLabelOption label;

    private Object blurScope;
}
