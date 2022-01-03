package org.icepear.echarts.origin.chart.sunburst;

import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/sunburst/SunburstSeries.ts#L95
 */
public interface SunburstLevelOption extends SunburstStateOption, StatesOptionMixin {

    SunburstLevelOption setRadius(Number[] radius);

    SunburstLevelOption setRadius(String[] radius);

    SunburstLevelOption setR(Number r);

    SunburstLevelOption setR(String r);

    SunburstLevelOption setR0(Number r0);

    SunburstLevelOption setR0(String r0);

    SunburstLevelOption setHighlight(Object highlight);
}
