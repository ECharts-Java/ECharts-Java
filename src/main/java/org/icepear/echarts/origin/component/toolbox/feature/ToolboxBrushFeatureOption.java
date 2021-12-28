package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/feature/Brush.ts#L35
 */
public interface ToolboxBrushFeatureOption extends ToolboxFeatureOption {

    ToolboxBrushFeatureOption setType(Object[] type);

    ToolboxBrushFeatureOption setIcon(String icon);

    ToolboxBrushFeatureOption setTitle(String title);
}
