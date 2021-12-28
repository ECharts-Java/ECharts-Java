package org.icepear.echarts.origin.component.marker;

import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkLineModel.ts#L83
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkLineModel.ts#L76
 */
public interface MarkLineOption extends MarkerOption, MarkLineStateOption, StatesOptionMixin {

    MarkLineOption setMainType(String mainType);

    MarkLineOption setSymbol(String symbol);

    MarkLineOption setSymbol(String[] symbol);

    MarkLineOption setSymbolSize(Number symbolSize);

    MarkLineOption setSymbolSize(Number[] symbolSize);

    MarkLineOption setSymbolRotate(Number symbolRotate);

    MarkLineOption setSymbolRotate(Number[] symbolRotate);

    MarkLineOption setSymbolOffset(Number symbolOffset);

    MarkLineOption setSymbolOffset(Number[] symbolOffset);

    MarkLineOption setSymbolOffset(String symbolOffset);

    MarkLineOption setSymbolOffset(String[] symbolOffset);

    MarkLineOption setPrecision(Number precision);

    MarkLineOption setData(MarkLineDataItemOption[] data);
}
