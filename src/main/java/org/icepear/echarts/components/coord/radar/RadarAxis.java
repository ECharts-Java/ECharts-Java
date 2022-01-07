package org.icepear.echarts.components.coord.radar;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.AxisLabelBaseOption;
import org.icepear.echarts.origin.coord.AxisLineOption;
import org.icepear.echarts.origin.coord.AxisTickOption;
import org.icepear.echarts.origin.coord.SplitAreaOption;
import org.icepear.echarts.origin.coord.SplitLineOption;
import org.icepear.echarts.origin.coord.radar.RadarAxisNameOption;
import org.icepear.echarts.origin.coord.radar.RadarIndicatorOption;
import org.icepear.echarts.origin.coord.radar.RadarOption;

@Accessors(chain = true)
@Data
public class RadarAxis implements RadarOption {

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public RadarAxis setId(Number id) {
        this.id = id;
        return this;
    }

    public RadarAxis setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public RadarAxis setName(Number name) {
        this.name = name;
        return this;
    }

    public RadarAxis setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    @Setter(AccessLevel.NONE)
    private Object center;

    public RadarAxis setCenter(Number[] center) {
        this.center = center;
        return this;
    }

    public RadarAxis setCenter(String[] center) {
        this.center = center;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object radius;

    public RadarAxis setRadius(Number radius) {
        this.radius = radius;
        return this;
    }

    public RadarAxis setRadius(Number[] radius) {
        this.radius = radius;
        return this;
    }

    public RadarAxis setRadius(Object[] radius) {
        this.radius = radius;
        return this;
    }

    public RadarAxis setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public RadarAxis setRadius(String[] radius) {
        this.radius = radius;
        return this;
    }

    private Number startAngle;

    private String shape;

    private AxisLineOption axisLine;

    private AxisTickOption axisTick;

    private AxisLabelBaseOption axisLabel;

    private SplitLineOption splitLine;

    private SplitAreaOption splitArea;

    private RadarAxisNameOption axisName;

    private Number axisNameGap;

    private Boolean triggerEvent;

    private Boolean scale;

    private Number splitNumber;

    @Setter(AccessLevel.NONE)
    private Object boundaryGap;

    public RadarAxis setBoundaryGap(Boolean boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    public RadarAxis setBoundaryGap(Number[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    public RadarAxis setBoundaryGap(String[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    private RadarIndicatorOption[] indicator;
}
