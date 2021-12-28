package org.icepear.echarts.charts.pie;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.pie.PieLabelOption;
import org.icepear.echarts.origin.util.TextCommonOption;

@Accessors(chain = true)
@Data
public class PieLabel implements PieLabelOption {

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

    public PieLabel setFontSize(Number fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public PieLabel setFontSize(String fontSize) {
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

    public PieLabel setBackgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public PieLabel setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    private String borderColor;

    private Number borderWidth;

    private String borderType;

    private Number borderDashOffset;

    @Setter(AccessLevel.NONE)
    private Object borderRadius;

    public PieLabel setBorderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public PieLabel setBorderRadius(Number[] borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object padding;

    public PieLabel setPadding(Number padding) {
        this.padding = padding;
        return this;
    }

    public PieLabel setPadding(Number[] padding) {
        this.padding = padding;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object width;

    public PieLabel setWidth(Number width) {
        this.width = width;
        return this;
    }

    public PieLabel setWidth(String width) {
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

    @Setter(AccessLevel.NONE)
    private Object position;

    public PieLabel setPosition(Object position) {
        this.position = position;
        return this;
    }

    public PieLabel setPosition(String position) {
        this.position = position;
        return this;
    }

    private Number distance;

    @Setter(AccessLevel.NONE)
    private Object rotate;

    public PieLabel setRotate(Boolean rotate) {
        this.rotate = rotate;
        return this;
    }

    public PieLabel setRotate(Number rotate) {
        this.rotate = rotate;
        return this;
    }

    public PieLabel setRotate(String rotate) {
        this.rotate = rotate;
        return this;
    }

    private Number[] offset;

    private Number minMargin;

    private Object overflow;

    private Boolean silent;

    @Setter(AccessLevel.NONE)
    private Object precision;

    public PieLabel setPrecision(Number precision) {
        this.precision = precision;
        return this;
    }

    public PieLabel setPrecision(String precision) {
        this.precision = precision;
        return this;
    }

    private Boolean valueAnimation;

    private Map<String, TextCommonOption> rich;

    private String formatter;

    private String alignTo;

    @Setter(AccessLevel.NONE)
    private Object edgeDistance;

    public PieLabel setEdgeDistance(Number edgeDistance) {
        this.edgeDistance = edgeDistance;
        return this;
    }

    public PieLabel setEdgeDistance(String edgeDistance) {
        this.edgeDistance = edgeDistance;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object margin;

    public PieLabel setMargin(Number margin) {
        this.margin = margin;
        return this;
    }

    public PieLabel setMargin(String margin) {
        this.margin = margin;
        return this;
    }

    private Number bleedMargin;

    private Number distanceToLabelLine;
}
