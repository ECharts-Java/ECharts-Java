package org.icepear.echarts.origin.chart.candlestick;

import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/candlestick/CandlestickSeries.ts#L47
 */
public interface CandlestickStateOption {

    CandlestickStateOption setItemStyle(CandlestickItemStyleOption itemStyle);

    CandlestickStateOption setLabel(SeriesLabelOption label);
}
