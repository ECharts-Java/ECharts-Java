package org.icepear.echarts.origin.component.toolbox;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.util.BorderOptionMixin;
import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/ToolboxModel.ts#L42
 */
public interface ToolboxOption extends ComponentOption, BoxLayoutOptionMixin, BorderOptionMixin {
    ToolboxOption setShow(Boolean show);

    ToolboxOption setOrient(Object orient);

    ToolboxOption setBackgroundColor(String backgroundColor);

    ToolboxOption setBorderRadius(List<Number> borderRadius);

    ToolboxOption setPadding(List<Number> padding);

    ToolboxOption setItemSize(Number itemSize);

    ToolboxOption setItemGap(Number itemGap);

    ToolboxOption setShowTitle(Boolean showTitle);

    ToolboxOption setIconStyle(Object iconStyle);

    ToolboxOption setEmphasis(Object emphasis);

    ToolboxOption setTextStyle(Object textStyle);

    ToolboxOption setTooltip(TooltipOption tooltip);

    ToolboxOption setFeature(Map<String, ToolboxFeatureOption> feature);
}
