package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.marker.MarkArea2DDataItemDimOption;
import org.icepear.echarts.origin.util.EmphasisOption;
import org.icepear.echarts.type.EChartsNumber;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class MarkArea2DDataItemDim implements MarkArea2DDataItemDimOption {
    private String name;

    private Object itemStyle;

    private Object label;

    private EmphasisOption emphasis;

    private Object select;

    private Object blur;

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
