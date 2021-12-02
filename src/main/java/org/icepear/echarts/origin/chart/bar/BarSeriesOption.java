package org.icepear.echarts.origin.chart.bar;

import org.icepear.echarts.origin.export.SeriesInjectedOption;
import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesSamplingOptionMixin;
import org.icepear.echarts.origin.util.SeriesStackOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/bar/BarSeries.ts#L65
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/export/option.ts#L182
 */
public interface BarSeriesOption extends BaseBarSeriesOption, BarStateOption, SeriesStackOptionMixin,
        SeriesSamplingOptionMixin, SeriesEncodeOptionMixin, SeriesInjectedOption {
    BarSeriesOption setClip(Boolean clip);

    BarSeriesOption setRoundCap(Boolean roundCap);

    BarSeriesOption setShowBackground(Boolean showBackground);

    BarSeriesOption setBackgroundStyle(BackgroundStyleOption backgroundStyle);

    BarSeriesOption setRealtimeSort(Boolean realtimeSort);
}
