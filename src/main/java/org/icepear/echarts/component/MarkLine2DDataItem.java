package org.icepear.echarts.component;

import org.icepear.echarts.origin.component.marker.MarkLine2DDataItemDimOption;
import org.icepear.echarts.origin.component.marker.MarkLine2DDataItemOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class MarkLine2DDataItem implements MarkLine2DDataItemOption {
    private MarkLine2DDataItemDimOption startPoint;

    private MarkLine2DDataItemDimOption endPoint;
}
