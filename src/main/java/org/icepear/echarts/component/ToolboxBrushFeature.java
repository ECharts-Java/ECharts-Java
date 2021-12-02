package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxBrushFeatureOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class ToolboxBrushFeature implements ToolboxBrushFeatureOption{
    private List<String> type;

    private Boolean show;

    private String title;

    private String icon;

    private Object iconStyle;

    private Object emphasis;

    private Object iconStatus;

    private Object onclick;
}
