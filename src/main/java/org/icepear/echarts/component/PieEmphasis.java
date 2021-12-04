package org.icepear.echarts.component;

import org.icepear.echarts.origin.chart.pie.PieEmphasisOption;
import org.icepear.echarts.origin.chart.pie.PieItemStyleOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain = true)
@Data
public class PieEmphasis implements PieEmphasisOption {
    private String focus;

    private Boolean scale;

    private Number scaleSize;

    private Object blurScope;

    private PieItemStyleOption itemStyle;

    private Object label;
}
