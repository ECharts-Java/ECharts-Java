package org.icepear.echarts.origin.util;

import java.util.List;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1408
 */
public interface CommonAxisPointerOption {
    void setShow(Boolean show);

    void setZ(Number z);

    void setZlevel(Number zlevel);

    void setTriggerOn(String triggerOn);

    void setType(String type);

    void setSnap(Boolean snap);

    void setTriggerTooltip(Boolean triggerTooltip);

    void setValue(Object value);

    void setStatus(String status);

    void setLabel(LabelOption label);

    void setAnimation(String animation);

    void setAnimationDurationUpdate(Number animationDurationUpdate);

    void setAnimationEasingUpdate(Object animationEasingUpdate);

    void setLineStyle(Object lineStyle);

    void setShadowStyle(Object shadowStyle);

    void setHandle(Object handle);

    void setSeriesDataIndices(List<Object> seriesDataIndices);
}
