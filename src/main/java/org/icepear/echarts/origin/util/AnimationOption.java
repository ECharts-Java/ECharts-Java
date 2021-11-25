package org.icepear.echarts.origin.util;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/f3471f0a7080e68f8819f7b000d32d73fb0820fb/src/util/types.ts#L851
 */
public interface AnimationOption {
    @Getter
    @Setter
    public Integer duration = null;

    @Getter
    @Setter
    public String easin = null;

    @Getter
    @Setter
    public Integer delay = null;
}
