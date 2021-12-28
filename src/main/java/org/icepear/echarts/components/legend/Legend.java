package org.icepear.echarts.components.legend;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.legend.LegendOption;
import org.icepear.echarts.origin.util.LabelOption;

@Accessors(chain = true)
@Data
public class Legend implements LegendOption {

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public Legend setId(Number id) {
        this.id = id;
        return this;
    }

    public Legend setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public Legend setName(Number name) {
        this.name = name;
        return this;
    }

    public Legend setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    private String icon;

    private String inactiveColor;

    private String inactiveBorderColor;

    @Setter(AccessLevel.NONE)
    private Object inactiveBorderWidth;

    public Legend setInactiveBorderWidth(Number inactiveBorderWidth) {
        this.inactiveBorderWidth = inactiveBorderWidth;
        return this;
    }

    public Legend setInactiveBorderWidth(String inactiveBorderWidth) {
        this.inactiveBorderWidth = inactiveBorderWidth;
        return this;
    }

    private String formatter;

    private Object itemStyle;

    private Object lineStyle;

    private LabelOption textStyle;

    @Setter(AccessLevel.NONE)
    private Object symbolRotate;

    public Legend setSymbolRotate(Number symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    public Legend setSymbolRotate(String symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    private Boolean symbolKeepAspect;

    @Setter(AccessLevel.NONE)
    private Object width;

    public Legend setWidth(Number width) {
        this.width = width;
        return this;
    }

    public Legend setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public Legend setHeight(Number height) {
        this.height = height;
        return this;
    }

    public Legend setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public Legend setTop(Number top) {
        this.top = top;
        return this;
    }

    public Legend setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public Legend setRight(Number right) {
        this.right = right;
        return this;
    }

    public Legend setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public Legend setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public Legend setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public Legend setLeft(Number left) {
        this.left = left;
        return this;
    }

    public Legend setLeft(String left) {
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

    private String orient;

    private String align;

    private String backgroundColor;

    @Setter(AccessLevel.NONE)
    private Object borderRadius;

    public Legend setBorderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Legend setBorderRadius(Number[] borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object padding;

    public Legend setPadding(Number padding) {
        this.padding = padding;
        return this;
    }

    public Legend setPadding(Number[] padding) {
        this.padding = padding;
        return this;
    }

    private Number itemGap;

    private Number itemWidth;

    private Number itemHeight;

    @Setter(AccessLevel.NONE)
    private Object selectedMode;

    public Legend setSelectedMode(Boolean selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public Legend setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    private Map<String, Boolean> selected;

    @Setter(AccessLevel.NONE)
    private Object selector;

    public Legend setSelector(Boolean selector) {
        this.selector = selector;
        return this;
    }

    public Legend setSelector(Object[] selector) {
        this.selector = selector;
        return this;
    }

    private LabelOption selectorLabel;

    private Object emphasis;

    private String selectorPosition;

    private Number selectorItemGap;

    private Number selectorButtonGap;

    @Setter(AccessLevel.NONE)
    private Object data;

    public Legend setData(Object[] data) {
        this.data = data;
        return this;
    }

    public Legend setData(String[] data) {
        this.data = data;
        return this;
    }

    private Object tooltip;
}
