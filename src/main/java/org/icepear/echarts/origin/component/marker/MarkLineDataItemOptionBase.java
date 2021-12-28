package org.icepear.echarts.origin.component.marker;

import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkLineModel.ts#L39
 */
public interface MarkLineDataItemOptionBase extends MarkLineStateOption, StatesOptionMixin {

    MarkLineDataItemOptionBase setName(String name);
}
