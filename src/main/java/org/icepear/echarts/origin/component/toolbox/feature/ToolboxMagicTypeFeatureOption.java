package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

public interface ToolboxMagicTypeFeatureOption extends ToolboxFeatureOption {
    void setType(Object type);

    void setOption(Object option);

    void setSeriesIndex(Object seriesIndex);
}
