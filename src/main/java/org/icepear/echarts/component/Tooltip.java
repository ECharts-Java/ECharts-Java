package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.tooltip.TooltipOption;

import lombok.Data;

@Data
public class Tooltip implements TooltipOption {
    private Object axisPointer = null;

    private Boolean showContent = null;

    private String trigger = null;

    private String displayMode = null;

    private String renderMode = null;

    private Boolean appendToBody = null;

    private String className = null;

    private Object order = null;

    private Boolean show = null;

    private String triggerOn = null;

    private Boolean alwaysShowContent = null;

    private String formatter = null;

    private Object position = null;

    private Boolean confine = null;

    private Object align = null;

    private Object verticalAlign = null;

    private Number showDelay = null;

    private Number hideDelay = null;

    private Number transitionDuration = null;

    private Boolean enterable = null;

    private String backgroundColor = null;

    private String borderColor = null;

    private Number borderRadius = null;

    private Number borderWidth = null;

    private Number shadowBlur = null;

    private String shadowColor = null;

    private Number shadowOffsetX = null;

    private Number shadowOffsetY = null;

    private List<Number> padding = null;

    private String extraCssText = null;

    private Object textStyle = null;

    private String mainType = null;

    private String type = null;

    private String id = null;

    private String name = null;

    private Number z = null;

    private Number zlevel = null;
}
