package org.icepear.echarts.origin.component.marker;

import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLineLabelOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkLineModel.ts#L31
 */
public interface MarkLineStateOption {

    MarkLineStateOption setLineStyle(LineStyleOption lineStyle);

    MarkLineStateOption setItemStyle(ItemStyleOption itemStyle);

    MarkLineStateOption setLabel(SeriesLineLabelOption label);
}
