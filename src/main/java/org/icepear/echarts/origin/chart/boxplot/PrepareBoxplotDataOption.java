package org.icepear.echarts.origin.chart.boxplot;

/**
 * https://github.com/apache/echarts/blob/f3471f0a7080e68f8819f7b000d32d73fb0820fb/src/chart/boxplot/prepareBoxplotData.ts#L23
 */
public interface PrepareBoxplotDataOption {

    PrepareBoxplotDataOption setBoundIQR(Number boundIQR);

    PrepareBoxplotDataOption setBoundIQR(String boundIQR);

    PrepareBoxplotDataOption setItemNameFormatter(String itemNameFormatter);
}
