package org.icepear.echarts.origin.util;

import java.util.Map;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1090
 */
public interface LabelOption extends TextCommonOption {
    void setShow(Boolean show);

    void setPosition(String position);

    void setDistance(Number distance);

    void setRotate(Number rotate);

    void setOffset(Number offset);

    void setMinMargin(Number minMargin);

    void setOverflow(Object overflow);

    void setSilent(Boolean silent);

    void setPrecision(String precision);

    void setValueAnimation(Boolean valueAnimation);

    void setRich(Map<String, TextCommonOption> rich);
}
