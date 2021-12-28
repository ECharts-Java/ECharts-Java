package org.icepear.echarts.origin.chart.gauge;

import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/gauge/GaugeSeries.ts#L114
 */
public interface GaugeDataItemOption extends GaugeStateOption, StatesOptionMixin {

    GaugeDataItemOption setName(String name);

    GaugeDataItemOption setValue(Number value);

    GaugeDataItemOption setPointer(GaugePointerOption pointer);

    GaugeDataItemOption setProgress(GaugeProgressOption progress);

    GaugeDataItemOption setTitle(GaugeTitleOption title);

    GaugeDataItemOption setDetail(GaugeDetailOption detail);
}
