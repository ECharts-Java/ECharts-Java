package org.icepear.echarts.util;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1534
 */
@Getter
@Setter
public class StatesOptionMixin {
    private Object emphasis;

    private Object select;

    private Object blur;
}
