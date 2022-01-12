package org.icepear.echarts.origin.chart.heatmap;

import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnCalendarOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnCartesianOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnGeoOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/heatmap/HeatmapSeries.ts#L58
 */
public interface HeatmapSeriesOption extends SeriesOption, HeatmapStateOption, SeriesOnCartesianOptionMixin,
        SeriesOnGeoOptionMixin, SeriesOnCalendarOptionMixin, SeriesEncodeOptionMixin {

    HeatmapSeriesOption setType(String type);

    HeatmapSeriesOption setCoordinateSystem(String coordinateSystem);

    HeatmapSeriesOption setBlurSize(Number blurSize);

    HeatmapSeriesOption setPointSize(Number pointSize);

    HeatmapSeriesOption setMaxOpacity(Number maxOpacity);

    HeatmapSeriesOption setMinOpacity(Number minOpacity);

    HeatmapSeriesOption setData(HeatmapDataItemOption[] data);

    HeatmapSeriesOption setData(Object[][] data);

    HeatmapSeriesOption setEmphasis(HeatmapEmphasisOption emphasis);
}
