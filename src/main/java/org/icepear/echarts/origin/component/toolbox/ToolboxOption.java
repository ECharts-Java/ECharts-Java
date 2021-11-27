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
    void setShow(Boolean show);

    void setOrient(Object orient);

    void setBackgroundColor(String backgroundColor);

    void setBorderRadius(List<Number> borderRadius);

    void setPadding(List<Number> padding);

    void setItemSize(Number itemSize);

    void setItemGap(Number itemGap);

    void setShowTitle(Boolean showTitle);

    void setIconStyle(Object iconStyle);

    void setEmphasis(Object emphasis);

    void setTextStyle(Object textStyle);

    void setTooltip(TooltipOption tooltip);

    void setFeature(Map<String, ToolboxFeatureOption> feature);
}
