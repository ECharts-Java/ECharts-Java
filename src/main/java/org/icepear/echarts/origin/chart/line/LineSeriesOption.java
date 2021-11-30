package org.icepear.echarts.origin.chart.line;

import org.icepear.echarts.origin.util.AreaStyleOption;
import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnCartesianOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnPolarOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.origin.util.SeriesSamplingOptionMixin;
import org.icepear.echarts.origin.util.SeriesStackOptionMixin;
import org.icepear.echarts.origin.util.SymbolOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L73
 */
public interface LineSeriesOption
        extends SeriesOption, LineStateOption, SeriesOnCartesianOptionMixin, SeriesOnPolarOptionMixin,
        SeriesStackOptionMixin, SeriesSamplingOptionMixin, SymbolOptionMixin, SeriesEncodeOptionMixin {
    LineSeriesOption setClip(Boolean clip);

    LineSeriesOption setLineStyle(Object lineStyle);

    LineSeriesOption setAreaStyle(AreaStyleOption areaStyle);

    LineSeriesOption setStep(String step);

    LineSeriesOption setSmooth(Boolean smooth);

    LineSeriesOption setSmoothMonotone(String smoothMonotone);

    LineSeriesOption setConnectNulls(Boolean connectNulls);

    LineSeriesOption setShowSymbol(Boolean showSymbol);

    LineSeriesOption setShowAllSymbol(Boolean showAllSymbol);

    LineSeriesOption setTriggerLineEvent(Boolean triggerLineEvent);
}
