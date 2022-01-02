package org.icepear.echarts.charts.gauge;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.gauge.GaugeTitleOption;
import org.icepear.echarts.origin.util.TextCommonOption;

@Accessors(chain = true)
@Data
public class GaugeTitle implements GaugeTitleOption {

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

    public GaugeTitle setFontSize(Number fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public GaugeTitle setFontSize(String fontSize) {
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

    public GaugeTitle setBackgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public GaugeTitle setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    private String borderColor;

    private Number borderWidth;

    private String borderType;

    private Number borderDashOffset;

    @Setter(AccessLevel.NONE)
    private Object borderRadius;

    public GaugeTitle setBorderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public GaugeTitle setBorderRadius(Number[] borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object padding;

    public GaugeTitle setPadding(Number padding) {
        this.padding = padding;
        return this;
    }

    public GaugeTitle setPadding(Number[] padding) {
        this.padding = padding;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object width;

    public GaugeTitle setWidth(Number width) {
        this.width = width;
        return this;
    }

    public GaugeTitle setWidth(String width) {
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

    public GaugeTitle setPrecision(Number precision) {
        this.precision = precision;
        return this;
    }

    public GaugeTitle setPrecision(String precision) {
        this.precision = precision;
        return this;
    }

    private Boolean valueAnimation;

    private Map<String, TextCommonOption> rich;

    @Setter(AccessLevel.NONE)
    private Object offsetCenter;

    public GaugeTitle setOffsetCenter(Number[] offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }

    public GaugeTitle setOffsetCenter(String[] offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object formatter;

    public GaugeTitle setFormatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

    public GaugeTitle setFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }
}
