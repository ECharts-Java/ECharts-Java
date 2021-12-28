package org.icepear.echarts.origin.component.tooltip;

import org.icepear.echarts.origin.component.axisPointer.AxisPointerOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/tooltip/TooltipModel.ts#L38
 */
public interface TooltipAxisPointerOption extends AxisPointerOption {

    TooltipAxisPointerOption setAxis(String axis);

    TooltipAxisPointerOption setCrossStyle(Object crossStyle);
}
