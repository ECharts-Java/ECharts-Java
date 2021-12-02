package org.icepear.echarts.origin.component.marker;

import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkLineModel.ts#L83
 */
public interface MarkLineOption extends MarkerOption, MarkLineStateOption, StatesOptionMixin {
    // TODO: We can simply extends SymbolOptionMixin just like SymbolOptionMixin
    MarkLineOption setSymbol(String symbol);

    MarkLineOption setSymbolSize(Number symbolSize);

    MarkLineOption setSymbolRotate(Number symbolRotate);

    MarkLineOption setSymbolOffset(Number symbolOffset);
}
