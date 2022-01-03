package org.icepear.echarts.origin.chart.sunburst;

import org.icepear.echarts.origin.util.DefaultOptionDataItemObject;
import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/sunburst/SunburstSeries.ts#L79
 */
public interface SunburstSeriesNodeItemOption extends SunburstStateOption, StatesOptionMixin, DefaultOptionDataItemObject {

    SunburstSeriesNodeItemOption setNodeClick(String nodeClick);

    SunburstSeriesNodeItemOption setLink(String link);

    SunburstSeriesNodeItemOption setTarget(String target);

    SunburstSeriesNodeItemOption setChildren(SunburstSeriesNodeItemOption[] children);

    SunburstSeriesNodeItemOption setCollapsed(Boolean collapsed);

    SunburstSeriesNodeItemOption setCursor(String cursor);
}
