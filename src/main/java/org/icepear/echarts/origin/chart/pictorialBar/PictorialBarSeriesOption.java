package org.icepear.echarts.origin.chart.pictorialBar;

import org.icepear.echarts.origin.chart.bar.BaseBarSeriesOption;
import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesStackOptionMixin;

/**
 * https://echarts.apache.org/en/option.html#series-pictorialBar
 */
public interface PictorialBarSeriesOption
        extends BaseBarSeriesOption, PictorialBarStateOption, SeriesStackOptionMixin, SeriesEncodeOptionMixin {

    PictorialBarSeriesOption setType(String type);

    PictorialBarSeriesOption setCoordinateSystem(String coordinateSystem);

    PictorialBarSeriesOption setClip(Boolean clip);

    PictorialBarSeriesOption setSymbol(String symbol);

    PictorialBarSeriesOption setSymbolSize(Number symbolSize);

    PictorialBarSeriesOption setSymbolSize(Number[] symbolSize);

    PictorialBarSeriesOption setSymbolSize(String symbolSize);

    PictorialBarSeriesOption setSymbolSize(String[] symbolSize);

    PictorialBarSeriesOption setSymbolPosition(String symbolPosition);

    PictorialBarSeriesOption setSymbolOffset(Number[] symbolOffset);

    PictorialBarSeriesOption setSymbolOffset(String[] symbolOffset);

    PictorialBarSeriesOption setSymbolRotate(Number symbolRotate);

    PictorialBarSeriesOption setSymbolRepeat(Boolean symbolRepeat);

    PictorialBarSeriesOption setSymbolRepeat(Number symbolRepeat);

    PictorialBarSeriesOption setSymbolRepeat(String symbolRepeat);

    PictorialBarSeriesOption setSymbolRepeatDirection(String symbolRepeatDirection);

    PictorialBarSeriesOption setSymbolMargin(Number symbolMargin);

    PictorialBarSeriesOption setSymbolMargin(String symbolMargin);

    PictorialBarSeriesOption setSymbolClip(Boolean symbolClip);

    PictorialBarSeriesOption setSymbolBoundingData(Number symbolBoundingData);

    PictorialBarSeriesOption setSymbolBoundingData(Number[] symbolBoundingData);

    PictorialBarSeriesOption setSymbolPatternSize(Number symbolPatternSize);

    PictorialBarSeriesOption setHoverAnimation(Boolean hoverAnimation);

    PictorialBarSeriesOption setData(PictorialBarDataItemOption[] data);

    PictorialBarSeriesOption setData(Number[] data);

    PictorialBarSeriesOption setData(Number[][] data);

    PictorialBarSeriesOption setData(Object[] data);

    PictorialBarSeriesOption setData(Object[][] data);

    PictorialBarSeriesOption setData(String[] data);

    PictorialBarSeriesOption setData(String[][] data);

    PictorialBarSeriesOption setEmphasis(PictorialBarEmphasisOption emphasis);
}
