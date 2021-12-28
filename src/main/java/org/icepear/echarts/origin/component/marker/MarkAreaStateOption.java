package org.icepear.echarts.origin.component.marker;

import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkAreaModel.ts#L25
 */
public interface MarkAreaStateOption {

    MarkAreaStateOption setItemStyle(ItemStyleOption itemStyle);

    MarkAreaStateOption setLabel(SeriesLabelOption label);
}
