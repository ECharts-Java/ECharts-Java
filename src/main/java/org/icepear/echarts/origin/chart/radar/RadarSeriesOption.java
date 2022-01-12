package org.icepear.echarts.origin.chart.radar;

import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.origin.util.SymbolOptionMixin;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/radar/RadarSeries.ts#L62
 */
public interface RadarSeriesOption extends SeriesOption, RadarStateOption, SymbolOptionMixin, SeriesEncodeOptionMixin {

    RadarSeriesOption setType(String type);

    RadarSeriesOption setCoordinateSystem(String coordinateSystem);

    RadarSeriesOption setRadarIndex(Number radarIndex);

    RadarSeriesOption setRadarId(String radarId);

    RadarSeriesOption setData(Number[][] data);

    RadarSeriesOption setData(Object[][] data);

    RadarSeriesOption setData(RadarDataItemOption[] data);

    RadarSeriesOption setData(String[][] data);

    RadarSeriesOption setEmphasis(RadarEmphasisOption emphasis);
}
