package org.icepear.echarts.origin.chart.sunburst;

import org.icepear.echarts.origin.util.DefaultOptionDataItemObject;
import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/sunburst/SunburstSeries.ts#L79
 */
public interface SunburstNodeItemOption extends SunburstStateOption, StatesOptionMixin, DefaultOptionDataItemObject {

    SunburstNodeItemOption setNodeClick(String nodeClick);

    SunburstNodeItemOption setLink(String link);

    SunburstNodeItemOption setTarget(String target);

    SunburstNodeItemOption setChildren(SunburstNodeItemOption[] children);

    SunburstNodeItemOption setCollapsed(Boolean collapsed);

    SunburstNodeItemOption setCursor(String cursor);
}
