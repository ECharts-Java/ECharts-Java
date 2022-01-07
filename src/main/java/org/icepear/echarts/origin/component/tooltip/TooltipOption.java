package org.icepear.echarts.origin.component.tooltip;

import org.icepear.echarts.origin.util.CommonTooltipOption;
import org.icepear.echarts.origin.util.ComponentOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/tooltip/TooltipModel.ts#L35
 */
public interface TooltipOption extends CommonTooltipOption, ComponentOption {

    TooltipOption setMainType(String mainType);

    TooltipOption setAxisPointer(TooltipAxisPointerOption axisPointer);

    TooltipOption setShowContent(Boolean showContent);

    TooltipOption setTrigger(String trigger);

    TooltipOption setDisplayMode(String displayMode);

    TooltipOption setRenderMode(String renderMode);

    TooltipOption setAppendToBody(Boolean appendToBody);

    TooltipOption setClassName(String className);

    TooltipOption setOrder(String order);
}
