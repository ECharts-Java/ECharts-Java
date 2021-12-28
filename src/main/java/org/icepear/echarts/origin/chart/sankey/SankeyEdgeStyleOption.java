package org.icepear.echarts.origin.chart.sankey;

import org.icepear.echarts.origin.util.LineStyleOption;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/sankey/SankeySeries.ts#L58
 */
public interface SankeyEdgeStyleOption extends LineStyleOption {

    SankeyEdgeStyleOption setCurveness(Number curveness);
}
