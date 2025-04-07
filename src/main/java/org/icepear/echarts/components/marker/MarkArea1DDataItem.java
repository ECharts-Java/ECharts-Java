package org.icepear.echarts.components.marker;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.marker.MarkArea1DDataItemOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class MarkArea1DDataItem implements MarkArea1DDataItemOption, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    private String name;

    private Number xAxis;

    private Number yAxis;

    private Object type;

    private Number valueIndex;

    private String valueDim;
}
