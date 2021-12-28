package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L615
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L641
 */
public interface CategoryOptionDataItemObject extends OptionDataItemObject {

    CategoryOptionDataItemObject setValue(String value);

    CategoryOptionDataItemObject setValue(String[] value);
}
