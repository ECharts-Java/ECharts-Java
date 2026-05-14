package org.icepear.echarts.origin.chart.lines;

import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://echarts.apache.org/en/option.html#series-lines.lineStyle
 */
public interface LinesStateOption {

    LinesStateOption setLineStyle(LineStyleOption lineStyle);

    LinesStateOption setLabel(SeriesLabelOption label);
}
