package org.icepear.echarts.component;

import java.util.List;
import java.util.Map;

import org.icepear.echarts.origin.component.legend.LegendOption;
import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.type.BoxLength;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class Legend implements LegendOption {
    private Boolean show;

    private Object orient;

    private String align;

    private String backgroundColor;

    private List<Number> borderRadius;

    private List<Number> padding;

    private Number itemGap;

    private Number itemWidth;

    private Number itemHeight;

    private String selectedMode;

    private Map<String, Boolean> selected;

    private Object selector;

    private Object selectorLabel;

    private Object emphasis;

    private String selectorPosition;

    private Number selectorItemGap;

    private Number selectorButtonGap;

    private List<Object> data;

    private TooltipOption tooltip;

    private String mainType;

    private String type;

    private String id;

    private String name;

    private Number z;

    private Number zlevel;

    private String icon;

    private String inactiveColor;

    private String inactiveBorderColor;

    private Number inactiveBorderWidth;

    private String formatter;

    private Object itemStyle;

    private Object lineStyle;

    private Object textStyle;

    private String symbolRotate;

    @Deprecated
    private Boolean symbolKeepAspect;

    private BoxLength width;

    private BoxLength height;

    private BoxLength top;

    private BoxLength right;

    private BoxLength bottom;

    private BoxLength left;

    private String borderColor;

    private Number borderWidth;

    private String borderType;

    private Object borderCap;

    private Object borderJoin;

    private Number borderDashOffset;

    private Number borderMiterLimit;
}
