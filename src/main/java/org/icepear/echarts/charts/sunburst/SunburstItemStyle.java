package org.icepear.echarts.charts.sunburst;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sunburst.SunburstItemStyleOption;
import org.icepear.echarts.origin.util.DecalObject;

@Accessors(chain = true)
@Data
public class SunburstItemStyle implements SunburstItemStyleOption {

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

    public SunburstItemStyle setDecal(DecalObject decal) {
        this.decal = decal;
        return this;
    }

    public SunburstItemStyle setDecal(String decal) {
        this.decal = decal;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object borderRadius;

    public SunburstItemStyle setBorderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public SunburstItemStyle setBorderRadius(Number[] borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public SunburstItemStyle setBorderRadius(String borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public SunburstItemStyle setBorderRadius(String[] borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }
}
