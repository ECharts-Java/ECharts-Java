package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/f3471f0a7080e68f8819f7b000d32d73fb0820fb/src/util/types.ts#L851
 */
public interface AnimationOption {
    void setDuration(Number duration);

    void setEasin(String easin);

    void setDelay(Number delay);
}
