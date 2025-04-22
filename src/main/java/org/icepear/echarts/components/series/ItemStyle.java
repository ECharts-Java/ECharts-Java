package org.icepear.echarts.components.series;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.util.DecalObject;
import org.icepear.echarts.origin.util.ItemStyleOption;

@Accessors(chain = true)
@Data
public class ItemStyle implements ItemStyleOption, Serializable {

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

    private Number opacity;

    @Setter(AccessLevel.NONE)
    private Object decal;

    public ItemStyle setDecal(DecalObject decal) {
        this.decal = decal;
        return this;
    }

    public ItemStyle setDecal(String decal) {
        this.decal = decal;
        return this;
    }
}
