package org.icepear.echarts.charts.bar;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.bar.BarBackgroundStyleOption;
import org.icepear.echarts.origin.util.DecalObject;

@Accessors(chain = true)
@Data
public class BarBackgroundStyle implements BarBackgroundStyleOption {

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

    public BarBackgroundStyle setDecal(DecalObject decal) {
        this.decal = decal;
        return this;
    }

    public BarBackgroundStyle setDecal(String decal) {
        this.decal = decal;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object borderRadius;

    public BarBackgroundStyle setBorderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public BarBackgroundStyle setBorderRadius(Number[] borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }
}
