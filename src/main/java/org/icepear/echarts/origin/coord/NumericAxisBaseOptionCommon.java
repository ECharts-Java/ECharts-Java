package org.icepear.echarts.origin.coord;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L84
 */
public interface NumericAxisBaseOptionCommon extends AxisBaseOptionCommon {
    @Getter
    @Setter
    public List<Number> boundaryGap = null;

    @Getter
    @Setter
    public Number splitNumber = null;

    @Getter
    @Setter
    public Number interval = null;

    @Getter
    @Setter
    public Number minInterval = null;

    @Getter
    @Setter
    public Number maxInterval = null;
}
