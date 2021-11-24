package org.icepear.echarts.chart;

import org.icepear.echarts.util.SeriesOption;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L73
 */
@Getter
@Setter
public class LineSeriesOption {
    private SeriesOption seriesOption;

    private LineStateOptionMixin lineStateOptionMixin;
}
