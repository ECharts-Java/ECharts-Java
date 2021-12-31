package org.icepear.echarts.charts.bar;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.bar.BarEmphasisOption;

@Accessors(chain = true)
@Data
public class BarEmphasis implements BarEmphasisOption {

    private String focus;

    private Object blurScope;
}
