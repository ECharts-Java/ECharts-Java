package org.icepear.echarts.component;

import org.icepear.echarts.origin.coord.CategoryAxisTickOption;

import lombok.Data;

@Data
public class CategoryAxisTick implements CategoryAxisTickOption {    
    private Boolean alignWithLabel;
    
    private Number interval;

    private Boolean show;

    private Boolean inside;

    private Number length;

    private Object lineStyle;
}
