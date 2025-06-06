package org.icepear.echarts.charts.funnel;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.funnel.FunnelEmphasisOption;
import org.icepear.echarts.origin.chart.funnel.FunnelLabelOption;
import org.icepear.echarts.origin.util.ItemStyleOption;

@Accessors(chain = true)
@Data
public class FunnelEmphasis implements FunnelEmphasisOption, Serializable {

    private static final long serialVersionUID = 1L;

    private String focus;

    private ItemStyleOption itemStyle;

    private FunnelLabelOption label;

    private Object blurScope;
}
