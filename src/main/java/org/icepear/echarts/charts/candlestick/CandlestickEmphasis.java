package org.icepear.echarts.charts.candlestick;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.candlestick.CandlestickEmphasisOption;
import org.icepear.echarts.origin.chart.candlestick.CandlestickItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class CandlestickEmphasis implements CandlestickEmphasisOption {

    private CandlestickItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object blurScope;

    private String focus;

    private Boolean scale;
}
