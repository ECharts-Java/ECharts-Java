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
    public List<Integer> data = null;

    @Getter
    @Setter
    public Boolean triggerLineEvent = null;
}
