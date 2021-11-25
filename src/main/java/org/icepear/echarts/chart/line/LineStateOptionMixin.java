package org.icepear.echarts.chart.line;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L48
 */
public interface LineStateOptionMixin {
    @Getter
    @Setter
    public Object emphasis = null;
}
