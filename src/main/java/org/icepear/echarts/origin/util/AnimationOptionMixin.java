package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L880
 */
public interface AnimationOptionMixin {

    AnimationOptionMixin setAnimation(Boolean animation);

    AnimationOptionMixin setAnimationThreshold(Number animationThreshold);

    AnimationOptionMixin setAnimationDuration(Number animationDuration);

    AnimationOptionMixin setAnimationDuration(Object animationDuration);

    AnimationOptionMixin setAnimationEasing(Object animationEasing);

    AnimationOptionMixin setAnimationDelay(Number animationDelay);

    AnimationOptionMixin setAnimationDelay(Object animationDelay);

    AnimationOptionMixin setAnimationDurationUpdate(Number animationDurationUpdate);

    AnimationOptionMixin setAnimationDurationUpdate(Object animationDurationUpdate);

    AnimationOptionMixin setAnimationEasingUpdate(Object animationEasingUpdate);

    AnimationOptionMixin setAnimationDelayUpdate(Number animationDelayUpdate);

    AnimationOptionMixin setAnimationDelayUpdate(Object animationDelayUpdate);
}
