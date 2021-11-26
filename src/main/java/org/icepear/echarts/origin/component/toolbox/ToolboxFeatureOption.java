package org.icepear.echarts.origin.component.toolbox;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/component/toolbox/featureManager.ts#L37
 */
public interface ToolboxFeatureOption {
    @Getter
    @Setter
    Boolean show = null;

    @Getter
    @Setter
    String title = null;

    @Getter
    @Setter
    String icon = null;

    @Getter
    @Setter
    Object iconStyle = null;

    @Getter
    @Setter
    Object emphasis = null;

    @Getter
    @Setter
    Object iconStatus = null;

    @Getter
    @Setter
    Object onclick = null;
}
