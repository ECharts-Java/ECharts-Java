package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

public interface ToolboxDataViewFeatureOption extends ToolboxFeatureOption {
    ToolboxDataViewFeatureOption setReadOnly(Boolean readOnly);

    ToolboxDataViewFeatureOption setOptionToContent(String optionToContent);

    ToolboxDataViewFeatureOption setContentToOption(Object contentToOption);

    ToolboxDataViewFeatureOption setLang(String lang);

    ToolboxDataViewFeatureOption setBackgroundColor(String backgroundColor);

    ToolboxDataViewFeatureOption setTextColor(String textColor);

    ToolboxDataViewFeatureOption setTextareaColor(String textareaColor);

    ToolboxDataViewFeatureOption setTextareaBorderColor(String textareaBorderColor);

    ToolboxDataViewFeatureOption setButtonColor(String buttonColor);
    
    ToolboxDataViewFeatureOption setButtonTextColor(String buttonTextColor);
}
