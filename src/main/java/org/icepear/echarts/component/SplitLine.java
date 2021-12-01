package org.icepear.echarts.component;

import org.icepear.echarts.origin.coord.SplitLineOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class SplitLine implements SplitLineOption {
    private Boolean show;

    private String interval;

    private Object lineStyle;
}
