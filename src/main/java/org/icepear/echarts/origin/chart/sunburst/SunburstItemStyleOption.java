package org.icepear.echarts.origin.chart.sunburst;

import org.icepear.echarts.origin.util.ItemStyleOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/sunburst/SunburstSeries.ts#L41
 */
public interface SunburstItemStyleOption extends ItemStyleOption {

    SunburstItemStyleOption setBorderRadius(Number borderRadius);

    SunburstItemStyleOption setBorderRadius(Number[] borderRadius);

    SunburstItemStyleOption setBorderRadius(String borderRadius);

    SunburstItemStyleOption setBorderRadius(String[] borderRadius);
}
