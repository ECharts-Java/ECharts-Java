package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L880
 */
public interface AnimationOptionMixin {
    AnimationOptionMixin setAnimation(String animation);

    AnimationOptionMixin setAnimationThreshold(Number animationThreshold);

    AnimationOptionMixin setAnimationDuration(Number animationDuration);

    AnimationOptionMixin setAnimationEasing(String animationEasing);

    AnimationOptionMixin setAnimationDelay(Number animationDelay);

    AnimationOptionMixin setAnimationDurationUpdate(Number animationDurationUpdate);

    AnimationOptionMixin setAnimationEasingUpdate(String animationEasingUpdate);

    AnimationOptionMixin setAnimationDelayUpdate(Number animationDelayUpdate);
}
