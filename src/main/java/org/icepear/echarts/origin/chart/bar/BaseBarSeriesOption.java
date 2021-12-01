package org.icepear.echarts.origin.chart.bar;

import org.icepear.echarts.origin.util.SeriesOnCartesianOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnPolarOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.type.BoxLength;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/bar/BaseBarSeries.ts#L34
 */
public interface BaseBarSeriesOption extends SeriesOption, SeriesOnCartesianOptionMixin, SeriesOnPolarOptionMixin {
    BaseBarSeriesOption setBarMinHeight(BoxLength barMinHeight);

    BaseBarSeriesOption setBarMinAngle(Number barMinAngle);

    BaseBarSeriesOption setBarMaxWidth(BoxLength barMaxWidth);

    BaseBarSeriesOption setBarMinWidth(BoxLength barMinWidth);

    BaseBarSeriesOption setBarWidth(BoxLength barWidth);

    BaseBarSeriesOption setBarGap(Number barGap);

    BaseBarSeriesOption setBarCategoryGap(Number barCategoryGap);

    BaseBarSeriesOption setLarge(Boolean large);
    
    BaseBarSeriesOption setLargeThreshold(Number largeThreshold);
}
