package org.icepear.echarts.component;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.origin.component.toolbox.ToolboxOption;
import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.type.BoxLength;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class Toolbox implements ToolboxOption {
    private Boolean show;

    private Object orient;

    private String backgroundColor;

    private List<Number> borderRadius;

    private List<Number> padding;

    private Number itemSize;

    private Number itemGap;

    private Boolean showTitle;

    private Object iconStyle;

    private Object emphasis;

    private Object textStyle;

    private TooltipOption tooltip;

    private Map<String, ToolboxFeatureOption> feature;

    private String mainType;

    private String type;

    private String id;

    private String name;

    private Number z;

    private Number zlevel;

    private BoxLength<?> width;

    private BoxLength<?> height;

    private BoxLength<?> top;

    private BoxLength<?> right;

    private BoxLength<?> bottom;

    private BoxLength<?> left;

    private String borderColor;

    private Number borderWidth;

    private String borderType;

    private Object borderCap;

    private Object borderJoin;

    private Number borderDashOffset;

    private Number borderMiterLimit;
}
