package org.icepear.echarts.components.title;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.title.TitleOption;
import org.icepear.echarts.origin.util.LabelOption;

@Accessors(chain = true)
@Data
public class Title implements TitleOption {

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public Title setId(Number id) {
        this.id = id;
        return this;
    }

    public Title setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public Title setName(Number name) {
        this.name = name;
        return this;
    }

    public Title setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    @Setter(AccessLevel.NONE)
    private Object width;

    public Title setWidth(Number width) {
        this.width = width;
        return this;
    }

    public Title setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public Title setHeight(Number height) {
        this.height = height;
        return this;
    }

    public Title setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public Title setTop(Number top) {
        this.top = top;
        return this;
    }

    public Title setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public Title setRight(Number right) {
        this.right = right;
        return this;
    }

    public Title setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public Title setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public Title setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public Title setLeft(Number left) {
        this.left = left;
        return this;
    }

    public Title setLeft(String left) {
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

    private String text;

    private String link;

    private String target;

    private String subtext;

    private String sublink;

    private String subtarget;

    private String textAlign;

    private String textVerticalAlign;

    private String textBaseline;

    private String backgroundColor;

    @Setter(AccessLevel.NONE)
    private Object padding;

    public Title setPadding(Number padding) {
        this.padding = padding;
        return this;
    }

    public Title setPadding(Number[] padding) {
        this.padding = padding;
        return this;
    }

    private Number itemGap;

    private LabelOption textStyle;

    private LabelOption subtextStyle;

    private Boolean triggerEvent;

    @Setter(AccessLevel.NONE)
    private Object borderRadius;

    public Title setBorderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Title setBorderRadius(Number[] borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }
}
