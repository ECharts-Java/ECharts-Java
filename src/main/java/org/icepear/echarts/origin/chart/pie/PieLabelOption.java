package org.icepear.echarts.origin.chart.pie;

import org.icepear.echarts.origin.util.SeriesLabelOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/pie/PieSeries.ts#L59
 */
public interface PieLabelOption extends SeriesLabelOption {

	PieLabelOption setRotate(String rotate);

	PieLabelOption setRotate(Number rotate);

	PieLabelOption setRotate(Boolean rotate);

	PieLabelOption setAlignTo(String alignTo);

	PieLabelOption setEdgeDistance(String edgeDistance);

	PieLabelOption setEdgeDistance(Number edgeDistance);

	PieLabelOption setMargin(String margin);

	PieLabelOption setMargin(Number margin);

	PieLabelOption setBleedMargin(Number bleedMargin);

	PieLabelOption setDistanceToLabelLine(Number distanceToLabelLine);

	PieLabelOption setPosition(String position);

	PieLabelOption setPosition(Object position);
}