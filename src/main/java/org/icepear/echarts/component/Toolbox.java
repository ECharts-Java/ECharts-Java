package org.icepear.echarts.component;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.origin.component.toolbox.ToolboxOption;
import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.type.BoxLength;

import lombok.Getter;
import lombok.Setter;

public class Toolbox implements ToolboxOption {
    @Getter
    @Setter
    Boolean show = null;

    @Getter
    @Setter
    Object orient = null;

    @Getter
    @Setter
    String backgroundColor = null;

    @Getter
    @Setter
    Number borderRadius = null;

    @Getter
    @Setter
    List<Number> padding = null;

    @Getter
    @Setter
    Number itemSize = null;

    @Getter
    @Setter
    Number itemGap = null;

    @Getter
    @Setter
    Boolean showTitle = null;

    @Getter
    @Setter
    Object iconStyle = null;

    @Getter
    @Setter
    Object emphasis = null;

    @Getter
    @Setter
    Object textStyle = null;

    @Getter
    @Setter
    TooltipOption tooltip = null;

    @Getter
    @Setter
    Map<String, ToolboxFeatureOption> feature = null;

    @Getter
    @Setter
    public String mainType = null;

    @Getter
    @Setter
    public String type = null;

    @Getter
    @Setter
    public String id = null;

    @Getter
    @Setter
    public String name = null;

    @Getter
    @Setter
    public Number z = null;

    @Getter
    @Setter
    public Number zlevel = null;

    @Getter
    @Setter
    public BoxLength<?> width = null;

    @Getter
    @Setter
    public BoxLength<?> height = null;

    @Getter
    @Setter
    public BoxLength<?> top = null;

    @Getter
    @Setter
    public BoxLength<?> right = null;

    @Getter
    @Setter
    public BoxLength<?> bottom = null;

    @Getter
    @Setter
    public BoxLength<?> left = null;

    @Getter
    @Setter
    public String borderColor = null;

    @Getter
    @Setter
    public Number borderWidth = null;

    @Getter
    @Setter
    public String borderType = null;

    @Getter
    @Setter
    public Object borderCap = null;

    @Getter
    @Setter
    public Object borderJoin = null;

    @Getter
    @Setter
    public Number borderDashOffset = null;

    @Getter
    @Setter
    public Number borderMiterLimit = null;
}
