package org.icepear.echarts.origin.chart.pie;

import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/pie/PieSeries.ts#L59
 */
public interface PieLabelOption extends SeriesLabelOption {

    PieLabelOption setRotate(Boolean rotate);

    PieLabelOption setRotate(Number rotate);

    PieLabelOption setRotate(String rotate);

    PieLabelOption setAlignTo(String alignTo);

    PieLabelOption setEdgeDistance(Number edgeDistance);

    PieLabelOption setEdgeDistance(String edgeDistance);

    PieLabelOption setMargin(Number margin);

    PieLabelOption setMargin(String margin);

    PieLabelOption setBleedMargin(Number bleedMargin);

    PieLabelOption setDistanceToLabelLine(Number distanceToLabelLine);

    PieLabelOption setPosition(Object position);

    PieLabelOption setPosition(String position);
}
