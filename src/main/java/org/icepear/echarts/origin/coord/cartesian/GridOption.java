package org.icepear.echarts.origin.coord.cartesian;

import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;
import org.icepear.echarts.origin.util.ShadowOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/cartesian/GridModel.ts#L26
 */
public interface GridOption extends ComponentOption, BoxLayoutOptionMixin, ShadowOptionMixin {
    void setShow(Boolean show);

    void setContainLabel(Boolean containLabel);

    void setBackgroundColor(String backgroundColor);

    void setBorderWidth(Number borderWidth);

    void setBorderColor(String borderColor);

    void setTooltip(TooltipOption tooltip);
}
