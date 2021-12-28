package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/feature/DataView.ts#L296
 */
public interface ToolboxDataViewFeatureOption extends ToolboxFeatureOption {

    ToolboxDataViewFeatureOption setReadOnly(Boolean readOnly);

    ToolboxDataViewFeatureOption setOptionToContent(Object optionToContent);

    ToolboxDataViewFeatureOption setContentToOption(Object contentToOption);

    ToolboxDataViewFeatureOption setIcon(String icon);

    ToolboxDataViewFeatureOption setTitle(String title);

    ToolboxDataViewFeatureOption setLang(String[] lang);

    ToolboxDataViewFeatureOption setBackgroundColor(String backgroundColor);

    ToolboxDataViewFeatureOption setTextColor(String textColor);

    ToolboxDataViewFeatureOption setTextareaColor(String textareaColor);

    ToolboxDataViewFeatureOption setTextareaBorderColor(String textareaBorderColor);

    ToolboxDataViewFeatureOption setButtonColor(String buttonColor);

    ToolboxDataViewFeatureOption setButtonTextColor(String buttonTextColor);
}
