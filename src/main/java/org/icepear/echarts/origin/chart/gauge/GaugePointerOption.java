package org.icepear.echarts.origin.chart.gauge;

import org.icepear.echarts.origin.util.ItemStyleOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/gauge/GaugeSeries.ts#L45
 */
public interface GaugePointerOption {

    GaugePointerOption setIcon(String icon);

    GaugePointerOption setShow(Boolean show);

    GaugePointerOption setShowAbove(Boolean showAbove);

    GaugePointerOption setKeepAspect(Boolean keepAspect);

    GaugePointerOption setItemStyle(ItemStyleOption itemStyle);

    GaugePointerOption setOffsetCenter(Number[] offsetCenter);

    GaugePointerOption setOffsetCenter(String[] offsetCenter);

    GaugePointerOption setLength(Number length);

    GaugePointerOption setLength(String length);

    GaugePointerOption setWidth(Number width);
}
