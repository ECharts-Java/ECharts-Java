package org.icepear.echarts.charts.graph;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.graph.GraphCircularOption;

@Accessors(chain = true)
@Data
public class GraphCircular implements GraphCircularOption, Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean rotateLabel;
}
