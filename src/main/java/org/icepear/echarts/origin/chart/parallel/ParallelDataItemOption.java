package org.icepear.echarts.origin.chart.parallel;

import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/parallel/ParallelSeries.ts#L56
 */
public interface ParallelDataItemOption extends ParallelStateOption, StatesOptionMixin {

    ParallelDataItemOption setValue(Number[] value);

    ParallelDataItemOption setValue(Object[] value);

    ParallelDataItemOption setValue(String[] value);
}
