package org.icepear.echarts.origin.util;

import java.io.Serializable;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1534
 */
public interface StatesOptionMixin extends Serializable {

    StatesOptionMixin setEmphasis(Object emphasis);

    StatesOptionMixin setSelect(Object select);

    StatesOptionMixin setBlur(Object blur);
}
