package org.icepear.echarts.origin.coord.cartesian;

import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;
import org.icepear.echarts.origin.util.ShadowOptionMixin;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/cartesian/GridModel.ts#L26
 */
public interface GridOption extends ComponentOption, BoxLayoutOptionMixin, ShadowOptionMixin {
    @Getter
    @Setter
    public Boolean show = null;

    @Getter
    @Setter
    public Boolean containLabel = null;

    @Getter
    @Setter
    public String backgroundColor = null;

    @Getter
    @Setter
    public Number borderWidth = null;

    @Getter
    @Setter
    public String borderColor = null;

    @Getter
    @Setter
    public TooltipOption tooltip = null;
}
