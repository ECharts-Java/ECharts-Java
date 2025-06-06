package org.icepear.echarts.components.marker;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.marker.MarkLine2DDataItemDimOption;
import org.icepear.echarts.origin.component.marker.MarkLine2DDataItemOption;

@Accessors(chain = true)
@Data
public class MarkLine2DDataItem implements MarkLine2DDataItemOption, Serializable {

    private static final long serialVersionUID = 1L;

    private MarkLine2DDataItemDimOption startPoint;

    private MarkLine2DDataItemDimOption endPoint;
}
