package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L669
 */
public interface OptionEncode extends OptionEncodeVisualDimensions {

    OptionEncode setX(Number x);

    OptionEncode setX(Number[] x);

    OptionEncode setX(String x);

    OptionEncode setX(String[] x);

    OptionEncode setY(Number y);

    OptionEncode setY(Number[] y);

    OptionEncode setY(String y);

    OptionEncode setY(String[] y);

    OptionEncode setRadius(Number radius);

    OptionEncode setRadius(Number[] radius);

    OptionEncode setRadius(String radius);

    OptionEncode setRadius(String[] radius);

    OptionEncode setAngle(Number angle);

    OptionEncode setAngle(Number[] angle);

    OptionEncode setAngle(String angle);

    OptionEncode setAngle(String[] angle);

    OptionEncode setLng(Number lng);

    OptionEncode setLng(Number[] lng);

    OptionEncode setLng(String lng);

    OptionEncode setLng(String[] lng);

    OptionEncode setLat(Number lat);

    OptionEncode setLat(Number[] lat);

    OptionEncode setLat(String lat);

    OptionEncode setLat(String[] lat);

    OptionEncode setValue(Number value);

    OptionEncode setValue(Number[] value);

    OptionEncode setValue(String value);

    OptionEncode setValue(String[] value);
}
