package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.toolbox.feature.ToolboxDataZoomFeatureOption;
import org.icepear.echarts.type.AxisIndex;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class ToolboxDataZoomFeature implements ToolboxDataZoomFeatureOption {
    private List<String> type;

    private Object filterMode;

    private AxisIndex xAxisIndex;

    private AxisIndex yAxisIndex;

    private Object xAxisId;

    private Object yAxisId;

    private Object brushStyle;

    private Boolean show;

    private String title;

    private String icon;

    private Object iconStyle;

    private Object emphasis;

    private Object iconStatus;

    private Object onclick;
}
