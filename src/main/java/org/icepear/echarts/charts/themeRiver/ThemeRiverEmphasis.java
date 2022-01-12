package org.icepear.echarts.charts.themeRiver;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.themeRiver.ThemeRiverEmphasisOption;
import org.icepear.echarts.origin.chart.themeRiver.ThemeRiverLabelOption;
import org.icepear.echarts.origin.util.ItemStyleOption;

@Accessors(chain = true)
@Data
public class ThemeRiverEmphasis implements ThemeRiverEmphasisOption {

    private String focus;

    private ThemeRiverLabelOption label;

    private ItemStyleOption itemStyle;

    private Object blurScope;
}
