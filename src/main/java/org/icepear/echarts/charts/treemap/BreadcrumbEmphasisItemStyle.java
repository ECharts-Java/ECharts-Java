package org.icepear.echarts.charts.treemap;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.treemap.BreadcrumbEmphasisItemStyleOption;
import org.icepear.echarts.origin.chart.treemap.BreadcrumbItemStyleOption;

@Accessors(chain = true)
@Data
public class BreadcrumbEmphasisItemStyle implements BreadcrumbEmphasisItemStyleOption {

    private BreadcrumbItemStyleOption itemStyle;
}
