package org.icepear.echarts.components.coord;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.MinorSplitLineOption;
import org.icepear.echarts.origin.util.LineStyleOption;

@Accessors(chain = true)
@Data
public class MinorSplitLine implements MinorSplitLineOption, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Boolean show;

    private LineStyleOption lineStyle;
}
