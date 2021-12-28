package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1441
 */
public interface AxisPointerLabelOption extends LabelOption {

    AxisPointerLabelOption setPrecision(Number precision);

    AxisPointerLabelOption setPrecision(String precision);

    AxisPointerLabelOption setMargin(Number margin);

    AxisPointerLabelOption setFormatter(String formatter);
}
