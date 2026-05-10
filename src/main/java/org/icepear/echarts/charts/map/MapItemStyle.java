package org.icepear.echarts.charts.map;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.map.MapItemStyleOption;
import org.icepear.echarts.origin.util.DecalObject;

@Accessors(chain = true)
@Data
public class MapItemStyle implements MapItemStyleOption, Serializable {

    private static final long serialVersionUID = 1L;

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

    private String areaColor;

    private Number opacity;

    @Setter(AccessLevel.NONE)
    private Object decal;

    public MapItemStyle setDecal(DecalObject decal) {
        this.decal = decal;
        return this;
    }

    public MapItemStyle setDecal(String decal) {
        this.decal = decal;
        return this;
    }
}
