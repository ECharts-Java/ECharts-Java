package org.icepear.echarts.charts.map;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.map.MapEmphasisOption;
import org.icepear.echarts.origin.chart.map.MapItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class MapEmphasis implements MapEmphasisOption, Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean disabled;

    private String focus;

    private MapItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object blurScope;
}
