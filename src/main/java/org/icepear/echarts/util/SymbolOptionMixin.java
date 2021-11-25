package org.icepear.echarts.util;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L950
 */
public interface SymbolOptionMixin {
    @Getter
    @Setter
    public String symbol = null;

    @Getter
    @Setter
    public Integer symbolSize = null;

    @Getter
    @Setter
    public Integer symbolRotate = null;

    @Getter
    @Setter
    public Boolean symbolKeepAspect = null;

    @Getter
    @Setter
    public Integer symbolOffset = null;
}
