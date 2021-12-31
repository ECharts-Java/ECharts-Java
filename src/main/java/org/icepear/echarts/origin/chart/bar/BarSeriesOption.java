package org.icepear.echarts.origin.chart.bar;

import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesSamplingOptionMixin;
import org.icepear.echarts.origin.util.SeriesStackOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/bar/BarSeries.ts#L65
 */
public interface BarSeriesOption extends BaseBarSeriesOption, BarStateOption, SeriesStackOptionMixin,
        SeriesSamplingOptionMixin, SeriesEncodeOptionMixin {

    BarSeriesOption setType(String type);

    BarSeriesOption setCoordinateSystem(String coordinateSystem);

    BarSeriesOption setClip(Boolean clip);

    BarSeriesOption setRoundCap(Boolean roundCap);

    BarSeriesOption setShowBackground(Boolean showBackground);

    BarSeriesOption setBackgroundStyle(BarBackgroundStyleOption backgroundStyle);

    BarSeriesOption setData(BarDataItemOption[] data);

    BarSeriesOption setData(Number[] data);

    BarSeriesOption setData(Number[][] data);

    BarSeriesOption setData(Object[] data);

    BarSeriesOption setData(Object[][] data);

    BarSeriesOption setData(String[] data);

    BarSeriesOption setData(String[][] data);

    BarSeriesOption setRealtimeSort(Boolean realtimeSort);

    BarSeriesOption setEmphasis(BarEmphasisOption emphasis);
}
