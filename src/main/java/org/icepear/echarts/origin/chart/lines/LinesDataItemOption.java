package org.icepear.echarts.origin.chart.lines;

import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;
import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://echarts.apache.org/en/option.html#series-lines.data
 */
public interface LinesDataItemOption extends StatesOptionMixin {

    LinesDataItemOption setName(String name);

    LinesDataItemOption setCoords(Number[][] coords);

    LinesDataItemOption setValue(Number value);

    LinesDataItemOption setValue(Number[] value);

    LinesDataItemOption setLineStyle(LineStyleOption lineStyle);

    LinesDataItemOption setLabel(SeriesLabelOption label);
}
