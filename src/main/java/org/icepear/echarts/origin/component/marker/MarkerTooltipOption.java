package org.icepear.echarts.origin.component.marker;

import org.icepear.echarts.origin.util.CommonTooltipOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkerModel.ts#L90
 */
public interface MarkerTooltipOption extends CommonTooltipOption {
    MarkerTooltipOption setTrigger(String trigger);
}
