package org.icepear.echarts.origin.chart.line;

import org.icepear.echarts.origin.util.StatesOptionMixin;
import org.icepear.echarts.origin.util.SymbolOptionMixin;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/chart/line/LineSeries.ts#L61
 */
public interface LineDataItemOption extends SymbolOptionMixin, LineStateOption, StatesOptionMixin {

    LineDataItemOption setName(String name);

    LineDataItemOption setValue(Object value);
}
