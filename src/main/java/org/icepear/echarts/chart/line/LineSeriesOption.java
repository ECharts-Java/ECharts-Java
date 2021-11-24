package org.icepear.echarts.chart.line;

import java.util.List;

import org.icepear.echarts.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.util.SeriesOnCartesianOptionMixin;
import org.icepear.echarts.util.SeriesOnPolarOptionMixin;
import org.icepear.echarts.util.SeriesOption;
import org.icepear.echarts.util.SeriesSamplingOptionMixin;
import org.icepear.echarts.util.SeriesStackOptionMixin;
import org.icepear.echarts.util.SymbolOptionMixin;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L73
 */
@Getter
@Setter
public class LineSeriesOption extends SeriesOption {
    private LineStateOption lineStateOption;

    private SeriesOnCartesianOptionMixin seriesOnCartesianOptionMixin;

    private SeriesOnPolarOptionMixin seriesOnPolarOptionMixin;

    private SeriesStackOptionMixin seriesStackOptionMixin;

    private SeriesSamplingOptionMixin seriesSamplingOptionMixin;

    private SymbolOptionMixin symbolOptionMixin;

    private SeriesEncodeOptionMixin seriesEncodeOptionMixin;

    private Boolean clip;

    private Object lineStyle;

    private Object areaStyle;

    private String step;

    private String smooth;

    private String smoothMonotone;

    private Boolean connectNulls;

    private Boolean showSymbol;

    private Boolean showAllSymbol;

    private List<Object> data;

    private Boolean triggerLineEvent;
}
