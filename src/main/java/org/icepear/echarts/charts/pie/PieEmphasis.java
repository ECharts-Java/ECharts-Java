package org.icepear.echarts.charts.pie;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.pie.PieEmphasisOption;
import org.icepear.echarts.origin.chart.pie.PieItemStyleOption;
import org.icepear.echarts.origin.chart.pie.PieLabelOption;

@Accessors(chain = true)
@Data
public class PieEmphasis implements PieEmphasisOption, Serializable {

    private static final long serialVersionUID = 1L;

    private PieItemStyleOption itemStyle;

    private PieLabelOption label;

    private Object blurScope;

    private String focus;

    private Boolean scale;

    private Number scaleSize;
}
