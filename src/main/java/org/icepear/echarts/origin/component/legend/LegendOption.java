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
    LegendOption setShow(Boolean show);

    LegendOption setOrient(Object orient);

    LegendOption setAlign(String align);

    LegendOption setBackgroundColor(String backgroundColor);

    LegendOption setBorderRadius(List<Number> borderRadius);

    LegendOption setPadding(List<Number> padding);

    LegendOption setItemGap(Number itemGap);

    LegendOption setItemWidth(Number itemWidth);

    LegendOption setItemHeight(Number itemHeight);

    LegendOption setSelectedMode(String selectedMode);

    LegendOption setSelected(Map<String, Boolean> selected);

    LegendOption setSelector(Object selector);

    LegendOption setSelectorLabel(Object selectorLabel);

    LegendOption setEmphasis(Object emphasis);

    LegendOption setSelectorPosition(String selectorPosition);

    LegendOption setSelectorItemGap(Number selectorItemGap);

    LegendOption setSelectorButtonGap(Number selectorButtonGap);

    LegendOption setData(List<Object> data);

    LegendOption setTooltip(TooltipOption tooltip);
}
