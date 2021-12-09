package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L834
 */
public interface CircleLayoutOptionMixin {

	CircleLayoutOptionMixin setCenter(String[] center);

	CircleLayoutOptionMixin setCenter(Number[] center);

	CircleLayoutOptionMixin setRadius(String[] radius);

	CircleLayoutOptionMixin setRadius(Number[] radius);

	CircleLayoutOptionMixin setRadius(String radius);

	CircleLayoutOptionMixin setRadius(Number radius);
}
