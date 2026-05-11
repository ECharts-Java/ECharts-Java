package org.icepear.echarts.charts.lines;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.lines.LinesDataItemOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class LinesDataItem implements LinesDataItemOption, Serializable {

    private static final long serialVersionUID = 1L;

    private Object emphasis;

    private Object select;

    private Object blur;

    private String name;

    private Number[][] coords;

    @Setter(AccessLevel.NONE)
    private Object value;

    public LinesDataItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public LinesDataItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    private LineStyleOption lineStyle;

    private SeriesLabelOption label;
}
