package org.icepear.echarts.component;

import org.icepear.echarts.origin.component.marker.MarkLine1DDataItemOption;
import org.icepear.echarts.origin.util.EmphasisOption;
import org.icepear.echarts.origin.util.LineStyleOption;
import org.icepear.echarts.origin.util.SeriesLineLabelOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class MarkLine1DDataItem implements MarkLine1DDataItemOption {
    private Number xAxis;

    private Number yAxis;

    private String type;

    private Number valueIndex;

    private String valueDim;

    private String symbol;

    private Number symbolSize;

    private Number symbolRotate;

    private Number symbolOffset;

    private String name;

    private LineStyleOption lineStyle;

    private Object itemStyle;

    private SeriesLineLabelOption label;

    private EmphasisOption emphasis;

    private Object select;

    private Object blur;
}
