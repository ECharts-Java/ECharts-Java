package org.icepear.echarts.components.visualMap;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.visualMap.PiecewiseVisualMapOption;
import org.icepear.echarts.origin.component.visualMap.VisualPieceOption;
import org.icepear.echarts.origin.util.LabelOption;

@Accessors(chain = true)
@Data
public class PiecewiseVisualMap implements PiecewiseVisualMapOption {

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public PiecewiseVisualMap setId(Number id) {
        this.id = id;
        return this;
    }

    public PiecewiseVisualMap setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public PiecewiseVisualMap setName(Number name) {
        this.name = name;
        return this;
    }

    public PiecewiseVisualMap setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    @Setter(AccessLevel.NONE)
    private Object width;

    public PiecewiseVisualMap setWidth(Number width) {
        this.width = width;
        return this;
    }

    public PiecewiseVisualMap setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public PiecewiseVisualMap setHeight(Number height) {
        this.height = height;
        return this;
    }

    public PiecewiseVisualMap setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public PiecewiseVisualMap setTop(Number top) {
        this.top = top;
        return this;
    }

    public PiecewiseVisualMap setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public PiecewiseVisualMap setRight(Number right) {
        this.right = right;
        return this;
    }

    public PiecewiseVisualMap setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public PiecewiseVisualMap setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public PiecewiseVisualMap setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public PiecewiseVisualMap setLeft(Number left) {
        this.left = left;
        return this;
    }

    public PiecewiseVisualMap setLeft(String left) {
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

    public PiecewiseVisualMap setSeriesIndex(Number seriesIndex) {
        this.seriesIndex = seriesIndex;
        return this;
    }

    public PiecewiseVisualMap setSeriesIndex(Number[] seriesIndex) {
        this.seriesIndex = seriesIndex;
        return this;
    }

    public PiecewiseVisualMap setSeriesIndex(String seriesIndex) {
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

    public PiecewiseVisualMap setPadding(Number padding) {
        this.padding = padding;
        return this;
    }

    public PiecewiseVisualMap setPadding(Number[] padding) {
        this.padding = padding;
        return this;
    }

    private Number textGap;

    private Number precision;

    private String[] color;

    @Setter(AccessLevel.NONE)
    private Object formatter;

    public PiecewiseVisualMap setFormatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

    public PiecewiseVisualMap setFormatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    private String[] text;

    private LabelOption textStyle;

    @Setter(AccessLevel.NONE)
    private Object categories;

    public PiecewiseVisualMap setCategories(Object categories) {
        this.categories = categories;
        return this;
    }

    public PiecewiseVisualMap setCategories(String[] categories) {
        this.categories = categories;
        return this;
    }

    private Boolean minOpen;

    private Boolean maxOpen;

    private String itemSymbol;

    private VisualPieceOption[] pieces;

    private Number splitNumber;

    private Map<String, Boolean> selected;

    private String selectedMode;

    private Boolean showLabel;

    private Number itemGap;

    private Boolean hoverLink;
}
