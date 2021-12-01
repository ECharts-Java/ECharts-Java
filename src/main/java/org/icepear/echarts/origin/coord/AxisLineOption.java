package org.icepear.echarts.origin.coord;

import java.util.List;

import org.icepear.echarts.origin.util.LineStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L161
 */
public interface AxisLineOption {
    AxisLineOption setShow(Boolean show);

    AxisLineOption setOnZero(Boolean onZero);

    AxisLineOption setOnZeroAxisIndex(Number onZeroAxisIndex);

    AxisLineOption setSymbol(String symbol);

    AxisLineOption setSymbolSize(List<Number> symbolSize);

    AxisLineOption setSymbolOffset(Number symbolOffset);

    AxisLineOption setLineStyle(LineStyleOption lineStyle);
}
