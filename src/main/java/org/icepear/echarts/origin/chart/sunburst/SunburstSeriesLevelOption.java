package org.icepear.echarts.origin.chart.sunburst;

import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/sunburst/SunburstSeries.ts#L95
 */
public interface SunburstSeriesLevelOption extends SunburstStateOption, StatesOptionMixin {

    SunburstSeriesLevelOption setRadius(Number[] radius);

    SunburstSeriesLevelOption setRadius(String[] radius);

    SunburstSeriesLevelOption setR(Number r);

    SunburstSeriesLevelOption setR(String r);

    SunburstSeriesLevelOption setR0(Number r0);

    SunburstSeriesLevelOption setR0(String r0);

    SunburstSeriesLevelOption setHighlight(Object highlight);
}
