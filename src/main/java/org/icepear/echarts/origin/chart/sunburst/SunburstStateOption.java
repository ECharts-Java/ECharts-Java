package org.icepear.echarts.origin.chart.sunburst;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/sunburst/SunburstSeries.ts#L74
 */
public interface SunburstStateOption {

    SunburstStateOption setItemStyle(SunburstItemStyleOption itemStyle);

    SunburstStateOption setLabel(SunburstLabelOption label);
}
