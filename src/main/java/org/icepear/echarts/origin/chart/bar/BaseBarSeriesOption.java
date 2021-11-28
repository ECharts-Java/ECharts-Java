package org.icepear.echarts.origin.chart.bar;

import org.icepear.echarts.origin.util.SeriesOnCartesianOptionMixin;
import org.icepear.echarts.origin.util.SeriesOnPolarOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;
import org.icepear.echarts.type.BoxLength;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/bar/BaseBarSeries.ts#L34
 */
public interface BaseBarSeriesOption extends SeriesOption, SeriesOnCartesianOptionMixin, SeriesOnPolarOptionMixin {
    void setBarMinHeight(BoxLength<?> barMinHeight);

    void setBarMinAngle(Number barMinAngle);

    void setBarMaxWidth(BoxLength<?> barMaxWidth);

    void setBarMinWidth(BoxLength<?> barMinWidth);

    void setBarWidth(BoxLength<?> barWidth);

    void setBarGap(Number barGap);

    void setBarCategoryGap(Number barCategoryGap);

    void setLarge(Boolean large);
    
    void setLargeThreshold(Number largeThreshold);
}
