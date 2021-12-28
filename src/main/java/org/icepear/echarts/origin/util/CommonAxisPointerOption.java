package org.icepear.echarts.origin.util;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1408
 */
public interface CommonAxisPointerOption {

    CommonAxisPointerOption setShow(Boolean show);

    CommonAxisPointerOption setShow(String show);

    CommonAxisPointerOption setTriggerOn(String triggerOn);

    CommonAxisPointerOption setType(String type);

    CommonAxisPointerOption setSnap(Boolean snap);

    CommonAxisPointerOption setTriggerTooltip(Boolean triggerTooltip);

    CommonAxisPointerOption setValue(Object value);

    CommonAxisPointerOption setStatus(String status);

    CommonAxisPointerOption setLabel(Object label);

    CommonAxisPointerOption setAnimation(Boolean animation);

    CommonAxisPointerOption setAnimation(String animation);

    CommonAxisPointerOption setAnimationDurationUpdate(Number animationDurationUpdate);

    CommonAxisPointerOption setAnimationEasingUpdate(Object animationEasingUpdate);

    CommonAxisPointerOption setLineStyle(LineStyleOption lineStyle);

    CommonAxisPointerOption setShadowStyle(AreaStyleOption shadowStyle);

    CommonAxisPointerOption setHandle(Object handle);

    CommonAxisPointerOption setSeriesDataIndices(Object[] seriesDataIndices);
}
