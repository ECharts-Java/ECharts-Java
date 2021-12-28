package org.icepear.echarts.origin.chart.bar;

import org.icepear.echarts.origin.util.SeriesOnCartesianOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnPolarOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/bar/BaseBarSeries.ts#L34
 */
public interface BaseBarSeriesOption extends SeriesOption, SeriesOnCartesianOptionMixin, SeriesOnPolarOptionMixin {

    BaseBarSeriesOption setBarMinHeight(Number barMinHeight);

    BaseBarSeriesOption setBarMinAngle(Number barMinAngle);

    BaseBarSeriesOption setBarMaxWidth(Number barMaxWidth);

    BaseBarSeriesOption setBarMinWidth(Number barMinWidth);

    BaseBarSeriesOption setBarWidth(Number barWidth);

    BaseBarSeriesOption setBarWidth(String barWidth);

    BaseBarSeriesOption setBarGap(Number barGap);

    BaseBarSeriesOption setBarGap(String barGap);

    BaseBarSeriesOption setBarCategoryGap(Number barCategoryGap);

    BaseBarSeriesOption setBarCategoryGap(String barCategoryGap);

    BaseBarSeriesOption setLarge(Boolean large);

    BaseBarSeriesOption setLargeThreshold(Number largeThreshold);
}
