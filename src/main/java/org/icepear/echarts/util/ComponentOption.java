package org.icepear.echarts.util;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1491
 */
public interface ComponentOption {
    @Getter
    @Setter
    public String mainType = null;

    @Getter
    @Setter
    public String type = null;

    @Getter
    @Setter
    public String id = null;

    @Getter
    @Setter
    public String name = null;

    @Getter
    @Setter
    public Integer z = null;

    @Getter
    @Setter
    public Integer zlevel = null;
}
