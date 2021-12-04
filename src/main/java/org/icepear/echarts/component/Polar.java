package org.icepear.echarts.component;

import java.util.List;

import org.icepear.echarts.origin.coord.polar.PolarOption;
import org.icepear.echarts.type.EChartsNumber;
import org.icepear.echarts.type.EChartsRadius;

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

    private List<EChartsNumber>  center;

    private EChartsRadius  radius;
}
