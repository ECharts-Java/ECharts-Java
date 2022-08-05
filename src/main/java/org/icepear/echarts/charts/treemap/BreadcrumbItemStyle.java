package org.icepear.echarts.charts.treemap;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.treemap.BreadcrumbItemStyleOption;
import org.icepear.echarts.origin.util.DecalObject;
import org.icepear.echarts.origin.util.LabelOption;

@Accessors(chain = true)
@Data
public class BreadcrumbItemStyle implements BreadcrumbItemStyleOption {

    private Number shadowBlur;

    private String shadowColor;

    private Number shadowOffsetX;

    private Number shadowOffsetY;

    private String borderColor;

    private Number borderWidth;

    private String borderType;

    private Object borderCap;

    private Object borderJoin;

    private Number borderDashOffset;

    private Number borderMiterLimit;

    private String color;

    private Number opacity;

    @Setter(AccessLevel.NONE)
    private Object decal;

    public BreadcrumbItemStyle setDecal(DecalObject decal) {
        this.decal = decal;
        return this;
    }

    public BreadcrumbItemStyle setDecal(String decal) {
        this.decal = decal;
        return this;
    }

    private LabelOption textStyle;
}
