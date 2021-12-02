package org.icepear.echarts.component;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxRestoreFeatureOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class ToolboxRestoreFeature implements ToolboxRestoreFeatureOption {
    private Boolean show;

    private String title;

    private String icon;

    private Object iconStyle;

    private Object emphasis;

    private Object iconStatus;

    private Object onclick;
}
