package org.icepear.echarts.origin.component.marker;

import org.icepear.echarts.origin.util.LineStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/marker/MarkLineModel.ts#L31
 */
public interface MarkLineStateOption {
    MarkLineStateOption setLineStyle(LineStyleOption lineStyle);

    MarkLineStateOption setItemStyle(Object itemStyle);

    MarkLineStateOption setLabel(Object label);
}
