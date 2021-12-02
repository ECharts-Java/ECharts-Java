package org.icepear.echarts.component;

import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxDataViewFeatureOption;

import lombok.Data;

@Accessors(chain=true)
@Data
public class ToolboxDataViewFeature implements ToolboxDataViewFeatureOption {
    private Boolean readOnly;

    private String optionToContent;

    private Object contentToOption;

    private String lang;

    private String backgroundColor;

    private String textColor;

    private String textareaColor;

    private String textareaBorderColor;

    private String buttonColor;
    
    private String buttonTextColor;

    private Boolean show;

    private String title;

    private String icon;

    private Object iconStyle;

    private Object emphasis;

    private Object iconStatus;

    private Object onclick;
}
