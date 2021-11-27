package org.icepear.echarts.origin.component.toolbox.feature;

import java.util.List;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

public interface ToolboxSaveAsImageFeatureOption extends ToolboxFeatureOption {
    void setType(String type);

    void setBackgroundColor(String backgroundColor);

    void setConnectedBackgroundColor(String connectedBackgroundColor);

    void setName(String name);

    void setExcludeComponents(List<String> excludeComponents);

    void setPixelRatio(Number pixelRatio);

    void setLang(List<String> lang);
}
