package org.icepear.echarts.origin.chart.sunburst;

import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/sunburst/SunburstSeries.ts#L53
 */
public interface SunburstLabelOption extends SeriesLabelOption {

    SunburstLabelOption setRotate(Number rotate);

    SunburstLabelOption setRotate(String rotate);

    SunburstLabelOption setMinAngle(Number minAngle);

    SunburstLabelOption setSilent(Boolean silent);

    SunburstLabelOption setPosition(String position);
}
