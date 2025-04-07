package org.icepear.echarts.charts.candlestick;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.candlestick.CandlestickDataItemOption;
import org.icepear.echarts.origin.chart.candlestick.CandlestickItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class CandlestickDataItem implements CandlestickDataItemOption, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private CandlestickItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    private Object value;
}
