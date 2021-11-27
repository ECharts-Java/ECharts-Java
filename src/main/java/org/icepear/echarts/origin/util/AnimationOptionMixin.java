package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L880
 */
public interface AnimationOptionMixin {
    void setAnimation(String animation);

    void setAnimationThreshold(Number animationThreshold);

    void setAnimationDuration(Number animationDuration);

    void setAnimationEasing(String animationEasing);

    void setAnimationDelay(Number animationDelay);

    void setAnimationDurationUpdate(Number animationDurationUpdate);

    void setAnimationEasingUpdate(String animationEasingUpdate);

    void setAnimationDelayUpdate(Number animationDelayUpdate);
}
