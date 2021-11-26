package org.icepear.echarts.component;

import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.coord.cartesian.GridOption;
import org.icepear.echarts.type.BoxLength;

import lombok.Getter;
import lombok.Setter;

public class Grid implements GridOption {
    @Getter
    @Setter
    public Boolean show = null;

    @Getter
    @Setter
    public Boolean containLabel = null;

    @Getter
    @Setter
    public String backgroundColor = null;

    @Getter
    @Setter
    public Number borderWidth = null;

    @Getter
    @Setter
    public String borderColor = null;

    @Getter
    @Setter
    public TooltipOption tooltip = null;

    @Getter
    @Setter
    public String mainType = null;

    @Getter
    @Setter
    public String type = null;

    @Getter
    @Setter
    public String id = null;

    @Getter
    @Setter
    public String name = null;

    @Getter
    @Setter
    public Number z = null;

    @Getter
    @Setter
    public Number zlevel = null;

    @Getter
    @Setter
    public BoxLength<?> width = null;

    @Getter
    @Setter
    public BoxLength<?> height = null;

    @Getter
    @Setter
    public BoxLength<?> top = null;

    @Getter
    @Setter
    public BoxLength<?> right = null;

    @Getter
    @Setter
    public BoxLength<?> bottom = null;

    @Getter
    @Setter
    public BoxLength<?> left = null;

    @Getter
    @Setter
    public Number shadowBlur = null;

    @Getter
    @Setter
    public String shadowColor = null;

    @Getter
    @Setter
    public Number shadowOffsetX = null;

    @Getter
    @Setter
    public Number shadowOffsetY = null;
}
