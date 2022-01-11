package org.icepear.echarts.origin.export;

import org.icepear.echarts.origin.component.marker.MarkAreaOption;
import org.icepear.echarts.origin.component.marker.MarkLineOption;
import org.icepear.echarts.origin.component.marker.MarkPointOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/export/option.ts#L173
 */
public interface SeriesInjectedOption {

    SeriesInjectedOption setMarkArea(MarkAreaOption markArea);

    SeriesInjectedOption setMarkLine(MarkLineOption markLine);

    SeriesInjectedOption setMarkPoint(MarkPointOption markPoint);

    SeriesInjectedOption setTooltip(Object tooltip);
}
