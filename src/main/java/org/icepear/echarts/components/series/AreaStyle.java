package org.icepear.echarts.components.series;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.util.AreaStyleOption;

@Accessors(chain = true)
@Data
public class AreaStyle implements AreaStyleOption {

    private Number shadowBlur;

    private String shadowColor;

    private Number shadowOffsetX;

    private Number shadowOffsetY;

    private String color;

    private Number opacity;
}
