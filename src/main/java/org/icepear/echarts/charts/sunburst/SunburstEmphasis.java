package org.icepear.echarts.charts.sunburst;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sunburst.SunburstEmphasisOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstItemStyleOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstLabelOption;

@Accessors(chain = true)
@Data
public class SunburstEmphasis implements SunburstEmphasisOption {

    private SunburstItemStyleOption itemStyle;

    private SunburstLabelOption label;

    private Object blurScope;

    private String focus;
}
