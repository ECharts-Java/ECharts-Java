package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L615
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L638
 */
public interface DefaultOptionDataItemObject extends OptionDataItemObject {

    DefaultOptionDataItemObject setValue(Number value);

    DefaultOptionDataItemObject setValue(Number[] value);

    DefaultOptionDataItemObject setValue(Object value);

    DefaultOptionDataItemObject setValue(Object[] value);

    DefaultOptionDataItemObject setValue(String value);

    DefaultOptionDataItemObject setValue(String[] value);
}
