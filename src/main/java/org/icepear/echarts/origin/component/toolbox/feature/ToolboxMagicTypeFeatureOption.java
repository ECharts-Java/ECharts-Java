package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

import lombok.Getter;
import lombok.Setter;

public interface ToolboxMagicTypeFeatureOption extends ToolboxFeatureOption {
    @Getter
    @Setter
    public Object type = null;

    @Getter
    @Setter
    public Object option = null;

    @Getter
    @Setter
    public Object seriesIndex = null;
}
