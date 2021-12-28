package org.icepear.echarts.origin.coord;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L84
 */
public interface NumericAxisBaseOptionCommon extends AxisBaseOptionCommon {

    NumericAxisBaseOptionCommon setBoundaryGap(Number[] boundaryGap);

    NumericAxisBaseOptionCommon setBoundaryGap(String[] boundaryGap);

    NumericAxisBaseOptionCommon setSplitNumber(Number splitNumber);

    NumericAxisBaseOptionCommon setInterval(Number interval);

    NumericAxisBaseOptionCommon setMinInterval(Number minInterval);

    NumericAxisBaseOptionCommon setMaxInterval(Number maxInterval);
}
