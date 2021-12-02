package org.icepear.echarts.component;

import org.icepear.echarts.origin.component.marker.MarkArea2DDataItemDimOption;
import org.icepear.echarts.origin.component.marker.MarkArea2DDataItemOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class MarkArea2DDataItem implements MarkArea2DDataItemOption {
    private MarkArea2DDataItemDimOption startPoint;

    private MarkArea2DDataItemDimOption endPoint;
}
