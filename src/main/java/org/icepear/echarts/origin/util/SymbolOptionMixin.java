package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L950
 */
public interface SymbolOptionMixin {
    void setSymbol(String symbol);

    void setSymbolSize(Number symbolSize);

    void setSymbolRotate(Number symbolRotate);

    void setSymbolKeepAspect(Boolean symbolKeepAspect);

    void setSymbolOffset(Number symbolOffset);
}
