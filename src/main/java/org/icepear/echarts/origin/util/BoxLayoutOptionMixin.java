package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L825
 */
public interface BoxLayoutOptionMixin {

    BoxLayoutOptionMixin setWidth(Number width);

    BoxLayoutOptionMixin setWidth(String width);

    BoxLayoutOptionMixin setHeight(Number height);

    BoxLayoutOptionMixin setHeight(String height);

    BoxLayoutOptionMixin setTop(Number top);

    BoxLayoutOptionMixin setTop(String top);

    BoxLayoutOptionMixin setRight(Number right);

    BoxLayoutOptionMixin setRight(String right);

    BoxLayoutOptionMixin setBottom(Number bottom);

    BoxLayoutOptionMixin setBottom(String bottom);

    BoxLayoutOptionMixin setLeft(Number left);

    BoxLayoutOptionMixin setLeft(String left);
}
