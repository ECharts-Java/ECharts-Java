package org.icepear.echarts.charts.lines;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.lines.LinesEmphasisOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class LinesEmphasis implements LinesEmphasisOption, Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean disabled;

    private String focus;

    private LineStyleOption lineStyle;

    private SeriesLabelOption label;

    private Object blurScope;
}
