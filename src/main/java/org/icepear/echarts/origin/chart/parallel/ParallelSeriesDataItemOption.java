package org.icepear.echarts.origin.chart.parallel;

import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/parallel/ParallelSeries.ts#L56
 */
public interface ParallelSeriesDataItemOption extends ParallelStateOption, StatesOptionMixin {

    ParallelSeriesDataItemOption setValue(Number[] value);

    ParallelSeriesDataItemOption setValue(Object[] value);

    ParallelSeriesDataItemOption setValue(String[] value);
}
