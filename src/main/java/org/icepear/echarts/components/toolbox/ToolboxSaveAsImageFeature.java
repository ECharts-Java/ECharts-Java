package org.icepear.echarts.components.toolbox;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxSaveAsImageFeatureOption;

@Accessors(chain = true)
@Data
public class ToolboxSaveAsImageFeature implements ToolboxSaveAsImageFeatureOption {

    private Boolean show;

    @Setter(AccessLevel.NONE)
    private Object title;

    public ToolboxSaveAsImageFeature setTitle(Map<String, String> title) {
        this.title = title;
        return this;
    }

    public ToolboxSaveAsImageFeature setTitle(String title) {
        this.title = title;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object icon;

    public ToolboxSaveAsImageFeature setIcon(Map<String, String> icon) {
        this.icon = icon;
        return this;
    }

    public ToolboxSaveAsImageFeature setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    private Object iconStyle;

    private Object emphasis;

    private Map<String, Object> iconStatus;

    private Object onclick;

    private String type;

    private String backgroundColor;

    private String connectedBackgroundColor;

    private String name;

    private String[] excludeComponents;

    private Number pixelRatio;

    private String[] lang;
}
