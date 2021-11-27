package org.icepear.echarts.component;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.component.legend.LegendOption;
import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.type.BoxLength;

import lombok.Data;

@Data
public class Legend implements LegendOption {
    private Boolean show = null;

    private Object orient = null;

    private String align = null;

    private String backgroundColor = null;

    private List<Number> borderRadius = null;

    private List<Number> padding = null;

    private Number itemGap = null;

    private Number itemWidth = null;

    private Number itemHeight = null;

    private String selectedMode = null;

    private Map<String, Boolean> selected = null;

    private Object selector = null;

    private Object selectorLabel = null;

    private Object emphasis = null;

    private String selectorPosition = null;

    private Number selectorItemGap = null;

    private Number selectorButtonGap = null;

    private List<Object> data = null;

    private TooltipOption tooltip = null;

    private String mainType = null;

    private String type = null;

    private String id = null;

    private String name = null;

    private Number z = null;

    private Number zlevel = null;

    private String icon = null;

    private String inactiveColor = null;

    private String inactiveBorderColor = null;

    private Number inactiveBorderWidth = null;

    private String formatter = null;

    private Object itemStyle = null;

    private Object lineStyle = null;

    private Object textStyle = null;

    private String symbolRotate = null;

    @Deprecated
    private Boolean symbolKeepAspect = null;

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
