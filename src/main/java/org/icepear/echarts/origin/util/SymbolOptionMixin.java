package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L950
 */
public interface SymbolOptionMixin {

    SymbolOptionMixin setSymbol(String symbol);

    SymbolOptionMixin setSymbolSize(Number symbolSize);

    SymbolOptionMixin setSymbolSize(Number[] symbolSize);

    SymbolOptionMixin setSymbolRotate(Number symbolRotate);

    SymbolOptionMixin setSymbolKeepAspect(Boolean symbolKeepAspect);

    SymbolOptionMixin setSymbolOffset(Number symbolOffset);

    SymbolOptionMixin setSymbolOffset(Number[] symbolOffset);

    SymbolOptionMixin setSymbolOffset(String symbolOffset);

    SymbolOptionMixin setSymbolOffset(String[] symbolOffset);
}
