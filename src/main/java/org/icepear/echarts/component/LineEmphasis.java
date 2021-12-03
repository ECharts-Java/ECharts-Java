package org.icepear.echarts.component;

import org.icepear.echarts.origin.chart.line.LineEmphasisOption;
import org.icepear.echarts.origin.util.AreaStyleOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LabelOption;
import org.icepear.echarts.origin.util.LineStyleOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class LineEmphasis implements LineEmphasisOption {
    private String focus;

    private Boolean scale;

    private LineStyleOption lineStyle;

    private AreaStyleOption areaStyle;

    private Object blurScope;

    private ItemStyleOption itemStyle;

    private LabelOption label;

    private LabelOption endLabel;
}
