package org.icepear.echarts.origin.coord;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L153
 */
public interface TimeAxisBaseOption extends NumericAxisBaseOptionCommon {

    TimeAxisBaseOption setType(String type);

    TimeAxisBaseOption setAxisLabel(Object axisLabel);
}
