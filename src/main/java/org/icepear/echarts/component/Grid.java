package org.icepear.echarts.component;

import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.coord.cartesian.GridOption;
import org.icepear.echarts.type.BoxLength;

import lombok.Data;

@Data
public class Grid implements GridOption {
    private Boolean show = null;

    private Boolean containLabel = null;

    private String backgroundColor = null;

    private Number borderWidth = null;

    private String borderColor = null;

    private TooltipOption tooltip = null;

    private String mainType = null;

    private String type = null;

    private String id = null;

    private String name = null;

    private Number z = null;

    private Number zlevel = null;

    private BoxLength<?> width = null;

    private BoxLength<?> height = null;

    private BoxLength<?> top = null;

    private BoxLength<?> right = null;

    private BoxLength<?> bottom = null;

    private BoxLength<?> left = null;

    private Number shadowBlur = null;

    private String shadowColor = null;

    private Number shadowOffsetX = null;

    private Number shadowOffsetY = null;
}
