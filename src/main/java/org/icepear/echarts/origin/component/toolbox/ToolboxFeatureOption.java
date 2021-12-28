package org.icepear.echarts.origin.component.toolbox;

import java.util.Map;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/featureManager.ts#L37
 */
public interface ToolboxFeatureOption {

    ToolboxFeatureOption setShow(Boolean show);

    ToolboxFeatureOption setTitle(Map<String, String> title);

    ToolboxFeatureOption setTitle(String title);

    ToolboxFeatureOption setIcon(Map<String, String> icon);

    ToolboxFeatureOption setIcon(String icon);

    ToolboxFeatureOption setIconStyle(Object iconStyle);

    ToolboxFeatureOption setEmphasis(Object emphasis);

    ToolboxFeatureOption setIconStatus(Map<String, Object> iconStatus);

    ToolboxFeatureOption setOnclick(Object onclick);
}
