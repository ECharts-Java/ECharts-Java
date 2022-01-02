package org.icepear.echarts.origin.util;

import java.util.Map;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1090
 */
public interface LabelOption extends TextCommonOption {

    LabelOption setShow(Boolean show);

    LabelOption setPosition(String position);

    LabelOption setDistance(Number distance);

    LabelOption setRotate(Number rotate);

    LabelOption setOffset(Number[] offset);

    LabelOption setMinMargin(Number minMargin);

    LabelOption setOverflow(Object overflow);

    LabelOption setSilent(Boolean silent);

    LabelOption setPrecision(Number precision);

    LabelOption setPrecision(String precision);

    LabelOption setValueAnimation(Boolean valueAnimation);

    LabelOption setRich(Map<String, TextCommonOption> rich);
}
