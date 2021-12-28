package org.icepear.echarts.origin.chart.radar;

import org.icepear.echarts.origin.util.OptionDataItemObject;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L615
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/radar/RadarSeries.ts#L59
 */
public interface RadarOptionDataItemObject extends OptionDataItemObject {

    RadarOptionDataItemObject setValue(Number[] value);

    RadarOptionDataItemObject setValue(Number[][] value);

    RadarOptionDataItemObject setValue(Object[] value);

    RadarOptionDataItemObject setValue(Object[][] value);

    RadarOptionDataItemObject setValue(String[] value);

    RadarOptionDataItemObject setValue(String[][] value);
}
