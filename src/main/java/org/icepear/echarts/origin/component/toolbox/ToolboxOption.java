package org.icepear.echarts.origin.component.toolbox;

import java.util.Map;

import org.icepear.echarts.origin.util.BorderOptionMixin;
import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.CommonTooltipOption;
import org.icepear.echarts.origin.util.ComponentOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LabelOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/ToolboxModel.ts#L42
 */
public interface ToolboxOption extends ComponentOption, BoxLayoutOptionMixin, BorderOptionMixin {

    ToolboxOption setMainType(String mainType);

    ToolboxOption setShow(Boolean show);

    ToolboxOption setOrient(String orient);

    ToolboxOption setBackgroundColor(String backgroundColor);

    ToolboxOption setBorderRadius(Number borderRadius);

    ToolboxOption setBorderRadius(Number[] borderRadius);

    ToolboxOption setPadding(Number padding);

    ToolboxOption setPadding(Number[] padding);

    ToolboxOption setItemSize(Number itemSize);

    ToolboxOption setItemGap(Number itemGap);

    ToolboxOption setShowTitle(Boolean showTitle);

    ToolboxOption setIconStyle(ItemStyleOption iconStyle);

    ToolboxOption setEmphasis(Object emphasis);

    ToolboxOption setTextStyle(LabelOption textStyle);

    ToolboxOption setTooltip(CommonTooltipOption tooltip);

    ToolboxOption setFeature(Map<String, ToolboxFeatureOption> feature);
}
