package org.icepear.echarts.origin.chart.pie;

/**
 * https://github.com/apache/echarts/blob/56fbf07640a25bbd3e710094da824f5bed6c647d/src/chart/pie/PieSeries.ts#L59
 */
public interface PieStateOption {
    PieStateOption setItemStyle(Object itemStyle);
    
    PieStateOption setLabel(Object label);
    
    // Duplicated with SeriesOption.setLabelLine(Object)
    // PieStateOption setLabelLine(Object labelLine);
}
