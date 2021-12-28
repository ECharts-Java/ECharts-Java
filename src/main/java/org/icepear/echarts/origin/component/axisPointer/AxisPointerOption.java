package org.icepear.echarts.origin.component.axisPointer;

import org.icepear.echarts.origin.util.CommonAxisPointerOption;
import org.icepear.echarts.origin.util.ComponentOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/axisPointer/AxisPointerModel.ts#L61
 */
public interface AxisPointerOption extends ComponentOption, CommonAxisPointerOption {

    AxisPointerOption setMainType(String mainType);

    AxisPointerOption setType(String type);

    AxisPointerOption setLink(Object[] link);
}
