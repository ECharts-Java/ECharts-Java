package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/feature/Brush.ts#L35
 */
public interface ToolboxBrushFeatureOption extends ToolboxFeatureOption {
    @Getter
    @Setter
    public Object type = null;
}