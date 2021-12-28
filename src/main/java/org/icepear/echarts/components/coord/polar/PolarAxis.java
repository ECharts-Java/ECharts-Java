package org.icepear.echarts.components.coord.polar;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.polar.PolarOption;

@Accessors(chain = true)
@Data
public class PolarAxis implements PolarOption {

    private String mainType;

    private String type;

    @Setter(AccessLevel.NONE)
    private Object id;

    public PolarAxis setId(Number id) {
        this.id = id;
        return this;
    }

    public PolarAxis setId(String id) {
        this.id = id;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object name;

    public PolarAxis setName(Number name) {
        this.name = name;
        return this;
    }

    public PolarAxis setName(String name) {
        this.name = name;
        return this;
    }

    private Number z;

    private Number zlevel;

    @Setter(AccessLevel.NONE)
    private Object center;

    public PolarAxis setCenter(Number[] center) {
        this.center = center;
        return this;
    }

    public PolarAxis setCenter(String[] center) {
        this.center = center;
        return this;
    }

    @Setter(AccessLevel.NONE)
    private Object radius;

    public PolarAxis setRadius(Number radius) {
        this.radius = radius;
        return this;
    }

    public PolarAxis setRadius(Number[] radius) {
        this.radius = radius;
        return this;
    }

    public PolarAxis setRadius(Object[] radius) {
        this.radius = radius;
        return this;
    }

    public PolarAxis setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public PolarAxis setRadius(String[] radius) {
        this.radius = radius;
        return this;
    }
}
