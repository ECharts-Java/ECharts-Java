package org.icepear.echarts.components.toolbox;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxRestoreFeatureOption;

@Accessors(chain = true)
@Data
public class ToolboxRestoreFeature implements ToolboxRestoreFeatureOption {

    private Boolean show;

    @Setter(AccessLevel.NONE)
    private Object title;

    public ToolboxRestoreFeature setTitle(Map<String, String> title) {
        this.title = title;
        return this;
    }

    public ToolboxRestoreFeature setTitle(String title) {
        this.title = title;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object icon;

    public ToolboxRestoreFeature setIcon(Map<String, String> icon) {
        this.icon = icon;
        return this;
    }

    public ToolboxRestoreFeature setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    private Object iconStyle;

    private Object emphasis;

    private Map<String, Object> iconStatus;

    private Object onclick;
}
