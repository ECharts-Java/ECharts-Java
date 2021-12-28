package org.icepear.echarts.origin.coord;

import java.util.Map;

import org.icepear.echarts.origin.util.TextCommonOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L208
 */
public interface AxisLabelBaseOption extends TextCommonOption {

    AxisLabelBaseOption setShow(Boolean show);

    AxisLabelBaseOption setInside(Boolean inside);

    AxisLabelBaseOption setRotate(Number rotate);

    AxisLabelBaseOption setShowMinLabel(Boolean showMinLabel);

    AxisLabelBaseOption setShowMaxLabel(Boolean showMaxLabel);

    AxisLabelBaseOption setMargin(Number margin);

    AxisLabelBaseOption setRich(Map<String, TextCommonOption> rich);

    AxisLabelBaseOption setHideOverlap(Boolean hideOverlap);

    AxisLabelBaseOption setColor(String color);
}
