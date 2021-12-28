package org.icepear.echarts.origin.component.visualMap;

import org.icepear.echarts.origin.util.ItemStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/visualMap/ContinuousModel.ts#L36
 */
public interface ContinousVisualMapOption extends VisualMapOption {

    ContinousVisualMapOption setAlign(String align);

    ContinousVisualMapOption setCalculable(Boolean calculable);

    ContinousVisualMapOption setRange(Number[] range);

    ContinousVisualMapOption setHoverLink(Boolean hoverLink);

    ContinousVisualMapOption setHoverLinkDataSize(Number hoverLinkDataSize);

    ContinousVisualMapOption setHoverLinkOnHandle(Boolean hoverLinkOnHandle);

    ContinousVisualMapOption setHandleIcon(String handleIcon);

    ContinousVisualMapOption setHandleSize(Number handleSize);

    ContinousVisualMapOption setHandleSize(String handleSize);

    ContinousVisualMapOption setHandleStyle(ItemStyleOption handleStyle);

    ContinousVisualMapOption setIndicatorIcon(String indicatorIcon);

    ContinousVisualMapOption setIndicatorSize(Number indicatorSize);

    ContinousVisualMapOption setIndicatorSize(String indicatorSize);

    ContinousVisualMapOption setIndicatorStyle(ItemStyleOption indicatorStyle);

    ContinousVisualMapOption setEmphasis(Object emphasis);
}
