package org.icepear.echarts.coord;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L84
 */
@Getter
@Setter
public class NumericAxisBaseOptionCommon {
    private AxisBaseOptionCommon axisBaseOptionCommon;

    private List<Integer> boundaryGap;

    private Integer splitNumber;

    private Integer interval;

    private Integer minInterval;

    private Integer maxInterval;
}
