package org.icepear.echarts.origin.coord.cartesian;

import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;
import org.icepear.echarts.origin.util.ShadowOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/coord/cartesian/GridModel.ts#L26
 */
public interface GridOption extends ComponentOption, BoxLayoutOptionMixin, ShadowOptionMixin {

    GridOption setMainType(String mainType);

    GridOption setShow(Boolean show);

    GridOption setContainLabel(Boolean containLabel);

    GridOption setBackgroundColor(String backgroundColor);

    GridOption setBorderWidth(Number borderWidth);

    GridOption setBorderColor(String borderColor);

    GridOption setTooltip(Object tooltip);
}
