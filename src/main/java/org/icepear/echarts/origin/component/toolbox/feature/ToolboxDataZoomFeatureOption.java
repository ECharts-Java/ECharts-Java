package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/feature/DataZoom.ts#L57
 */
public interface ToolboxDataZoomFeatureOption extends ToolboxFeatureOption {
    void setType(Object type);

    void setFilterMode(Object filterMode);

    void setXAxisIndex(Object xAxisIndex);

    void setYAxisIndex(Object yAxisIndex);

    void setXAxisId(Object xAxisId);

    void setYAxisId(Object yAxisId);

    void setBrushStyle(Object brushStyle);
}
