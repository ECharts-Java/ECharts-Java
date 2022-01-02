package org.icepear.echarts.charts.graph;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.graph.GraphCircularOption;

@Accessors(chain = true)
@Data
public class GraphCircular implements GraphCircularOption {

    private Boolean rotateLabel;
}
