package org.icepear.echarts.origin.util;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L841
 */
public interface ShadowOptionMixin {
    @Getter
    @Setter
    public Number shadowBlur = null;

    @Getter
    @Setter
    public String shadowColor = null;

    @Getter
    @Setter
    public Number shadowOffsetX = null;

    @Getter
    @Setter
    public Number shadowOffsetY = null;
}
