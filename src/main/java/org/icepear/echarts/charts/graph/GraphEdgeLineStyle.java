package org.icepear.echarts.charts.graph;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.graph.GraphEdgeLineStyleOption;

@Accessors(chain = true)
@Data
public class GraphEdgeLineStyle implements GraphEdgeLineStyleOption {

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
