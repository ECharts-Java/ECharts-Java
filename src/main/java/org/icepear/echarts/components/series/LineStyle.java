package org.icepear.echarts.components.series;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.util.LineStyleOption;

@Accessors(chain = true)
@Data
public class LineStyle implements LineStyleOption, Serializable {

    private static final long serialVersionUID = 1L;

    private Number shadowBlur;

    private String shadowColor;

    private Number shadowOffsetX;

    private Number shadowOffsetY;

    private Number width;

    private String color;

    private Number opacity;

    private String type;

    private Object cap;

    private Object join;

    private Number dashOffset;

    private Number miterLimit;
}
