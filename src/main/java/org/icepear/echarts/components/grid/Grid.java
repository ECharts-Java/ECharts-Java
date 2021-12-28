package org.icepear.echarts.components.grid;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.cartesian.GridOption;

@Accessors(chain = true)
@Data
public class Grid implements GridOption {

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public Grid setId(Number id) {
        this.id = id;
        return this;
    }

    public Grid setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public Grid setName(Number name) {
        this.name = name;
        return this;
    }

    public Grid setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    @Setter(AccessLevel.NONE)
    private Object width;

    public Grid setWidth(Number width) {
        this.width = width;
        return this;
    }

    public Grid setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public Grid setHeight(Number height) {
        this.height = height;
        return this;
    }

    public Grid setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public Grid setTop(Number top) {
        this.top = top;
        return this;
    }

    public Grid setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public Grid setRight(Number right) {
        this.right = right;
        return this;
    }

    public Grid setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public Grid setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public Grid setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public Grid setLeft(Number left) {
        this.left = left;
        return this;
    }

    public Grid setLeft(String left) {
        this.left = left;
        return this;
    }

    private Number shadowBlur;

    private String shadowColor;

    private Number shadowOffsetX;

    private Number shadowOffsetY;

    private Boolean show;

    private Boolean containLabel;

    private String backgroundColor;

    private Number borderWidth;

    private String borderColor;

    private Object tooltip;
}
