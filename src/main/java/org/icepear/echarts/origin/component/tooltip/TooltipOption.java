package org.icepear.echarts.origin.component.tooltip;

import org.icepear.echarts.origin.component.axisPointer.AxisPointerOption;
import org.icepear.echarts.origin.util.CommonTooltipOption;
import org.icepear.echarts.origin.util.ComponentOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/tooltip/TooltipModel.ts#L35
 */
public interface TooltipOption extends CommonTooltipOption, ComponentOption {
    void setAxisPointer(AxisPointerOption axisPointer);

    void setShowContent(Boolean showContent);

    void setTrigger(String trigger);

    void setDisplayMode(String displayMode);

    void setRenderMode(String renderMode);

    void setAppendToBody(Boolean appendToBody);

    void setClassName(String className);

    void setOrder(Object order);
}
