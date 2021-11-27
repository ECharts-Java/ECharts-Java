package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L848
 */
public interface BorderOptionMixin {
    void setBorderColor(String borderColor);

    void setBorderWidth(Number borderWidth);

    void setBorderType(String borderType);

    void setBorderCap(Object borderCap);

    void setBorderJoin(Object borderJoin);

    void setBorderDashOffset(Number borderDashOffset);

    void setBorderMiterLimit(Number borderMiterLimit);
}
