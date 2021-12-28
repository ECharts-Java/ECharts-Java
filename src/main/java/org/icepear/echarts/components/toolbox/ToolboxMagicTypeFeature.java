package org.icepear.echarts.components.toolbox;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxMagicTypeFeatureOption;

@Accessors(chain = true)
@Data
public class ToolboxMagicTypeFeature implements ToolboxMagicTypeFeatureOption {

    private Boolean show;

    @Setter(AccessLevel.NONE)
    private Object title;

    public ToolboxMagicTypeFeature setTitle(Map<String, String> title) {
        this.title = title;
        return this;
    }

    public ToolboxMagicTypeFeature setTitle(String title) {
        this.title = title;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object icon;

    public ToolboxMagicTypeFeature setIcon(Map<String, String> icon) {
        this.icon = icon;
        return this;
    }

    public ToolboxMagicTypeFeature setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    private Object iconStyle;

    private Object emphasis;

    private Map<String, Object> iconStatus;

    private Object onclick;

    private Object[] type;

    private String option;

    private Object seriesIndex;
}
