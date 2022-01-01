package org.icepear.echarts.origin.chart.funnel;

import org.icepear.echarts.origin.util.NumericOptionDataItemObject;
import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/funnel/FunnelSeries.ts#L64
 */
public interface FunnelDataItemOption extends FunnelStateOption, StatesOptionMixin, NumericOptionDataItemObject {

    FunnelDataItemOption setItemStyle(Object itemStyle);
}
