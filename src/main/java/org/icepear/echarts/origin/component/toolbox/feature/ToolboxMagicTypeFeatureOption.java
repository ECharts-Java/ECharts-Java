package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/feature/MagicType.ts#L43
 */
public interface ToolboxMagicTypeFeatureOption extends ToolboxFeatureOption {

    ToolboxMagicTypeFeatureOption setType(Object[] type);

    ToolboxMagicTypeFeatureOption setIcon(String icon);

    ToolboxMagicTypeFeatureOption setTitle(String title);

    ToolboxMagicTypeFeatureOption setOption(String option);

    ToolboxMagicTypeFeatureOption setSeriesIndex(Object seriesIndex);
}
