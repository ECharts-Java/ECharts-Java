package org.icepear.echarts.origin.coord;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L137
 */
public interface ValueAxisBaseOption extends AxisBaseOption, NumericAxisBaseOptionCommon {
    @Getter
    @Setter
    public Boolean scale = null;
}
