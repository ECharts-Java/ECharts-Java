package org.icepear.echarts.origin.component.toolbox.feature;

import java.util.List;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/feature/MagicType.ts#L43
 */
public interface ToolboxMagicTypeFeatureOption extends ToolboxFeatureOption {
    ToolboxMagicTypeFeatureOption setType(List<String> type);

    ToolboxMagicTypeFeatureOption setOption(Object option);

    ToolboxMagicTypeFeatureOption setSeriesIndex(Object seriesIndex);
}
