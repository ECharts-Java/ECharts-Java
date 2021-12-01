package org.icepear.echarts.component;

import org.icepear.echarts.origin.coord.MinorSplitLineOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class MinorSplitLine implements MinorSplitLineOption {
    private Boolean show;
    
    private Object lineStyle;
}
