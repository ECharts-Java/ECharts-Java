package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L841
 */
public interface ShadowOptionMixin {

    ShadowOptionMixin setShadowBlur(Number shadowBlur);

    ShadowOptionMixin setShadowColor(String shadowColor);

    ShadowOptionMixin setShadowOffsetX(Number shadowOffsetX);

    ShadowOptionMixin setShadowOffsetY(Number shadowOffsetY);
}
