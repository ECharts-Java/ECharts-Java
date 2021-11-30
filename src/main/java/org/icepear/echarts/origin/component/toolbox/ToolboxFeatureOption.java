package org.icepear.echarts.origin.component.toolbox;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/featureManager.ts#L37
 */
public interface ToolboxFeatureOption {
    ToolboxFeatureOption setShow(Boolean show);

    ToolboxFeatureOption setTitle(String title);

    ToolboxFeatureOption setIcon(String icon);

    ToolboxFeatureOption setIconStyle(Object iconStyle);

    ToolboxFeatureOption setEmphasis(Object emphasis);

    ToolboxFeatureOption setIconStatus(Object iconStatus);

    ToolboxFeatureOption setOnclick(Object onclick);
}
