package org.icepear.echarts.origin.component.toolbox.feature;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/feature/SaveAsImage.ts#L28
 */
public interface ToolboxSaveAsImageFeatureOption extends ToolboxFeatureOption {

    ToolboxSaveAsImageFeatureOption setIcon(String icon);

    ToolboxSaveAsImageFeatureOption setTitle(String title);

    ToolboxSaveAsImageFeatureOption setType(String type);

    ToolboxSaveAsImageFeatureOption setBackgroundColor(String backgroundColor);

    ToolboxSaveAsImageFeatureOption setConnectedBackgroundColor(String connectedBackgroundColor);

    ToolboxSaveAsImageFeatureOption setName(String name);

    ToolboxSaveAsImageFeatureOption setExcludeComponents(String[] excludeComponents);

    ToolboxSaveAsImageFeatureOption setPixelRatio(Number pixelRatio);

    ToolboxSaveAsImageFeatureOption setLang(String[] lang);
}
