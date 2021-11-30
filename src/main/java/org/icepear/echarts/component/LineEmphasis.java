package org.icepear.echarts.component;

import org.icepear.echarts.origin.chart.line.LineEmphasisOption;
import org.icepear.echarts.origin.util.LabelOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class LineEmphasis implements LineEmphasisOption {
    private String focus;

    private Boolean scale;

    private Object lineStyle;

    private Object areaStyle;

    private Object blurScope;

    private Object itemStyle;

    private LabelOption label;

    private LabelOption endLabel;
}
