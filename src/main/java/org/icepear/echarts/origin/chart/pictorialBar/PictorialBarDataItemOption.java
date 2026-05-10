package org.icepear.echarts.origin.chart.pictorialBar;

import org.icepear.echarts.origin.util.DefaultOptionDataItemObject;
import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://echarts.apache.org/en/option.html#series-pictorialBar.data
 *
 * Each data item may override the series-level pictorial-symbol settings.
 */
public interface PictorialBarDataItemOption extends PictorialBarStateOption, StatesOptionMixin, DefaultOptionDataItemObject {

    PictorialBarDataItemOption setCursor(String cursor);

    PictorialBarDataItemOption setSymbol(String symbol);

    PictorialBarDataItemOption setSymbolSize(Number symbolSize);

    PictorialBarDataItemOption setSymbolSize(Number[] symbolSize);

    PictorialBarDataItemOption setSymbolSize(String symbolSize);

    PictorialBarDataItemOption setSymbolSize(String[] symbolSize);

    PictorialBarDataItemOption setSymbolPosition(String symbolPosition);

    PictorialBarDataItemOption setSymbolOffset(Number[] symbolOffset);

    PictorialBarDataItemOption setSymbolOffset(String[] symbolOffset);

    PictorialBarDataItemOption setSymbolRotate(Number symbolRotate);

    PictorialBarDataItemOption setSymbolRepeat(Boolean symbolRepeat);

    PictorialBarDataItemOption setSymbolRepeat(Number symbolRepeat);

    PictorialBarDataItemOption setSymbolRepeat(String symbolRepeat);

    PictorialBarDataItemOption setSymbolRepeatDirection(String symbolRepeatDirection);

    PictorialBarDataItemOption setSymbolMargin(Number symbolMargin);

    PictorialBarDataItemOption setSymbolMargin(String symbolMargin);

    PictorialBarDataItemOption setSymbolClip(Boolean symbolClip);

    PictorialBarDataItemOption setSymbolBoundingData(Number symbolBoundingData);

    PictorialBarDataItemOption setSymbolBoundingData(Number[] symbolBoundingData);

    PictorialBarDataItemOption setSymbolPatternSize(Number symbolPatternSize);

    PictorialBarDataItemOption setHoverAnimation(Boolean hoverAnimation);
}
