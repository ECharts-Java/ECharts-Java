package org.icepear.echarts.origin.util;

import java.util.List;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1408
 */
public interface CommonAxisPointerOption {
    CommonAxisPointerOption setShow(Boolean show);

    // Duplicated with ComponentOption.setZ(Number)
    // CommonAxisPointerOption setZ(Number z);

    // Duplicated with ComponentOption.setZlevel(Number)
    // CommonAxisPointerOption setZlevel(Number zlevel);

    CommonAxisPointerOption setTriggerOn(String triggerOn);

    // Duplicated with ComponentOption.setType(String)
    // CommonAxisPointerOption setType(String type);

    CommonAxisPointerOption setSnap(Boolean snap);

    CommonAxisPointerOption setTriggerTooltip(Boolean triggerTooltip);

    CommonAxisPointerOption setValue(Object value);

    CommonAxisPointerOption setStatus(String status);

    CommonAxisPointerOption setLabel(LabelOption label);

    CommonAxisPointerOption setAnimation(String animation);

    CommonAxisPointerOption setAnimationDurationUpdate(Number animationDurationUpdate);

    CommonAxisPointerOption setAnimationEasingUpdate(Object animationEasingUpdate);

    CommonAxisPointerOption setLineStyle(Object lineStyle);

    CommonAxisPointerOption setShadowStyle(Object shadowStyle);

    CommonAxisPointerOption setHandle(Object handle);

    CommonAxisPointerOption setSeriesDataIndices(List<Object> seriesDataIndices);
}
