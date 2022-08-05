package org.icepear.echarts.origin.chart.themeRiver;

import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnSingleOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/themeRiver/ThemeRiverSeries.ts#L61
 */
public interface ThemeRiverSeriesOption
        extends SeriesOption, ThemeRiverStateOption, SeriesOnSingleOptionMixin, BoxLayoutOptionMixin {

    ThemeRiverSeriesOption setType(String type);

    ThemeRiverSeriesOption setColor(String[] color);

    ThemeRiverSeriesOption setCoordinateSystem(String coordinateSystem);

    ThemeRiverSeriesOption setBoundaryGap(Number[] boundaryGap);

    ThemeRiverSeriesOption setBoundaryGap(String[] boundaryGap);

    ThemeRiverSeriesOption setData(Object[][] data);

    ThemeRiverSeriesOption setEmphasis(ThemeRiverEmphasisOption emphasis);
}
