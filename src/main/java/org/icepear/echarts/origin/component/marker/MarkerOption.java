package org.icepear.echarts.origin.component.marker;

import org.icepear.echarts.origin.util.AnimationOptionMixin;
import org.icepear.echarts.origin.util.ComponentOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkerModel.ts#L84
 */
public interface MarkerOption extends ComponentOption, AnimationOptionMixin {

    MarkerOption setSilent(Boolean silent);

    MarkerOption setData(Object[] data);

    MarkerOption setTooltip(Object tooltip);
}
