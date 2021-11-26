package org.icepear.echarts.origin.util;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L997
 */
public interface AreaStyleOption {
    @Getter
    @Setter
    public String color = null;

    @Getter
    @Setter
    public Number opacity = null;
}
