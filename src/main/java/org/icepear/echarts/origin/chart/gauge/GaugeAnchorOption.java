package org.icepear.echarts.origin.chart.gauge;

import org.icepear.echarts.origin.util.ItemStyleOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/gauge/GaugeSeries.ts#L62
 */
public interface GaugeAnchorOption {

    GaugeAnchorOption setShow(Boolean show);

    GaugeAnchorOption setShowAbove(Boolean showAbove);

    GaugeAnchorOption setSize(Number size);

    GaugeAnchorOption setIcon(String icon);

    GaugeAnchorOption setOffsetCenter(Number[] offsetCenter);

    GaugeAnchorOption setOffsetCenter(String[] offsetCenter);

    GaugeAnchorOption setKeepAspect(Boolean keepAspect);

    GaugeAnchorOption setItemStyle(ItemStyleOption itemStyle);
}
