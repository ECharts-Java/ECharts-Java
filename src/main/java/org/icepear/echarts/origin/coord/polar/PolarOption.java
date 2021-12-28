package org.icepear.echarts.origin.coord.polar;

import org.icepear.echarts.origin.util.CircleLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/polar/PolarModel.ts#L25
 */
public interface PolarOption extends ComponentOption, CircleLayoutOptionMixin {

    PolarOption setMainType(String mainType);
}
