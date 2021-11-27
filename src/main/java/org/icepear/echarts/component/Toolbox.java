package org.icepear.echarts.component;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.origin.component.toolbox.ToolboxOption;
import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.type.BoxLength;

import lombok.Data;

@Data
public class Toolbox implements ToolboxOption {
    private Boolean show = null;

    private Object orient = null;

    private String backgroundColor = null;

    private List<Number> borderRadius = null;

    private List<Number> padding = null;

    private Number itemSize = null;

    private Number itemGap = null;

    private Boolean showTitle = null;

    private Object iconStyle = null;

    private Object emphasis = null;

    private Object textStyle = null;

    private TooltipOption tooltip = null;

    private Map<String, ToolboxFeatureOption> feature = null;

    private String mainType = null;

    private String type = null;

    private String id = null;

    private String name = null;

    private Number z = null;

    private Number zlevel = null;

    private BoxLength<?> width = null;

    private BoxLength<?> height = null;

    private BoxLength<?> top = null;

    private BoxLength<?> right = null;

    private BoxLength<?> bottom = null;

    private BoxLength<?> left = null;

    private String borderColor = null;

    private Number borderWidth = null;

    private String borderType = null;

    private Object borderCap = null;

    private Object borderJoin = null;

    private Number borderDashOffset = null;

    private Number borderMiterLimit = null;
}
