package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L615
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L642
 */
public interface DateOptionDataItemObject extends OptionDataItemObject {

    DateOptionDataItemObject setValue(Number value);

    DateOptionDataItemObject setValue(Number[] value);

    DateOptionDataItemObject setValue(Object value);

    DateOptionDataItemObject setValue(Object[] value);

    DateOptionDataItemObject setValue(String value);

    DateOptionDataItemObject setValue(String[] value);
}
