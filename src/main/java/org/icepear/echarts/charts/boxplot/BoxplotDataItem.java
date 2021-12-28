package org.icepear.echarts.charts.boxplot;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.boxplot.BoxplotDataItemOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class BoxplotDataItem implements BoxplotDataItemOption {

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    private Object value;
}
