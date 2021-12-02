package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.marker.MarkPointDataItemOption;
import org.icepear.echarts.origin.util.EmphasisOption;
import org.icepear.echarts.type.EChartsNumber;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class MarkPointDataItem implements MarkPointDataItemOption {
    private String name;

    private Object itemStyle;

    private Object label;

    private EmphasisOption emphasis;

    private Object select;

    private Object blur;

    private String symbol;

    private Number symbolSize;

    private Number symbolRotate;

    private Boolean symbolKeepAspect;

    private Number symbolOffset;

    private EChartsNumber x;

    private EChartsNumber y;

    private List<Object> coord;

    private EChartsNumber xAxis;

    private EChartsNumber yAxis;

    private Object radiusAxis;

    private Object angleAxis;

    private String type;

    private Number valueIndex;

    private String valueDim;

    private Number value;
}
