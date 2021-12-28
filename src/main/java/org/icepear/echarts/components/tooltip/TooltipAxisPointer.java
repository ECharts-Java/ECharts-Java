package org.icepear.echarts.components.tooltip;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.component.tooltip.TooltipAxisPointerOption;
import org.icepear.echarts.origin.util.AreaStyleOption;
import org.icepear.echarts.origin.util.LineStyleOption;

@Accessors(chain = true)
@Data
public class TooltipAxisPointer implements TooltipAxisPointerOption {

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public TooltipAxisPointer setId(Number id) {
        this.id = id;
        return this;
    }

    public TooltipAxisPointer setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public TooltipAxisPointer setName(Number name) {
        this.name = name;
        return this;
    }

    public TooltipAxisPointer setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    @Setter(AccessLevel.NONE)
    private Object show;

    public TooltipAxisPointer setShow(Boolean show) {
        this.show = show;
        return this;
    }

    public TooltipAxisPointer setShow(String show) {
        this.show = show;
        return this;
    }

    private String triggerOn;

    private Boolean snap;

    private Boolean triggerTooltip;

    private Object value;

    private String status;

    private Object label;

    @Setter(AccessLevel.NONE)
    private Object animation;

    public TooltipAxisPointer setAnimation(Boolean animation) {
        this.animation = animation;
        return this;
    }

    public TooltipAxisPointer setAnimation(String animation) {
        this.animation = animation;
        return this;
    }

    private Number animationDurationUpdate;

    private Object animationEasingUpdate;

    private LineStyleOption lineStyle;

    private AreaStyleOption shadowStyle;

    private Object handle;

    private Object[] seriesDataIndices;

    private Object[] link;

    private String axis;

    private Object crossStyle;
}
