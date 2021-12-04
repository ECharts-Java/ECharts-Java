package org.icepear.echarts.origin.chart.pie;

import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.CircleLayoutOptionMixin;
import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/56fbf07640a25bbd3e710094da824f5bed6c647d/src/chart/pie/PieSeries.ts#L100
 */
public interface PieSeriesOption
        extends SeriesOption, PieStateOption, CircleLayoutOptionMixin, BoxLayoutOptionMixin, SeriesEncodeOptionMixin {
    PieSeriesOption setRoseType(String roseType);

    PieSeriesOption setClockwise(Boolean clockwise);

    PieSeriesOption setStartAngle(Number startAngle);

    PieSeriesOption setMinAngle(Number minAngle);

    PieSeriesOption setMinShowLabelAngle(Number minShowLabelAngle);

    PieSeriesOption setSelectedOffset(Number selectedOffset);

    PieSeriesOption setAvoidLabelOverlap(Boolean avoidLabelOverlap);

    PieSeriesOption setPercentPrecision(Number percentPrecision);

    PieSeriesOption setStillShowZeroSum(Boolean stillShowZeroSum);

    PieSeriesOption setAnimationType(String animationType);

    PieSeriesOption setAnimationTypeUpdate(String animationTypeUpdate);

    PieSeriesOption setShowEmptyCircle(Boolean showEmptyCircle);

    PieSeriesOption setEmptyCircleStyle(Object emptyCircleStyle);
}
