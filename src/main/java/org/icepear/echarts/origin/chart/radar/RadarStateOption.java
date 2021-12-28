package org.icepear.echarts.origin.chart.radar;

import org.icepear.echarts.origin.util.AreaStyleOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/radar/RadarSeries.ts#L50
 */
public interface RadarStateOption {

    RadarStateOption setLineStyle(LineStyleOption lineStyle);

    RadarStateOption setAreaStyle(AreaStyleOption areaStyle);

    RadarStateOption setLabel(SeriesLabelOption label);

    RadarStateOption setItemStyle(ItemStyleOption itemStyle);
}
