package org.icepear.echarts.components.axisPointer;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.util.AxisPointerLabelOption;
import org.icepear.echarts.origin.util.TextCommonOption;

@Accessors(chain = true)
@Data
public class AxisPointerLabel implements AxisPointerLabelOption {

    private Number shadowBlur;

    private String shadowColor;

    private Number shadowOffsetX;

    private Number shadowOffsetY;

    private String color;

    private String fontStyle;

    private String fontWeight;

    private String fontFamily;

    @Setter(AccessLevel.NONE)
    private Object fontSize;

    public AxisPointerLabel setFontSize(Number fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public AxisPointerLabel setFontSize(String fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    private String align;

    private String verticalAlign;

    private String baseline;

    private Number opacity;

    private Number lineHeight;

    @Setter(AccessLevel.NONE)
    private Object backgroundColor;

    public AxisPointerLabel setBackgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public AxisPointerLabel setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    private String borderColor;

    private Number borderWidth;

    private String borderType;

    private Number borderDashOffset;

    @Setter(AccessLevel.NONE)
    private Object borderRadius;

    public AxisPointerLabel setBorderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public AxisPointerLabel setBorderRadius(Number[] borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object padding;

    public AxisPointerLabel setPadding(Number padding) {
        this.padding = padding;
        return this;
    }

    public AxisPointerLabel setPadding(Number[] padding) {
        this.padding = padding;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object width;

    public AxisPointerLabel setWidth(Number width) {
        this.width = width;
        return this;
    }

    public AxisPointerLabel setWidth(String width) {
        this.width = width;
        return this;
    }

    private Number height;

    private String textBorderColor;

    private Number textBorderWidth;

    private String textBorderType;

    private Number textBorderDashOffset;

    private Number textShadowBlur;

    private String textShadowColor;

    private Number textShadowOffsetX;

    private Number textShadowOffsetY;

    private String tag;

    private Boolean show;

    private String position;

    private Number distance;

    private Number rotate;

    private Number[] offset;

    private Number minMargin;

    private Object overflow;

    private Boolean silent;

    @Setter(AccessLevel.NONE)
    private Object precision;

    public AxisPointerLabel setPrecision(Number precision) {
        this.precision = precision;
        return this;
    }

    public AxisPointerLabel setPrecision(String precision) {
        this.precision = precision;
        return this;
    }

    private Boolean valueAnimation;

    private Map<String, TextCommonOption> rich;

    private Number margin;

    private String formatter;
}
