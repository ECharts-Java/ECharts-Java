package org.icepear.echarts.charts.parallel;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.parallel.ParallelDataItemOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class ParallelDataItem implements ParallelDataItemOption {

    private LineStyleOption lineStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    @Setter(AccessLevel.NONE)
    private Object value;

    public ParallelDataItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    public ParallelDataItem setValue(Object[] value) {
        this.value = value;
        return this;
    }

    public ParallelDataItem setValue(String[] value) {
        this.value = value;
        return this;
    }
}
