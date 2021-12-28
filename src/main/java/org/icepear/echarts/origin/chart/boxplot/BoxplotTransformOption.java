package org.icepear.echarts.origin.chart.boxplot;

import org.icepear.echarts.origin.data.helper.DataTransformOption;

/**
 * https://github.com/apache/echarts/blob/f3471f0a7080e68f8819f7b000d32d73fb0820fb/src/chart/boxplot/boxplotTransform.ts#L26
 */
public interface BoxplotTransformOption extends DataTransformOption {

    BoxplotTransformOption setType(String type);

    BoxplotTransformOption setConfig(PrepareBoxplotDataOption config);
}
