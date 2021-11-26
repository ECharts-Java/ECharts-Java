package org.icepear.echarts.origin.util;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * https://github.com/apache/echarts/blob/790687df55a5dbe286e52cf182c0983938efd367/src/util/types.ts#L1295
 */
public interface CommonTooltipOption {
    @Getter
    @Setter
    public Boolean show = null;

    @Getter
    @Setter
    public String triggerOn = null;

    @Getter
    @Setter
    public Boolean alwaysShowContent = null;

    @Getter
    @Setter
    public String formatter = null;

    @Getter
    @Setter
    public Object position = null;

    @Getter
    @Setter
    public Boolean confine = null;

    @Getter
    @Setter
    public Object align = null;

    @Getter
    @Setter
    public Object verticalAlign = null;

    @Getter
    @Setter
    public Number showDelay = null;

    @Getter
    @Setter
    public Number hideDelay = null;

    @Getter
    @Setter
    public Number transitionDuration = null;

    @Getter
    @Setter
    public Boolean enterable = null;

    @Getter
    @Setter
    public String backgroundColor = null;

    @Getter
    @Setter
    public String borderColor = null;

    @Getter
    @Setter
    public Number borderRadius = null;

    @Getter
    @Setter
    public Number borderWidth = null;

    @Getter
    @Setter
    public Number shadowBlur = null;

    @Getter
    @Setter
    public String shadowColor = null;

    @Getter
    @Setter
    public Number shadowOffsetX = null;

    @Getter
    @Setter
    public Number shadowOffsetY = null;

    @Getter
    @Setter
    public List<Number> padding = null;

    @Getter
    @Setter
    public String extraCssText = null;

    @Getter
    @Setter
    public Object textStyle = null;
}
