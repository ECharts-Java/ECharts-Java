package org.icepear.echarts.origin.chart.gauge;

import org.icepear.echarts.origin.util.CircleLayoutOptionMixin;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/gauge/GaugeSeries.ts#L123
 */
public interface GaugeSeriesOption
        extends SeriesOption, GaugeStateOption, CircleLayoutOptionMixin, SeriesEncodeOptionMixin {

    GaugeSeriesOption setType(String type);

    GaugeSeriesOption setRadius(Number radius);

    GaugeSeriesOption setRadius(String radius);

    GaugeSeriesOption setStartAngle(Number startAngle);

    GaugeSeriesOption setEndAngle(Number endAngle);

    GaugeSeriesOption setClockwise(Boolean clockwise);

    GaugeSeriesOption setMin(Number min);

    GaugeSeriesOption setMax(Number max);

    GaugeSeriesOption setSplitNumber(Number splitNumber);

    GaugeSeriesOption setItemStyle(ItemStyleOption itemStyle);

    GaugeSeriesOption setAxisLine(Object axisLine);

    GaugeSeriesOption setProgress(GaugeProgressOption progress);

    GaugeSeriesOption setSplitLine(Object splitLine);

    GaugeSeriesOption setAxisTick(Object axisTick);

    GaugeSeriesOption setAxisLabel(Object axisLabel);

    GaugeSeriesOption setPointer(GaugePointerOption pointer);

    GaugeSeriesOption setAnchor(GaugeAnchorOption anchor);

    GaugeSeriesOption setTitle(GaugeTitleOption title);

    GaugeSeriesOption setDetail(GaugeDetailOption detail);

    GaugeSeriesOption setData(GaugeDataItemOption[] data);

    GaugeSeriesOption setData(Object[] data);

    GaugeSeriesOption setEmphasis(GaugeEmphasisOption emphasis);
}
