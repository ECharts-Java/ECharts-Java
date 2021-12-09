package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L825
 */
public interface BoxLayoutOptionMixin {

	BoxLayoutOptionMixin setWidth(String width);

	BoxLayoutOptionMixin setWidth(Number width);

	BoxLayoutOptionMixin setHeight(String height);

	BoxLayoutOptionMixin setHeight(Number height);

	BoxLayoutOptionMixin setTop(String top);

	BoxLayoutOptionMixin setTop(Number top);

	BoxLayoutOptionMixin setRight(String right);

	BoxLayoutOptionMixin setRight(Number right);

	BoxLayoutOptionMixin setBottom(String bottom);

	BoxLayoutOptionMixin setBottom(Number bottom);

	BoxLayoutOptionMixin setLeft(String left);

	BoxLayoutOptionMixin setLeft(Number left);
}
