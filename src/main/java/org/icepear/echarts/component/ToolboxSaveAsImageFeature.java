package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxSaveAsImageFeatureOption;

import lombok.Getter;
import lombok.Setter;

public class ToolboxSaveAsImageFeature implements ToolboxSaveAsImageFeatureOption {
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

    @Getter
    @Setter
    Boolean show = null;

    @Getter
    @Setter
    String title = null;

    @Getter
    @Setter
    String icon = null;

    @Getter
    @Setter
    Object iconStyle = null;

    @Getter
    @Setter
    Object emphasis = null;

    @Getter
    @Setter
    Object iconStatus = null;

    @Getter
    @Setter
    Object onclick = null;
}
