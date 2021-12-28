package org.icepear.echarts.charts.parallel;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.parallel.ParallelSeriesDataItemOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class ParallelSeriesDataItem implements ParallelSeriesDataItemOption {

    private LineStyleOption lineStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object value;

    public ParallelSeriesDataItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public ParallelSeriesDataItem setValue(Object[] value) {
        this.value = value;
        return this;
    }

    public ParallelSeriesDataItem setValue(String[] value) {
        this.value = value;
        return this;
    }
}
