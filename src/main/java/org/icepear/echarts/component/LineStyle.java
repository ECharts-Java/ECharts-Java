package org.icepear.echarts.component;

import org.icepear.echarts.origin.util.LineStyleOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class LineStyle implements LineStyleOption {
    private Number width;

    private String color;

    private Number opacity;

    private String type;

    private Object cap;

    private Object join;

    private Number dashOffset;

    private Number miterLimit;

    private Number shadowBlur;

    private String shadowColor;

    private Number shadowOffsetX;

    private Number shadowOffsetY;
}
