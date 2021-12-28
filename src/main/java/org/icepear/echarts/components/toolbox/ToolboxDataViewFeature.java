package org.icepear.echarts.components.toolbox;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxDataViewFeatureOption;

@Accessors(chain = true)
@Data
public class ToolboxDataViewFeature implements ToolboxDataViewFeatureOption {

    private Boolean show;

    @Setter(AccessLevel.NONE)
    private Object title;

    public ToolboxDataViewFeature setTitle(Map<String, String> title) {
        this.title = title;
        return this;
    }

    public ToolboxDataViewFeature setTitle(String title) {
        this.title = title;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object icon;

    public ToolboxDataViewFeature setIcon(Map<String, String> icon) {
        this.icon = icon;
        return this;
    }

    public ToolboxDataViewFeature setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    private Object iconStyle;

    private Object emphasis;

    private Map<String, Object> iconStatus;

    private Object onclick;

    private Boolean readOnly;

    private Object optionToContent;

    private Object contentToOption;

    private String[] lang;

    private String backgroundColor;

    private String textColor;

    private String textareaColor;

    private String textareaBorderColor;

    private String buttonColor;

    private String buttonTextColor;
}
