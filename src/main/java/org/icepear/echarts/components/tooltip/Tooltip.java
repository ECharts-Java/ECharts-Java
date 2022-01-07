package org.icepear.echarts.components.tooltip;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.tooltip.TooltipAxisPointerOption;
import org.icepear.echarts.origin.component.tooltip.TooltipOption;

@Accessors(chain = true)
@Data
public class Tooltip implements TooltipOption {

    private Boolean show;

    private String triggerOn;

    private Boolean alwaysShowContent;

    @Setter(AccessLevel.NONE)
    private Object formatter;

    public Tooltip setFormatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

    public Tooltip setFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object position;

    public Tooltip setPosition(Number[] position) {
        this.position = position;
        return this;
    }

    public Tooltip setPosition(Object position) {
        this.position = position;
        return this;
    }

    public Tooltip setPosition(String[] position) {
        this.position = position;
        return this;
    }

    private Boolean confine;

    private String align;

    private String verticalAlign;

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

    @Setter(AccessLevel.NONE)
    private Object padding;

    public Tooltip setPadding(Number padding) {
        this.padding = padding;
        return this;
    }

    public Tooltip setPadding(Number[] padding) {
        this.padding = padding;
        return this;
    }

    private String extraCssText;

    private Object textStyle;

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public Tooltip setId(Number id) {
        this.id = id;
        return this;
    }

    public Tooltip setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public Tooltip setName(Number name) {
        this.name = name;
        return this;
    }

    public Tooltip setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private TooltipAxisPointerOption axisPointer;

    private Boolean showContent;

    private String trigger;

    private String displayMode;

    private String renderMode;

    private Boolean appendToBody;

    private String className;

    private String order;
}
