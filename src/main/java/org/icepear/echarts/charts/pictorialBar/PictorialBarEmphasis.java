package org.icepear.echarts.charts.pictorialBar;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.bar.BarItemStyleOption;
import org.icepear.echarts.origin.chart.bar.BarLabelOption;
import org.icepear.echarts.origin.chart.pictorialBar.PictorialBarEmphasisOption;

@Accessors(chain = true)
@Data
public class PictorialBarEmphasis implements PictorialBarEmphasisOption, Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean disabled;

    private String focus;

    private BarItemStyleOption itemStyle;

    private BarLabelOption label;

    private Object blurScope;
}
