package org.icepear.echarts.coord;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L137
 */
@Getter
@Setter
public class ValueAxisBaseOption implements AxisBaseOption {
    private NumericAxisBaseOptionCommon numericAxisBaseOptionCommon;

    private Boolean scale;
}
