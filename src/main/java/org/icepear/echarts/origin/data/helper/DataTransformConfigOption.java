package org.icepear.echarts.origin.data.helper;

/**
 * https://echarts.apache.org/examples/en/editor.html?c=data-transform-multiple-pie
 */
public interface DataTransformConfigOption {

    DataTransformConfigOption setDimension(String dimension);

    DataTransformConfigOption setValue(Number value);

    DataTransformConfigOption setValue(Object value);

    DataTransformConfigOption setValue(String value);
}
