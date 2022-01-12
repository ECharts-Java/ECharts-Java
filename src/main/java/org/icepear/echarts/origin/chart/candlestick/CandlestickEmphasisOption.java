package org.icepear.echarts.origin.chart.candlestick;

import org.icepear.echarts.origin.util.EmphasisOption;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/candlestick/CandlestickSeries.ts#L57
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1541
 */
public interface CandlestickEmphasisOption extends CandlestickStateOption, EmphasisOption {

    CandlestickEmphasisOption setFocus(String focus);

    CandlestickEmphasisOption setScale(Boolean scale);
}
