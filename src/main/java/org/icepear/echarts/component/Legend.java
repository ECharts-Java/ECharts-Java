package org.icepear.echarts.component;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.component.legend.LegendOption;
import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.type.BoxLength;

import lombok.Getter;
import lombok.Setter;

public class Legend implements LegendOption {
    @Getter
    @Setter
    public Boolean show = null;

    @Getter
    @Setter
    public Object orient = null;

    @Getter
    @Setter
    public String align = null;

    @Getter
    @Setter
    public String backgroundColor = null;

    @Getter
    @Setter
    public List<Number> borderRadius = null;

    @Getter
    @Setter
    public List<Number> padding = null;

    @Getter
    @Setter
    public Number itemGap = null;

    @Getter
    @Setter
    public Number itemWidth = null;

    @Getter
    @Setter
    public Number itemHeight = null;

    @Getter
    @Setter
    public String selectedMode = null;

    @Getter
    @Setter
    public Map<String, Boolean> selected = null;

    @Getter
    @Setter
    public Object selector = null;

    @Getter
    @Setter
    public Object selectorLabel = null;

    @Getter
    @Setter
    public Object emphasis = null;

    @Getter
    @Setter
    public String selectorPosition = null;

    @Getter
    @Setter
    public Number selectorItemGap = null;

    @Getter
    @Setter
    public Number selectorButtonGap = null;

    @Getter
    @Setter
    public List<Object> data = null;

    @Getter
    @Setter
    public TooltipOption tooltip = null;

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
    public String icon = null;

    @Getter
    @Setter
    public String inactiveColor = null;

    @Getter
    @Setter
    public String inactiveBorderColor = null;

    @Getter
    @Setter
    public Number inactiveBorderWidth = null;

    @Getter
    @Setter
    public String formatter = null;

    @Getter
    @Setter
    public Object itemStyle = null;

    @Getter
    @Setter
    public Object lineStyle = null;

    @Getter
    @Setter
    public Object textStyle = null;

    @Getter
    @Setter
    public String symbolRotate = null;

    @Deprecated
    @Getter
    @Setter
    public Boolean symbolKeepAspect = null;

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
