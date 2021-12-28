package org.icepear.echarts.origin.chart.funnel;

import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/funnel/FunnelSeries.ts#L46
 */
public interface FunnelLabelOption extends SeriesLabelOption {

    FunnelLabelOption setPosition(String position);
}
