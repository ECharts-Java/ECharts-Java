package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.chart.bar.BackgroundStyleOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class BackgroundStyle implements BackgroundStyleOption {
    private List<Number> borderRadius;

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
