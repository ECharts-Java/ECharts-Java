package org.icepear.echarts.charts.sankey;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.sankey.SankeyEdgeStyleOption;

@Accessors(chain = true)
@Data
public class SankeyEdgeStyle implements SankeyEdgeStyleOption, Serializable {

    @Serial
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

    private Number curveness;
}
