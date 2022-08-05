package org.icepear.echarts.origin.chart.funnel;

import org.icepear.echarts.origin.util.BoxLayoutOptionMixin;
import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/funnel/FunnelSeries.ts#L74
 */
public interface FunnelSeriesOption
        extends SeriesOption, FunnelStateOption, BoxLayoutOptionMixin, SeriesEncodeOptionMixin {

    FunnelSeriesOption setType(String type);

    FunnelSeriesOption setMin(Number min);

    FunnelSeriesOption setMax(Number max);

    FunnelSeriesOption setMinSize(Number minSize);

    FunnelSeriesOption setMinSize(String minSize);

    FunnelSeriesOption setMaxSize(Number maxSize);

    FunnelSeriesOption setMaxSize(String maxSize);

    FunnelSeriesOption setSort(String sort);

    FunnelSeriesOption setOrient(String orient);

    FunnelSeriesOption setGap(Number gap);

    FunnelSeriesOption setFunnelAlign(Object funnelAlign);

    FunnelSeriesOption setData(FunnelDataItemOption[] data);

    FunnelSeriesOption setData(Number[] data);

    FunnelSeriesOption setData(Number[][] data);

    FunnelSeriesOption setEmphasis(FunnelEmphasisOption emphasis);
}
