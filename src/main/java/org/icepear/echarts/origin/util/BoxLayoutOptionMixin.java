package org.icepear.echarts.origin.util;

import org.icepear.echarts.type.BoxLength;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L825
 */
public interface BoxLayoutOptionMixin {
    BoxLayoutOptionMixin setWidth(BoxLength width);

    BoxLayoutOptionMixin setHeight(BoxLength height);

    BoxLayoutOptionMixin setTop(BoxLength top);

    BoxLayoutOptionMixin setRight(BoxLength right);

    BoxLayoutOptionMixin setBottom(BoxLength bottom);

    BoxLayoutOptionMixin setLeft(BoxLength left);
}
