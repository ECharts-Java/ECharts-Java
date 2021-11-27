package org.icepear.echarts.origin.util;

import java.util.List;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1295
 */
public interface CommonTooltipOption {
    void setShow(Boolean show);

    void setTriggerOn(String triggerOn);

    void setAlwaysShowContent(Boolean alwaysShowContent);

    void setFormatter(String formatter);

    void setPosition(Object position);

    void setConfine(Boolean confine);

    void setAlign(Object align);

    void setVerticalAlign(Object verticalAlign);

    void setShowDelay(Number showDelay);

    void setHideDelay(Number hideDelay);

    void setTransitionDuration(Number transitionDuration);

    void setEnterable(Boolean enterable);

    void setBackgroundColor(String backgroundColor);

    void setBorderColor(String borderColor);

    void setBorderRadius(Number borderRadius);

    void setBorderWidth(Number borderWidth);

    void setShadowBlur(Number shadowBlur);

    void setShadowColor(String shadowColor);

    void setShadowOffsetX(Number shadowOffsetX);

    void setShadowOffsetY(Number shadowOffsetY);

    void setPadding(List<Number> padding);

    void setExtraCssText(String extraCssText);

    void setTextStyle(Object textStyle);
}
