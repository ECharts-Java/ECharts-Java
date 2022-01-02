package org.icepear.echarts.components.series;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.util.SeriesLineLabelOption;
import org.icepear.echarts.origin.util.TextCommonOption;

@Accessors(chain = true)
@Data
public class SeriesLineLabel implements SeriesLineLabelOption {

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

    public SeriesLineLabel setFontSize(Number fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public SeriesLineLabel setFontSize(String fontSize) {
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

    public SeriesLineLabel setBackgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public SeriesLineLabel setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    private String borderColor;

    private Number borderWidth;

    private String borderType;

    private Number borderDashOffset;

    @Setter(AccessLevel.NONE)
    private Object borderRadius;

    public SeriesLineLabel setBorderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public SeriesLineLabel setBorderRadius(Number[] borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object padding;

    public SeriesLineLabel setPadding(Number padding) {
        this.padding = padding;
        return this;
    }

    public SeriesLineLabel setPadding(Number[] padding) {
        this.padding = padding;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object width;

    public SeriesLineLabel setWidth(Number width) {
        this.width = width;
        return this;
    }

    public SeriesLineLabel setWidth(String width) {
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

    @Setter(AccessLevel.NONE)
    private Object distance;

    public SeriesLineLabel setDistance(Number distance) {
        this.distance = distance;
        return this;
    }

    public SeriesLineLabel setDistance(Number[] distance) {
        this.distance = distance;
        return this;
    }

    private Number rotate;

    private Number[] offset;

    private Number minMargin;

    private Object overflow;

    private Boolean silent;

    @Setter(AccessLevel.NONE)
    private Object precision;

    public SeriesLineLabel setPrecision(Number precision) {
        this.precision = precision;
        return this;
    }

    public SeriesLineLabel setPrecision(String precision) {
        this.precision = precision;
        return this;
    }

    private Boolean valueAnimation;

    private Map<String, TextCommonOption> rich;

    private String formatter;
}
