package org.icepear.echarts.origin.coord;

import java.util.List;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L84
 */
public interface NumericAxisBaseOptionCommon extends AxisBaseOptionCommon {
    void setBoundaryGap(List<Number> boundaryGap);

    void setSplitNumber(Number splitNumber);

    void setInterval(Number interval);

    void setMinInterval(Number minInterval);

    void setMaxInterval(Number maxInterval);
}
