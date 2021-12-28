package org.icepear.echarts.components.marker;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.marker.MarkArea2DDataItemDimOption;
import org.icepear.echarts.origin.component.marker.MarkArea2DDataItemOption;

@Accessors(chain = true)
@Data
public class MarkArea2DDataItem implements MarkArea2DDataItemOption {

    private MarkArea2DDataItemDimOption startPoint;

    private MarkArea2DDataItemDimOption endPoint;
}
