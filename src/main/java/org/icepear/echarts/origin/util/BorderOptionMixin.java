package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L848
 */
public interface BorderOptionMixin {

    BorderOptionMixin setBorderColor(String borderColor);

    BorderOptionMixin setBorderWidth(Number borderWidth);

    BorderOptionMixin setBorderType(String borderType);

    BorderOptionMixin setBorderCap(Object borderCap);

    BorderOptionMixin setBorderJoin(Object borderJoin);

    BorderOptionMixin setBorderDashOffset(Number borderDashOffset);

    BorderOptionMixin setBorderMiterLimit(Number borderMiterLimit);
}
