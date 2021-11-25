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
    public List<Integer> boundaryGap = null;

    @Getter
    @Setter
    public Integer splitNumber = null;

    @Getter
    @Setter
    public Integer interval = null;

    @Getter
    @Setter
    public Integer minInterval = null;

    @Getter
    @Setter
    public Integer maxInterval = null;
}
