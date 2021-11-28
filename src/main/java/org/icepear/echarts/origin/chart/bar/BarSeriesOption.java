package org.icepear.echarts.origin.chart.bar;

import java.util.List;

import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesSamplingOptionMixin;
import org.icepear.echarts.origin.util.SeriesStackOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/bar/BarSeries.ts#L65
 */
public interface BarSeriesOption extends BaseBarSeriesOption, BarStateOption, SeriesStackOptionMixin,
        SeriesSamplingOptionMixin, SeriesEncodeOptionMixin {

    void setCoordinateSystem(String coordinateSystem);

    void setClip(Boolean clip);

    void setRoundGap(Boolean roundCap);

    void setShowBackground(Boolean showBackground);

    void setBackgroundStyle(Object backgroundStyle);

    void setData(List<Object> data);

    void setRealtimeSort(Boolean realtimeSort);
}
