package org.icepear.echarts.origin.chart.parallel;

import org.icepear.echarts.origin.coord.parallel.ParallelAxisOption;
import org.icepear.echarts.origin.util.SeriesEncodeOptionMixin;
import org.icepear.echarts.origin.util.SeriesOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/parallel/ParallelSeries.ts#L60
 */
public interface ParallelSeriesOption extends SeriesOption, ParallelStateOption, SeriesEncodeOptionMixin {

    ParallelSeriesOption setType(String type);

    ParallelSeriesOption setCoordinateSystem(String coordinateSystem);

    ParallelSeriesOption setParallelIndex(Number parallelIndex);

    ParallelSeriesOption setParallelId(String parallelId);

    ParallelSeriesOption setInactiveOpacity(Number inactiveOpacity);

    ParallelSeriesOption setActiveOpacity(Number activeOpacity);

    ParallelSeriesOption setSmooth(Boolean smooth);

    ParallelSeriesOption setSmooth(Number smooth);

    ParallelSeriesOption setRealtime(Boolean realtime);

    ParallelSeriesOption setTooltip(Object tooltip);

    ParallelSeriesOption setParallelAxisDefault(ParallelAxisOption parallelAxisDefault);

    ParallelSeriesOption setData(Object[][] data);

    ParallelSeriesOption setData(ParallelDataItemOption[] data);

    ParallelSeriesOption setEmphasis(ParallelEmphasisOption emphasis);
}
