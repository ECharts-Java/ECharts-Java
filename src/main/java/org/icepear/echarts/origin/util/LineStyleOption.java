package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L982
 */
public interface LineStyleOption extends ShadowOptionMixin {

    LineStyleOption setWidth(Number width);

    LineStyleOption setColor(String color);

    LineStyleOption setOpacity(Number opacity);

    LineStyleOption setType(String type);

    LineStyleOption setCap(Object cap);

    LineStyleOption setJoin(Object join);

    LineStyleOption setDashOffset(Number dashOffset);

    LineStyleOption setMiterLimit(Number miterLimit);
}
