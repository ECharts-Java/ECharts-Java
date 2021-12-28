package org.icepear.echarts.origin.chart.gauge;

import org.icepear.echarts.origin.util.ItemStyleOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/gauge/GaugeSeries.ts#L72
 */
public interface GaugeProgressOption {

    GaugeProgressOption setShow(Boolean show);

    GaugeProgressOption setOverlap(Boolean overlap);

    GaugeProgressOption setWidth(Number width);

    GaugeProgressOption setRoundCap(Boolean roundCap);

    GaugeProgressOption setClip(Boolean clip);

    GaugeProgressOption setItemStyle(ItemStyleOption itemStyle);
}
