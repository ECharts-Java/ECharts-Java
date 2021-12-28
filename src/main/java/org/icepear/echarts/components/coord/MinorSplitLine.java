package org.icepear.echarts.components.coord;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.MinorSplitLineOption;
import org.icepear.echarts.origin.util.LineStyleOption;

@Accessors(chain = true)
@Data
public class MinorSplitLine implements MinorSplitLineOption {

    private Boolean show;

    private LineStyleOption lineStyle;
}
