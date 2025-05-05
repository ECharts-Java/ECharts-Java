package org.icepear.echarts.origin.data.helper;

/**
 * https://echarts.apache.org/examples/en/editor.html?c=data-transform-multiple-pie
 * https://echarts.apache.org/examples/en/editor.html?c=data-transform-sort-bar
 */
public interface DataTransformConfigOption {

    DataTransformConfigOption setDimension(String dimension);

    DataTransformConfigOption setOrder(String order);

    DataTransformConfigOption setValue(Number value);

    DataTransformConfigOption setValue(Object value);

    DataTransformConfigOption setValue(String value);
}
