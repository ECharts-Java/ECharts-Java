package org.icepear.echarts.components.toolbox;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxBrushFeatureOption;

@Accessors(chain = true)
@Data
public class ToolboxBrushFeature implements ToolboxBrushFeatureOption {

    private Boolean show;

    @Setter(AccessLevel.NONE)
    private Object title;

    public ToolboxBrushFeature setTitle(Map<String, String> title) {
        this.title = title;
        return this;
    }

    public ToolboxBrushFeature setTitle(String title) {
        this.title = title;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object icon;

    public ToolboxBrushFeature setIcon(Map<String, String> icon) {
        this.icon = icon;
        return this;
    }

    public ToolboxBrushFeature setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    private Object iconStyle;

    private Object emphasis;

    private Map<String, Object> iconStatus;

    private Object onclick;

    private Object[] type;
}
