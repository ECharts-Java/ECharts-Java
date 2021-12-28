package org.icepear.echarts.components.coord;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.CategoryAxisTickOption;
import org.icepear.echarts.origin.util.LineStyleOption;

@Accessors(chain = true)
@Data
public class CategoryAxisTick implements CategoryAxisTickOption {

    @Setter(AccessLevel.NONE)
    private Object show;

    public CategoryAxisTick setShow(Boolean show) {
        this.show = show;
        return this;
    }

    public CategoryAxisTick setShow(String show) {
        this.show = show;
        return this;
    }

    private Boolean inside;

    private Number length;

    private LineStyleOption lineStyle;

    private Boolean alignWithLabel;

    @Setter(AccessLevel.NONE)
    private Object interval;

    public CategoryAxisTick setInterval(Number interval) {
        this.interval = interval;
        return this;
    }

    public CategoryAxisTick setInterval(String interval) {
        this.interval = interval;
        return this;
    }
}
