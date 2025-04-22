package org.icepear.echarts.charts.treemap;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.treemap.BreadcrumbEmphasisItemStyleOption;
import org.icepear.echarts.origin.chart.treemap.BreadcrumbItemStyleOption;

@Accessors(chain = true)
@Data
public class BreadcrumbEmphasisItemStyle implements BreadcrumbEmphasisItemStyleOption, Serializable {

    private static final long serialVersionUID = 1L;

    private BreadcrumbItemStyleOption itemStyle;
}
