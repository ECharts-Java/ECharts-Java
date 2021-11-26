package org.icepear.echarts.origin.util;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L880
 */
public interface AnimationOptionMixin {
    @Getter
    @Setter
    public String animation = null;

    @Getter
    @Setter
    public Number animationThreshold = null;

    @Getter
    @Setter
    public Number animationDuration = null;

    @Getter
    @Setter
    public String animationEasing = null;

    @Getter
    @Setter
    public Number animationDelay = null;

    @Getter
    @Setter
    public Number animationDurationUpdate = null;

    @Getter
    @Setter
    public String animationEasingUpdate = null;

    @Getter
    @Setter
    public Number animationDelayUpdate = null;
}
