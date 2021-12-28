package org.icepear.echarts.origin.coord;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L226
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L201
 */
public interface CategoryAxisLabelOption extends AxisLabelBaseOption {

    CategoryAxisLabelOption setFormatter(Object formatter);

    CategoryAxisLabelOption setFormatter(String formatter);
}
