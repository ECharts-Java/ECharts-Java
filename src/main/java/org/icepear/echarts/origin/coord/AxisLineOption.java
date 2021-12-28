package org.icepear.echarts.origin.coord;

import org.icepear.echarts.origin.util.LineStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/axisCommonTypes.ts#L161
 */
public interface AxisLineOption {

    AxisLineOption setShow(Boolean show);

    AxisLineOption setShow(String show);

    AxisLineOption setOnZero(Boolean onZero);

    AxisLineOption setOnZeroAxisIndex(Number onZeroAxisIndex);

    AxisLineOption setSymbol(String symbol);

    AxisLineOption setSymbol(String[] symbol);

    AxisLineOption setSymbolSize(Number[] symbolSize);

    AxisLineOption setSymbolOffset(Number symbolOffset);

    AxisLineOption setSymbolOffset(Number[] symbolOffset);

    AxisLineOption setSymbolOffset(String symbolOffset);

    AxisLineOption setSymbolOffset(String[] symbolOffset);

    AxisLineOption setLineStyle(LineStyleOption lineStyle);
}
