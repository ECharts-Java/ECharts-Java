package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/feature/Restore.ts#L26
 */
public interface ToolboxRestoreFeatureOption extends ToolboxFeatureOption {

    ToolboxRestoreFeatureOption setIcon(String icon);

    ToolboxRestoreFeatureOption setTitle(String title);
}
