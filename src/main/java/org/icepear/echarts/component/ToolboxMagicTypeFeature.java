package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxMagicTypeFeatureOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class ToolboxMagicTypeFeature implements ToolboxMagicTypeFeatureOption {
    private List<String> type;

    private Object option;

    private Object seriesIndex;

    private Boolean show;

    private String title;

    private String icon;

    private Object iconStyle;

    private Object emphasis;

    private Object iconStatus;

    private Object onclick;
}
