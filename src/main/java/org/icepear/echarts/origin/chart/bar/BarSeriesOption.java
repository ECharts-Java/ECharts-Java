package org.icepear.echarts.origin.chart.bar;

import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesSamplingOptionMixin;
import org.icepear.echarts.origin.util.SeriesStackOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/bar/BarSeries.ts#L65
 */
public interface BarSeriesOption extends BaseBarSeriesOption, BarStateOption, SeriesStackOptionMixin,
        SeriesSamplingOptionMixin, SeriesEncodeOptionMixin {
    void setClip(Boolean clip);

    void setRoundCap(Boolean roundCap);

    void setShowBackground(Boolean showBackground);

    void setBackgroundStyle(Object backgroundStyle);

    void setRealtimeSort(Boolean realtimeSort);
}
