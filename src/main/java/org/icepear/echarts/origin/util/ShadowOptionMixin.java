package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L841
 */
public interface ShadowOptionMixin {
    void setShadowBlur(Number shadowBlur);

    void setShadowColor(String shadowColor);

    void setShadowOffsetX(Number shadowOffsetX);

    void setShadowOffsetY(Number shadowOffsetY);
}
