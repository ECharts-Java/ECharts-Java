package org.icepear.echarts.charts.map;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.map.MapDataItemOption;
import org.icepear.echarts.origin.chart.map.MapItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class MapDataItem implements MapDataItemOption, Serializable {

    private static final long serialVersionUID = 1L;

    private MapItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    private String name;

    @Setter(AccessLevel.NONE)
    private Object value;

    public MapDataItem setValue(Number value) {
        this.value = value;
        return this;
    }

    public MapDataItem setValue(Number[] value) {
        this.value = value;
        return this;
    }

    private Boolean selected;
}
