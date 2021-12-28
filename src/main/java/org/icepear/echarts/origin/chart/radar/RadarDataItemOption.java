package org.icepear.echarts.origin.chart.radar;

import org.icepear.echarts.origin.util.StatesOptionMixin;
import org.icepear.echarts.origin.util.SymbolOptionMixin;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/radar/RadarSeries.ts#L56
 */
public interface RadarDataItemOption
        extends SymbolOptionMixin, RadarStateOption, StatesOptionMixin, RadarOptionDataItemObject {

}
