package org.icepear.echarts.origin.util;

import org.icepear.echarts.type.BoxLength;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L825
 */
public interface BoxLayoutOptionMixin {
    void setWidth(BoxLength<?> width);

    void setHeight(BoxLength<?> height);

    void setTop(BoxLength<?> top);

    void setRight(BoxLength<?> right);

    void setBottom(BoxLength<?> bottom);

    void setLeft(BoxLength<?> left);
}
