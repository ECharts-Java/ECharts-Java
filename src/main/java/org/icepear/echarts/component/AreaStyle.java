package org.icepear.echarts.component;

import org.icepear.echarts.origin.util.AreaStyleOption;

import lombok.Data;

@Data
public class AreaStyle implements AreaStyleOption {
    private String color;

    private Number opacity;
}
