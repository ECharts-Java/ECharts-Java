package org.icepear.echarts.charts.boxplot;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.boxplot.BoxplotDataItemOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class BoxplotDataItem implements BoxplotDataItemOption, Serializable {

    private static final long serialVersionUID = 1L;

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    private Object value;
}
