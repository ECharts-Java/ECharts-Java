package org.icepear.echarts.origin.component.toolbox;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/featureManager.ts#L37
 */
public interface ToolboxFeatureOption {
    void setShow(Boolean show);

    void setTitle(String title);

    void setIcon(String icon);

    void setIconStyle(Object iconStyle);

    void setEmphasis(Object emphasis);

    void setIconStatus(Object iconStatus);

    void setOnclick(Object onclick);
}
