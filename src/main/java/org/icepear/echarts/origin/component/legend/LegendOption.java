package org.icepear.echarts.origin.component.legend;

import java.util.Map;

import org.icepear.echarts.origin.util.BorderOptionMixin;
import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;
import org.icepear.echarts.origin.util.LabelOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/legend/LegendModel.ts#L159
 */
public interface LegendOption extends ComponentOption, LegendStyleOption, BoxLayoutOptionMixin, BorderOptionMixin {

    LegendOption setMainType(String mainType);

    LegendOption setShow(Boolean show);

    LegendOption setOrient(String orient);

    LegendOption setAlign(String align);

    LegendOption setBackgroundColor(String backgroundColor);

    LegendOption setBorderRadius(Number borderRadius);

    LegendOption setBorderRadius(Number[] borderRadius);

    LegendOption setPadding(Number padding);

    LegendOption setPadding(Number[] padding);

    LegendOption setItemGap(Number itemGap);

    LegendOption setItemWidth(Number itemWidth);

    LegendOption setItemHeight(Number itemHeight);

    LegendOption setSelectedMode(Boolean selectedMode);

    LegendOption setSelectedMode(String selectedMode);

    LegendOption setSelected(Map<String, Boolean> selected);

    LegendOption setSelector(Boolean selector);

    LegendOption setSelector(Object[] selector);

    LegendOption setSelectorLabel(LabelOption selectorLabel);

    LegendOption setEmphasis(Object emphasis);

    LegendOption setSelectorPosition(String selectorPosition);

    LegendOption setSelectorItemGap(Number selectorItemGap);

    LegendOption setSelectorButtonGap(Number selectorButtonGap);

    LegendOption setData(Object[] data);

    LegendOption setData(String[] data);

    LegendOption setTooltip(Object tooltip);
}
