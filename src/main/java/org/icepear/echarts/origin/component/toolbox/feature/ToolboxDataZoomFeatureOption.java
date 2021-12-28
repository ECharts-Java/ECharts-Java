package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.origin.util.ItemStyleOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/feature/DataZoom.ts#L57
 */
public interface ToolboxDataZoomFeatureOption extends ToolboxFeatureOption {

    ToolboxDataZoomFeatureOption setType(Object[] type);

    ToolboxDataZoomFeatureOption setIcon(String icon);

    ToolboxDataZoomFeatureOption setTitle(String title);

    ToolboxDataZoomFeatureOption setFilterMode(String filterMode);

    ToolboxDataZoomFeatureOption setXAxisIndex(Object xAxisIndex);

    ToolboxDataZoomFeatureOption setYAxisIndex(Object yAxisIndex);

    ToolboxDataZoomFeatureOption setXAxisId(Object xAxisId);

    ToolboxDataZoomFeatureOption setYAxisId(Object yAxisId);

    ToolboxDataZoomFeatureOption setBrushStyle(ItemStyleOption brushStyle);
}
