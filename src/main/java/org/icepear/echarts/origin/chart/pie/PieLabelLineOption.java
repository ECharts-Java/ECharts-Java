package org.icepear.echarts.origin.chart.pie;

import org.icepear.echarts.origin.util.LabelLineOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/pie/PieSeries.ts#L79
 */
public interface PieLabelLineOption extends LabelLineOption {

    PieLabelLineOption setMaxSurfaceAngle(Number maxSurfaceAngle);
}
