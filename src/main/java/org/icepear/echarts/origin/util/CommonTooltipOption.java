package org.icepear.echarts.origin.util;

import java.util.List;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1295
 */
public interface CommonTooltipOption {
    CommonTooltipOption setShow(Boolean show);

    CommonTooltipOption setTriggerOn(String triggerOn);

    CommonTooltipOption setAlwaysShowContent(Boolean alwaysShowContent);

    CommonTooltipOption setFormatter(String formatter);

    CommonTooltipOption setPosition(Object position);

    CommonTooltipOption setConfine(Boolean confine);

    CommonTooltipOption setAlign(Object align);

    CommonTooltipOption setVerticalAlign(Object verticalAlign);

    CommonTooltipOption setShowDelay(Number showDelay);

    CommonTooltipOption setHideDelay(Number hideDelay);

    CommonTooltipOption setTransitionDuration(Number transitionDuration);

    CommonTooltipOption setEnterable(Boolean enterable);

    CommonTooltipOption setBackgroundColor(String backgroundColor);

    CommonTooltipOption setBorderColor(String borderColor);

    CommonTooltipOption setBorderRadius(Number borderRadius);

    CommonTooltipOption setBorderWidth(Number borderWidth);

    CommonTooltipOption setShadowBlur(Number shadowBlur);

    CommonTooltipOption setShadowColor(String shadowColor);

    CommonTooltipOption setShadowOffsetX(Number shadowOffsetX);

    CommonTooltipOption setShadowOffsetY(Number shadowOffsetY);

    CommonTooltipOption setPadding(List<Number> padding);

    CommonTooltipOption setExtraCssText(String extraCssText);

    CommonTooltipOption setTextStyle(Object textStyle);
}
