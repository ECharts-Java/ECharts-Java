package org.icepear.echarts.component;

import org.icepear.echarts.origin.component.tooltip.TooltipOption;
import org.icepear.echarts.origin.coord.cartesian.GridOption;
import org.icepear.echarts.type.BoxLength;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class Grid implements GridOption {
    private Boolean show;

    private Boolean containLabel;

    private String backgroundColor;

    private Number borderWidth;

    private String borderColor;

    private TooltipOption tooltip;

    private String mainType;

    private String type;

    private String id;

    private String name;

    private Number z;

    private Number zlevel;

    private BoxLength width;

    private BoxLength height;

    private BoxLength top;

    private BoxLength right;

    private BoxLength bottom;

    private BoxLength left;

    private Number shadowBlur;

    private String shadowColor;

    private Number shadowOffsetX;

    private Number shadowOffsetY;
}
