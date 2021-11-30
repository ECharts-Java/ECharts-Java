package org.icepear.echarts.component;

import org.icepear.echarts.origin.util.AreaStyleOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class AreaStyle implements AreaStyleOption {
    private String color;

    private Number opacity;
}
