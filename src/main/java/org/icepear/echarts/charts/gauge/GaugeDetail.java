package org.icepear.echarts.charts.gauge;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.gauge.GaugeDetailOption;
import org.icepear.echarts.origin.util.TextCommonOption;

@Accessors(chain = true)
@Data
public class GaugeDetail implements GaugeDetailOption {

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

    public GaugeDetail setFontSize(Number fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public GaugeDetail setFontSize(String fontSize) {
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

    public GaugeDetail setBackgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public GaugeDetail setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    private String borderColor;

    private Number borderWidth;

    private String borderType;

    private Number borderDashOffset;

    @Setter(AccessLevel.NONE)
    private Object borderRadius;

    public GaugeDetail setBorderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public GaugeDetail setBorderRadius(Number[] borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object padding;

    public GaugeDetail setPadding(Number padding) {
        this.padding = padding;
        return this;
    }

    public GaugeDetail setPadding(Number[] padding) {
        this.padding = padding;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object width;

    public GaugeDetail setWidth(Number width) {
        this.width = width;
        return this;
    }

    public GaugeDetail setWidth(String width) {
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

    public GaugeDetail setPrecision(Number precision) {
        this.precision = precision;
        return this;
    }

    public GaugeDetail setPrecision(String precision) {
        this.precision = precision;
        return this;
    }

    private Boolean valueAnimation;

    private Map<String, TextCommonOption> rich;

    @Setter(AccessLevel.NONE)
    private Object offsetCenter;

    public GaugeDetail setOffsetCenter(Number[] offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }

    public GaugeDetail setOffsetCenter(String[] offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object formatter;

    public GaugeDetail setFormatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

    public GaugeDetail setFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }
}
