package org.icepear.echarts.origin.component.toolbox.feature;

import java.util.List;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.type.AxisIndex;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/feature/DataZoom.ts#L57
 */
public interface ToolboxDataZoomFeatureOption extends ToolboxFeatureOption {
    ToolboxDataZoomFeatureOption setType(List<String> type);

    ToolboxDataZoomFeatureOption setFilterMode(Object filterMode);

    ToolboxDataZoomFeatureOption setXAxisIndex(AxisIndex xAxisIndex);

    ToolboxDataZoomFeatureOption setYAxisIndex(AxisIndex yAxisIndex);

    ToolboxDataZoomFeatureOption setXAxisId(Object xAxisId);

    ToolboxDataZoomFeatureOption setYAxisId(Object yAxisId);

    ToolboxDataZoomFeatureOption setBrushStyle(Object brushStyle);
}
