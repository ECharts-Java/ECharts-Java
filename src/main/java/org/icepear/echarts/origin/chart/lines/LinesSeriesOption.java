package org.icepear.echarts.origin.chart.lines;

import org.icepear.echarts.origin.util.SeriesOnGeoOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://echarts.apache.org/en/option.html#series-lines
 */
public interface LinesSeriesOption extends SeriesOption, LinesStateOption, SeriesOnGeoOptionMixin {

    LinesSeriesOption setType(String type);

    LinesSeriesOption setCoordinateSystem(String coordinateSystem);

    LinesSeriesOption setXAxisIndex(Number xAxisIndex);

    LinesSeriesOption setYAxisIndex(Number yAxisIndex);

    LinesSeriesOption setPolarIndex(Number polarIndex);

    LinesSeriesOption setPolyline(Boolean polyline);

    LinesSeriesOption setEffect(LinesEffectOption effect);

    LinesSeriesOption setLarge(Boolean large);

    LinesSeriesOption setLargeThreshold(Number largeThreshold);

    LinesSeriesOption setSymbol(String symbol);

    LinesSeriesOption setSymbol(String[] symbol);

    LinesSeriesOption setSymbolSize(Number symbolSize);

    LinesSeriesOption setSymbolSize(Number[] symbolSize);

    LinesSeriesOption setData(LinesDataItemOption[] data);

    LinesSeriesOption setData(Object[] data);

    LinesSeriesOption setEmphasis(LinesEmphasisOption emphasis);
}
