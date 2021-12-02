package org.icepear.echarts.component;

import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.marker.MarkArea1DDataItemOption;
import org.icepear.echarts.origin.util.EmphasisOption;

import lombok.Data;

@Accessors(chain=true)
@Data
public class MarkArea1DDataItem implements MarkArea1DDataItemOption {
    private Number xAxis;

    private Number yAxis;

    private Object type;

    private Number valueIndex;

    private String valueDim;

    private String name;

    private Object itemStyle;

    private Object label;

    private EmphasisOption emphasis;

    private Object select;

    private Object blur;
}
