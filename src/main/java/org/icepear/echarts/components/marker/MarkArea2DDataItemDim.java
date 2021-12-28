package org.icepear.echarts.components.marker;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.marker.MarkArea2DDataItemDimOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;

@Accessors(chain = true)
@Data
public class MarkArea2DDataItemDim implements MarkArea2DDataItemDimOption {

    private ItemStyleOption itemStyle;

    private SeriesLabelOption label;

    private Object emphasis;

    private Object select;

    private Object blur;

    private String name;

    @Setter(AccessLevel.NONE)
    private Object x;

    public MarkArea2DDataItemDim setX(Number x) {
        this.x = x;
        return this;
    }

    public MarkArea2DDataItemDim setX(String x) {
        this.x = x;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object y;

    public MarkArea2DDataItemDim setY(Number y) {
        this.y = y;
        return this;
    }

    public MarkArea2DDataItemDim setY(String y) {
        this.y = y;
        return this;
    }

    private Object[] coord;

    private Object xAxis;

    private Object yAxis;

    private Object radiusAxis;

    private Object angleAxis;

    private Object type;

    private Number valueIndex;

    private String valueDim;

    @Setter(AccessLevel.NONE)
    private Object value;

    public MarkArea2DDataItemDim setValue(Number value) {
        this.value = value;
        return this;
    }

    public MarkArea2DDataItemDim setValue(String value) {
        this.value = value;
        return this;
    }
}
