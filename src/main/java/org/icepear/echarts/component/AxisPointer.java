package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.component.axisPointer.AxisPointerOption;
import org.icepear.echarts.origin.util.LabelOption;

import lombok.Data;

@Data
public class AxisPointer implements AxisPointerOption {
    private List<Object> link;
    
    private String mainType;

    private String type;

    private String id;

    private String name;

    private Number z;

    private Number zlevel;

    private Boolean show;

    private String triggerOn;

    private Boolean snap;

    private Boolean triggerTooltip;

    private Object value;

    private String status;

    private LabelOption label;

    private String animation;

    private Number animationDurationUpdate;

    private Object animationEasingUpdate;

    private Object lineStyle;

    private Object shadowStyle;

    private Object handle;

    private List<Object> seriesDataIndices;
}
