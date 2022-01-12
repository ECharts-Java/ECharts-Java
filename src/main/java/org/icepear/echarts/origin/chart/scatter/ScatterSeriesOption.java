package org.icepear.echarts.origin.chart.scatter;

import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesLargeOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnCalendarOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnCartesianOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnGeoOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnPolarOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnSingleOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.origin.util.SeriesStackOptionMixin;
import org.icepear.echarts.origin.util.SymbolOptionMixin;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/scatter/ScatterSeries.ts#L62
 */
public interface ScatterSeriesOption extends SeriesOption, ScatterStateOption, SeriesOnCartesianOptionMixin,
        SeriesOnPolarOptionMixin, SeriesOnCalendarOptionMixin, SeriesOnGeoOptionMixin, SeriesOnSingleOptionMixin,
        SeriesLargeOptionMixin, SeriesStackOptionMixin, SymbolOptionMixin, SeriesEncodeOptionMixin {

    ScatterSeriesOption setType(String type);

    ScatterSeriesOption setCoordinateSystem(String coordinateSystem);

    ScatterSeriesOption setCursor(String cursor);

    ScatterSeriesOption setClip(Boolean clip);

    ScatterSeriesOption setData(Number[] data);

    ScatterSeriesOption setData(Number[][] data);

    ScatterSeriesOption setData(Object[] data);

    ScatterSeriesOption setData(Object[][] data);

    ScatterSeriesOption setData(ScatterDataItemOption[] data);

    ScatterSeriesOption setData(String[] data);

    ScatterSeriesOption setData(String[][] data);

    ScatterSeriesOption setEmphasis(ScatterEmphasisOption emphasis);
}
