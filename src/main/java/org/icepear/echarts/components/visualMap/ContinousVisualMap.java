package org.icepear.echarts.components.visualMap;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.visualMap.ContinousVisualMapOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LabelOption;

@Accessors(chain = true)
@Data
public class ContinousVisualMap implements ContinousVisualMapOption {

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public ContinousVisualMap setId(Number id) {
        this.id = id;
        return this;
    }

    public ContinousVisualMap setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public ContinousVisualMap setName(Number name) {
        this.name = name;
        return this;
    }

    public ContinousVisualMap setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    @Setter(AccessLevel.NONE)
    private Object width;

    public ContinousVisualMap setWidth(Number width) {
        this.width = width;
        return this;
    }

    public ContinousVisualMap setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public ContinousVisualMap setHeight(Number height) {
        this.height = height;
        return this;
    }

    public ContinousVisualMap setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public ContinousVisualMap setTop(Number top) {
        this.top = top;
        return this;
    }

    public ContinousVisualMap setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public ContinousVisualMap setRight(Number right) {
        this.right = right;
        return this;
    }

    public ContinousVisualMap setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public ContinousVisualMap setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public ContinousVisualMap setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public ContinousVisualMap setLeft(Number left) {
        this.left = left;
        return this;
    }

    public ContinousVisualMap setLeft(String left) {
        this.left = left;
        return this;
    }

    private String borderColor;

    private Number borderWidth;

    private String borderType;

    private Object borderCap;

    private Object borderJoin;

    private Number borderDashOffset;

    private Number borderMiterLimit;

    private Boolean show;

    private String align;

    private Boolean realtime;

    @Setter(AccessLevel.NONE)
    private Object seriesIndex;

    public ContinousVisualMap setSeriesIndex(Number seriesIndex) {
        this.seriesIndex = seriesIndex;
        return this;
    }

    public ContinousVisualMap setSeriesIndex(Number[] seriesIndex) {
        this.seriesIndex = seriesIndex;
        return this;
    }

    public ContinousVisualMap setSeriesIndex(String seriesIndex) {
        this.seriesIndex = seriesIndex;
        return this;
    }

    private Number min;

    private Number max;

    private Number dimension;

    private Object controller;

    private Object target;

    private Number itemWidth;

    private Number itemHeight;

    private Boolean inverse;

    private String orient;

    private String backgroundColor;

    private String contentColor;

    private String inactiveColor;

    @Setter(AccessLevel.NONE)
    private Object padding;

    public ContinousVisualMap setPadding(Number padding) {
        this.padding = padding;
        return this;
    }

    public ContinousVisualMap setPadding(Number[] padding) {
        this.padding = padding;
        return this;
    }

    private Number textGap;

    private Number precision;

    private String[] color;

    @Setter(AccessLevel.NONE)
    private Object formatter;

    public ContinousVisualMap setFormatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

    public ContinousVisualMap setFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    private String[] text;

    private LabelOption textStyle;

    private Object categories;

    private Boolean calculable;

    private Number[] range;

    private Boolean hoverLink;

    private Number hoverLinkDataSize;

    private Boolean hoverLinkOnHandle;

    private String handleIcon;

    @Setter(AccessLevel.NONE)
    private Object handleSize;

    public ContinousVisualMap setHandleSize(Number handleSize) {
        this.handleSize = handleSize;
        return this;
    }

    public ContinousVisualMap setHandleSize(String handleSize) {
        this.handleSize = handleSize;
        return this;
    }

    private ItemStyleOption handleStyle;

    private String indicatorIcon;

    @Setter(AccessLevel.NONE)
    private Object indicatorSize;

    public ContinousVisualMap setIndicatorSize(Number indicatorSize) {
        this.indicatorSize = indicatorSize;
        return this;
    }

    public ContinousVisualMap setIndicatorSize(String indicatorSize) {
        this.indicatorSize = indicatorSize;
        return this;
    }

    private ItemStyleOption indicatorStyle;

    private Object emphasis;
}
