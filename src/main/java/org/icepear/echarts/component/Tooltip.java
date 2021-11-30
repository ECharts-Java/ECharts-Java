package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.axisPointer.AxisPointerOption;
import org.icepear.echarts.origin.component.tooltip.TooltipOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class Tooltip implements TooltipOption {
    private AxisPointerOption axisPointer;

    private Boolean showContent;

    private String trigger;

    private String displayMode;

    private String renderMode;

    private Boolean appendToBody;

    private String className;

    private Object order;

    private Boolean show;

    private String triggerOn;

    private Boolean alwaysShowContent;

    private String formatter;

    private Object position;

    private Boolean confine;

    private Object align;

    private Object verticalAlign;

    private Number showDelay;

    private Number hideDelay;

    private Number transitionDuration;

    private Boolean enterable;

    private String backgroundColor;

    private String borderColor;

    private Number borderRadius;

    private Number borderWidth;

    private Number shadowBlur;

    private String shadowColor;

    private Number shadowOffsetX;

    private Number shadowOffsetY;

    private List<Number> padding;

    private String extraCssText;

    private Object textStyle;

    private String mainType;

    private String type;

    private String id;

    private String name;

    private Number z;

    private Number zlevel;
}
