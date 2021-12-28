package org.icepear.echarts.components.coord;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.SplitLineOption;
import org.icepear.echarts.origin.util.LineStyleOption;

@Accessors(chain = true)
@Data
public class SplitLine implements SplitLineOption {

    private Boolean show;

    @Setter(AccessLevel.NONE)
    private Object interval;

    public SplitLine setInterval(Number interval) {
        this.interval = interval;
        return this;
    }

    public SplitLine setInterval(String interval) {
        this.interval = interval;
        return this;
    }

    private LineStyleOption lineStyle;
}
