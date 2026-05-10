package org.icepear.echarts.origin.chart.effectScatter;

import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnCalendarOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnCartesianOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnGeoOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnPolarOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnSingleOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.origin.util.SymbolOptionMixin;

/**
 * https://echarts.apache.org/en/option.html#series-effectScatter
 */
public interface EffectScatterSeriesOption extends SeriesOption, EffectScatterStateOption,
        SeriesOnCartesianOptionMixin, SeriesOnPolarOptionMixin, SeriesOnCalendarOptionMixin,
        SeriesOnGeoOptionMixin, SeriesOnSingleOptionMixin, SymbolOptionMixin, SeriesEncodeOptionMixin {

    EffectScatterSeriesOption setType(String type);

    EffectScatterSeriesOption setCoordinateSystem(String coordinateSystem);

    EffectScatterSeriesOption setEffectType(String effectType);

    EffectScatterSeriesOption setShowEffectOn(String showEffectOn);

    EffectScatterSeriesOption setRippleEffect(RippleEffectOption rippleEffect);

    EffectScatterSeriesOption setClip(Boolean clip);

    EffectScatterSeriesOption setData(Number[] data);

    EffectScatterSeriesOption setData(Number[][] data);

    EffectScatterSeriesOption setData(Object[] data);

    EffectScatterSeriesOption setData(Object[][] data);

    EffectScatterSeriesOption setData(EffectScatterDataItemOption[] data);

    EffectScatterSeriesOption setData(String[] data);

    EffectScatterSeriesOption setData(String[][] data);

    EffectScatterSeriesOption setEmphasis(EffectScatterEmphasisOption emphasis);
}
