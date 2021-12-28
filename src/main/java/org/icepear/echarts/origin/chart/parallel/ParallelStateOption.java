package org.icepear.echarts.origin.chart.parallel;

import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/parallel/ParallelSeries.ts#L51
 */
public interface ParallelStateOption {

    ParallelStateOption setLineStyle(LineStyleOption lineStyle);

    ParallelStateOption setLabel(SeriesLabelOption label);
}
