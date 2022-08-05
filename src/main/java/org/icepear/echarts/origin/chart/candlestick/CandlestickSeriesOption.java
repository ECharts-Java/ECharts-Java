package org.icepear.echarts.origin.chart.candlestick;

import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesLargeOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnCartesianOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/candlestick/CandlestickSeries.ts#L63
 */
public interface CandlestickSeriesOption extends SeriesOption, CandlestickStateOption, SeriesOnCartesianOptionMixin,
        SeriesLargeOptionMixin, SeriesEncodeOptionMixin {

    CandlestickSeriesOption setType(String type);

    CandlestickSeriesOption setCoordinateSystem(String coordinateSystem);

    CandlestickSeriesOption setLayout(String layout);

    CandlestickSeriesOption setClip(Boolean clip);

    CandlestickSeriesOption setBarMaxWidth(Number barMaxWidth);

    CandlestickSeriesOption setBarMaxWidth(String barMaxWidth);

    CandlestickSeriesOption setBarMinWidth(Number barMinWidth);

    CandlestickSeriesOption setBarMinWidth(String barMinWidth);

    CandlestickSeriesOption setBarWidth(Number barWidth);

    CandlestickSeriesOption setBarWidth(String barWidth);

    CandlestickSeriesOption setData(CandlestickDataItemOption[] data);

    CandlestickSeriesOption setData(Number[][] data);

    CandlestickSeriesOption setEmphasis(CandlestickEmphasisOption emphasis);
}
