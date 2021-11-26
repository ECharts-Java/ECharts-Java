package org.icepear.echarts.component;

import org.icepear.echarts.origin.util.AreaStyleOption;

import lombok.Getter;
import lombok.Setter;

public class AreaStyle implements AreaStyleOption {
    @Getter
    @Setter
    public String color = null;

    @Getter
    @Setter
    public Number opacity = null;
}
