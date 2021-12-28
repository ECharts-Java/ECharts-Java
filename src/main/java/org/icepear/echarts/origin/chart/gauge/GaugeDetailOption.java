package org.icepear.echarts.origin.chart.gauge;

import org.icepear.echarts.origin.util.LabelOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/gauge/GaugeSeries.ts#L94
 */
public interface GaugeDetailOption extends LabelOption {

    GaugeDetailOption setOffsetCenter(Number[] offsetCenter);

    GaugeDetailOption setOffsetCenter(String[] offsetCenter);

    GaugeDetailOption setFormatter(Object formatter);

    GaugeDetailOption setFormatter(String formatter);

    GaugeDetailOption setValueAnimation(Boolean valueAnimation);
}
