package org.icepear.echarts.charts.sunburst;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sunburst.SunburstEmphasisOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstItemStyleOption;
import org.icepear.echarts.origin.chart.sunburst.SunburstLabelOption;

@Accessors(chain = true)
@Data
public class SunburstEmphasis implements SunburstEmphasisOption, Serializable {

    private static final long serialVersionUID = 1L;

    private SunburstItemStyleOption itemStyle;

    private SunburstLabelOption label;

    private Object blurScope;

    private String focus;
}
