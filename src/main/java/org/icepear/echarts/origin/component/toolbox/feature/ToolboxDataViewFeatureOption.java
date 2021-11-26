package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

import lombok.Getter;
import lombok.Setter;

public interface ToolboxDataViewFeatureOption extends ToolboxFeatureOption {
    @Getter
    @Setter
    public Boolean readOnly = null;

    @Getter
    @Setter
    public String optionToContent = null;

    @Getter
    @Setter
    public Object contentToOption = null;

    @Getter
    @Setter
    public String lang = null;

    @Getter
    @Setter
    public String backgroundColor = null;

    @Getter
    @Setter
    public String textColor = null;

    @Getter
    @Setter
    public String textareaColor = null;

    @Getter
    @Setter
    public String textareaBorderColor = null;

    @Getter
    @Setter
    public String buttonColor = null;
    
    @Getter
    @Setter
    public String buttonTextColor = null;
}
