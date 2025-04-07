package org.icepear.echarts.components.coord;

import java.io.Serial;
import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.SplitAreaOption;
import org.icepear.echarts.origin.util.AreaStyleOption;

@Accessors(chain = true)
@Data
public class SplitArea implements SplitAreaOption, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Boolean show;

    @Setter(AccessLevel.NONE)
    private Object interval;

    public SplitArea setInterval(Number interval) {
        this.interval = interval;
        return this;
    }

    public SplitArea setInterval(String interval) {
        this.interval = interval;
        return this;
    }

    private AreaStyleOption areaStyle;
}
