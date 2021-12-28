package org.icepear.echarts.origin.coord.radar;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/coord/radar/RadarModel.ts#L44
 */
public interface RadarIndicatorOption {

    RadarIndicatorOption setName(String name);

    RadarIndicatorOption setText(String text);

    RadarIndicatorOption setMin(Number min);

    RadarIndicatorOption setMax(Number max);

    RadarIndicatorOption setColor(Object color);

    RadarIndicatorOption setAxisType(String axisType);
}
