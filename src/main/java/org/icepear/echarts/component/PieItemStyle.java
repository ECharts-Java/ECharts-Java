package org.icepear.echarts.component;

import org.icepear.echarts.origin.chart.pie.PieItemStyleOption;
import org.icepear.echarts.type.EChartsRadius;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain = true)
@Data
public class PieItemStyle implements PieItemStyleOption {
    private EChartsRadius borderRadius;

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
