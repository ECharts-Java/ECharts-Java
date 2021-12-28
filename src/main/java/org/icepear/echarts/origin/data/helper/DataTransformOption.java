package org.icepear.echarts.origin.data.helper;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/data/helper/transform.ts#L43
 */
public interface DataTransformOption {

    DataTransformOption setType(String type);

    DataTransformOption setConfig(DataTransformConfigOption config);

    DataTransformOption setPrint(Boolean print);
}
