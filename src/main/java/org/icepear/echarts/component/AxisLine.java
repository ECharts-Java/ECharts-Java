package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.coord.AxisLineOption;
import org.icepear.echarts.origin.util.LineStyleOption;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class AxisLine implements AxisLineOption {
    private Boolean show;

    private Boolean onZero;

    private Number onZeroAxisIndex;

    private String symbol;

    private List<Number> symbolSize;

    private Number symbolOffset;

    private LineStyleOption lineStyle;
}
