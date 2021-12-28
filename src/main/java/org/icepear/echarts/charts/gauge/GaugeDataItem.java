package org.icepear.echarts.charts.gauge;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.gauge.GaugeDataItemOption;
import org.icepear.echarts.origin.chart.gauge.GaugeDetailOption;
import org.icepear.echarts.origin.chart.gauge.GaugePointerOption;
import org.icepear.echarts.origin.chart.gauge.GaugeProgressOption;
import org.icepear.echarts.origin.chart.gauge.GaugeTitleOption;
import org.icepear.echarts.origin.util.ItemStyleOption;

@Accessors(chain = true)
@Data
public class GaugeDataItem implements GaugeDataItemOption {

    private ItemStyleOption itemStyle;

    private Object emphasis;

    private Object select;

    private Object blur;

    private String name;

    private Number value;

    private GaugePointerOption pointer;

    private GaugeProgressOption progress;

    private GaugeTitleOption title;

    private GaugeDetailOption detail;
}
