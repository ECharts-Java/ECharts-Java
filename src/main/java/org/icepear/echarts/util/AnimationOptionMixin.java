package org.icepear.echarts.util;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L880
 */
@Getter
@Setter
public class AnimationOptionMixin {
    private String animation;

    private Integer animationThreshold;

    private Integer animationDuration;

    private String animationEasing;

    private Integer animationDelay;

    private Integer animationDurationUpdate;

    private String animationEasingUpdate;

    private Integer animationDelayUpdate;
}
