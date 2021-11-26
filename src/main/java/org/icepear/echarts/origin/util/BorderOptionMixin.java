package org.icepear.echarts.origin.util;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L848
 */
public interface BorderOptionMixin {
    @Getter
    @Setter
    public String borderColor = null;

    @Getter
    @Setter
    public Number borderWidth = null;

    @Getter
    @Setter
    public String borderType = null;

    @Getter
    @Setter
    public Object borderCap = null;

    @Getter
    @Setter
    public Object borderJoin = null;

    @Getter
    @Setter
    public Number borderDashOffset = null;

    @Getter
    @Setter
    public Number borderMiterLimit = null;
}
