package org.icepear.echarts.origin.chart.gauge;

import org.icepear.echarts.origin.util.LabelOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/gauge/GaugeSeries.ts#L81
 */
public interface GaugeTitleOption extends LabelOption {

    GaugeTitleOption setOffsetCenter(Number[] offsetCenter);

    GaugeTitleOption setOffsetCenter(String[] offsetCenter);

    GaugeTitleOption setFormatter(Object formatter);

    GaugeTitleOption setFormatter(String formatter);

    GaugeTitleOption setValueAnimation(Boolean valueAnimation);
}
