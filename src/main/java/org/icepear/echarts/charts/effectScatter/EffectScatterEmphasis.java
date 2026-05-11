package org.icepear.echarts.charts.effectScatter;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.effectScatter.EffectScatterEmphasisOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class EffectScatterEmphasis implements EffectScatterEmphasisOption, Serializable {

    private static final long serialVersionUID = 1L;

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object blurScope;

    private String focus;

    private Boolean scale;

    private Boolean disabled;
}
