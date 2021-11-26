package org.icepear.echarts.origin.component.tooltip;

import org.icepear.echarts.origin.util.CommonTooltipOption;
import org.icepear.echarts.origin.util.ComponentOption;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/tooltip/TooltipModel.ts#L35
 */
public interface TooltipOption extends CommonTooltipOption, ComponentOption {
    @Getter
    @Setter
    public Object axisPointer = null;

    @Getter
    @Setter
    public Boolean showContent = null;

    @Getter
    @Setter
    public String trigger = null;

    @Getter
    @Setter
    public String displayMode = null;

    @Getter
    @Setter
    public String renderMode = null;

    @Getter
    @Setter
    public Boolean appendToBody = null;

    @Getter
    @Setter
    public String className = null;

    @Getter
    @Setter
    public Object order = null;
}
