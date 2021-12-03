package org.icepear.echarts.component;

import org.icepear.echarts.origin.util.ItemStyleOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class ItemStyle implements ItemStyleOption {
    private String color;

    private Number opacity;
    
    private Object decal;

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
}
