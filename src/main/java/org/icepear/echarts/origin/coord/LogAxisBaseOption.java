package org.icepear.echarts.origin.coord;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L148
 */
public interface LogAxisBaseOption extends NumericAxisBaseOptionCommon {

    LogAxisBaseOption setType(String type);

    LogAxisBaseOption setAxisLabel(Object axisLabel);

    LogAxisBaseOption setLogBase(Number logBase);
}
