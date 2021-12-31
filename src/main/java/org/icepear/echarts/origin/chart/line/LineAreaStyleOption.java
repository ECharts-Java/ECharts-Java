package org.icepear.echarts.origin.chart.line;

import org.icepear.echarts.origin.util.AreaStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L103
 */
public interface LineAreaStyleOption extends AreaStyleOption {

    LineAreaStyleOption setOrigin(String origin);
}
