package org.icepear.echarts.origin.util;

import org.icepear.echarts.type.BoxLength;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L825
 */
public interface BoxLayoutOptionMixin {
    @Getter
    @Setter
    public BoxLength<?> width = null;

    @Getter
    @Setter
    public BoxLength<?> height = null;

    @Getter
    @Setter
    public BoxLength<?> top = null;

    @Getter
    @Setter
    public BoxLength<?> right = null;

    @Getter
    @Setter
    public BoxLength<?> bottom = null;

    @Getter
    @Setter
    public BoxLength<?> left = null;
}
