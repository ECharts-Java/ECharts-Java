package org.icepear.echarts.origin.component.marker;

import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkAreaModel.ts#L59
 */
public interface MarkAreaOption extends MarkerOption, MarkAreaStateOption, StatesOptionMixin {

    MarkAreaOption setMainType(String mainType);

    MarkAreaOption setPrecision(Number precision);

    MarkAreaOption setData(MarkAreaDataItemOption[] data);
}
