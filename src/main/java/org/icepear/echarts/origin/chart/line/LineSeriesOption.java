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
    void setClip(Boolean clip);

    void setLineStyle(Object lineStyle);

    void setAreaStyle(AreaStyleOption areaStyle);

    void setStep(String step);

    void setSmooth(Boolean smooth);

    void setSmoothMonotone(String smoothMonotone);

    void setConnectNulls(Boolean connectNulls);

    void setShowSymbol(Boolean showSymbol);

    void setShowAllSymbol(Boolean showAllSymbol);

    void setTriggerLineEvent(Boolean triggerLineEvent);
}
