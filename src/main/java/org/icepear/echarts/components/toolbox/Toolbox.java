package org.icepear.echarts.components.toolbox;

import java.util.Map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.toolbox.ToolboxFeatureOption;
import org.icepear.echarts.origin.component.toolbox.ToolboxOption;
import org.icepear.echarts.origin.util.CommonTooltipOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.LabelOption;

@Accessors(chain = true)
@Data
public class Toolbox implements ToolboxOption {

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public Toolbox setId(Number id) {
        this.id = id;
        return this;
    }

    public Toolbox setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public Toolbox setName(Number name) {
        this.name = name;
        return this;
    }

    public Toolbox setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    @Setter(AccessLevel.NONE)
    private Object width;

    public Toolbox setWidth(Number width) {
        this.width = width;
        return this;
    }

    public Toolbox setWidth(String width) {
        this.width = width;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object height;

    public Toolbox setHeight(Number height) {
        this.height = height;
        return this;
    }

    public Toolbox setHeight(String height) {
        this.height = height;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object top;

    public Toolbox setTop(Number top) {
        this.top = top;
        return this;
    }

    public Toolbox setTop(String top) {
        this.top = top;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object right;

    public Toolbox setRight(Number right) {
        this.right = right;
        return this;
    }

    public Toolbox setRight(String right) {
        this.right = right;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object bottom;

    public Toolbox setBottom(Number bottom) {
        this.bottom = bottom;
        return this;
    }

    public Toolbox setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object left;

    public Toolbox setLeft(Number left) {
        this.left = left;
        return this;
    }

    public Toolbox setLeft(String left) {
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

    private String backgroundColor;

    @Setter(AccessLevel.NONE)
    private Object borderRadius;

    public Toolbox setBorderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Toolbox setBorderRadius(Number[] borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object padding;

    public Toolbox setPadding(Number padding) {
        this.padding = padding;
        return this;
    }

    public Toolbox setPadding(Number[] padding) {
        this.padding = padding;
        return this;
    }

    private Number itemSize;

    private Number itemGap;

    private Boolean showTitle;

    private ItemStyleOption iconStyle;

    private Object emphasis;

    private LabelOption textStyle;

    private CommonTooltipOption tooltip;

    private Map<String, ToolboxFeatureOption> feature;
}
