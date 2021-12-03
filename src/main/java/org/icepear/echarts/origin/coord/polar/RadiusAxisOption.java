package org.icepear.echarts.origin.coord.polar;

import org.icepear.echarts.origin.coord.AxisBaseOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/polar/AxisModel.ts#L47
 */
public interface RadiusAxisOption extends AxisBaseOption {
    RadiusAxisOption setPolarIndex(Number polarIndex);

    RadiusAxisOption setPolarId(String polarId);
}
