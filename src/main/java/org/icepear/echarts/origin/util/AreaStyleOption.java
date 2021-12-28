package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L997
 */
public interface AreaStyleOption extends ShadowOptionMixin {

    AreaStyleOption setColor(String color);

    AreaStyleOption setOpacity(Number opacity);
}
