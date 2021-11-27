package org.icepear.echarts.origin.component.legend;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.util.BorderOptionMixin;
import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/legend/LegendModel.ts#L159
 */
public interface LegendOption extends ComponentOption, LegendStyleOption, BoxLayoutOptionMixin, BorderOptionMixin {
    void setShow(Boolean show);

    void setOrient(Object orient);

    void setAlign(String align);

    void setBackgroundColor(String backgroundColor);

    void setBorderRadius(List<Number> borderRadius);

    void setPadding(List<Number> padding);

    void setItemGap(Number itemGap);

    void setItemWidth(Number itemWidth);

    void setItemHeight(Number itemHeight);

    void setSelectedMode(String selectedMode);

    void setSelected(Map<String, Boolean> selected);

    void setSelector(Object selector);

    void setSelectorLabel(Object selectorLabel);

    void setEmphasis(Object emphasis);

    void setSelectorPosition(String selectorPosition);

    void setSelectorItemGap(Number selectorItemGap);

    void setSelectorButtonGap(Number selectorButtonGap);

    void setData(List<Object> data);

    void setTooltip(TooltipOption tooltip);
}
