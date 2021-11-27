package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

public interface ToolboxDataViewFeatureOption extends ToolboxFeatureOption {
    void setReadOnly(Boolean readOnly);

    void setOptionToContent(String optionToContent);

    void setContentToOption(Object contentToOption);

    void setLang(String lang);

    void setBackgroundColor(String backgroundColor);

    void setTextColor(String textColor);

    void setTextareaColor(String textareaColor);

    void setTextareaBorderColor(String textareaBorderColor);

    void setButtonColor(String buttonColor);
    
    void setButtonTextColor(String buttonTextColor);
}
