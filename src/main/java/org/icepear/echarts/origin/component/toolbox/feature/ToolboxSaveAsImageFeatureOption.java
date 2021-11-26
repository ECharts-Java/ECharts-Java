package org.icepear.echarts.origin.component.toolbox.feature;

import java.util.List;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

import lombok.Getter;
import lombok.Setter;

public interface ToolboxSaveAsImageFeatureOption extends ToolboxFeatureOption {
    @Getter
    @Setter
    public String type = null;

    @Getter
    @Setter
    public String backgroundColor = null;

    @Getter
    @Setter
    public String connectedBackgroundColor = null;

    @Getter
    @Setter
    public String name = null;

    @Getter
    @Setter
    public List<String> excludeComponents = null;

    @Getter
    @Setter
    public Number pixelRatio = null;

    @Getter
    @Setter
    public List<String> lang = null;
}
