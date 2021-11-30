package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxSaveAsImageFeatureOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class ToolboxSaveAsImageFeature implements ToolboxSaveAsImageFeatureOption {
    private String type;

    private String backgroundColor;

    private String connectedBackgroundColor;

    private String name;

    private List<String> excludeComponents;

    private Number pixelRatio;

    private List<String> lang;

    private Boolean show;

    private String title;

    private String icon;

    private Object iconStyle;

    private Object emphasis;

    private Object iconStatus;

    private Object onclick;
}
