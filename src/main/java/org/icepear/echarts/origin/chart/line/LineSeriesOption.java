package org.icepear.echarts.origin.chart.line;

import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesLabelOption;
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

    LineSeriesOption setType(String type);

    LineSeriesOption setCoordinateSystem(String coordinateSystem);

    LineSeriesOption setClip(Boolean clip);

    LineSeriesOption setLabel(SeriesLabelOption label);

    LineSeriesOption setEndLabel(Object endLabel);

    LineSeriesOption setLineStyle(LineStyleOption lineStyle);

    LineSeriesOption setAreaStyle(LineAreaStyleOption areaStyle);

    LineSeriesOption setStep(Boolean step);

    LineSeriesOption setStep(String step);

    LineSeriesOption setSmooth(Boolean smooth);

    LineSeriesOption setSmooth(Number smooth);

    LineSeriesOption setSmoothMonotone(String smoothMonotone);

    LineSeriesOption setConnectNulls(Boolean connectNulls);

    LineSeriesOption setShowSymbol(Boolean showSymbol);

    LineSeriesOption setShowAllSymbol(Boolean showAllSymbol);

    LineSeriesOption setShowAllSymbol(String showAllSymbol);

    LineSeriesOption setData(LineDataItemOption[] data);

    LineSeriesOption setData(Object[] data);

    LineSeriesOption setTriggerLineEvent(Boolean triggerLineEvent);

    LineSeriesOption setEmphasis(LineEmphasisOption emphasis);
}
