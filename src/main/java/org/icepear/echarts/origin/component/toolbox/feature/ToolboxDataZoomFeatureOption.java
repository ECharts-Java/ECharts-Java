package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/feature/DataZoom.ts#L57
 */
public interface ToolboxDataZoomFeatureOption extends ToolboxFeatureOption {
    @Getter
    @Setter
    public Object type = null;

    @Getter
    @Setter
    public Object filterMode = null;

    @Getter
    @Setter
    public Object xAxisIndex = null;

    @Getter
    @Setter
    public Object yAxisIndex = null;

    @Getter
    @Setter
    public Object xAxisId = null;

    @Getter
    @Setter
    public Object yAxisId = null;

    @Getter
    @Setter
    public Object brushStyle = null;
}
