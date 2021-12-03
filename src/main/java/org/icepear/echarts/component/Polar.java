package org.icepear.echarts.component;

import org.icepear.echarts.origin.coord.polar.PolarOption;
import org.icepear.echarts.type.EChartsNumber;

import lombok.experimental.Accessors;
import lombok.Data;

@Accessors(chain=true)
@Data
public class Polar implements PolarOption {
    private String mainType;

    private String type;

    private String id;

    private String name;

    private Number z;

    private Number zlevel;

    private EChartsNumber center;

    private EChartsNumber radius;
}
