package org.icepear.echarts.origin.chart.line;

import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnCartesianOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnPolarOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.origin.util.SeriesSamplingOptionMixin;
import org.icepear.echarts.origin.util.SeriesStackOptionMixin;
import org.icepear.echarts.origin.util.SymbolOptionMixin;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L73
 */
public interface LineSeriesOption
        extends SeriesOption, LineStateOption, SeriesOnCartesianOptionMixin, SeriesOnPolarOptionMixin,
        SeriesStackOptionMixin, SeriesSamplingOptionMixin, SymbolOptionMixin, SeriesEncodeOptionMixin {
    @Getter
    @Setter
    public Boolean clip = null;

    @Getter
    @Setter
    public Object lineStyle = null;

    @Getter
    @Setter
    public Object areaStyle = null;

    @Getter
    @Setter
    public String step = null;

    @Getter
    @Setter
    public String smooth = null;

    @Getter
    @Setter
    public String smoothMonotone = null;

    @Getter
    @Setter
    public Boolean connectNulls = null;

    @Getter
    @Setter
    public Boolean showSymbol = null;

    @Getter
    @Setter
    public Boolean showAllSymbol = null;

    @Getter
    @Setter
    public Boolean triggerLineEvent = null;
}
