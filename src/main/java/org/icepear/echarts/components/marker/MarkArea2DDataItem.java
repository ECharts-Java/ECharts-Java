package org.icepear.echarts.components.marker;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.marker.MarkArea2DDataItemDimOption;
import org.icepear.echarts.origin.component.marker.MarkArea2DDataItemOption;

@Accessors(chain = true)
@Data
public class MarkArea2DDataItem implements MarkArea2DDataItemOption, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private MarkArea2DDataItemDimOption startPoint;

    private MarkArea2DDataItemDimOption endPoint;
}
