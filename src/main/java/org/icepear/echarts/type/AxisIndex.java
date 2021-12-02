package org.icepear.echarts.type;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class AxisIndex {
    @Setter(AccessLevel.NONE)
    private Object value;

    public AxisIndex(Number value) {
        this.value = value;
    }

    public AxisIndex(String value) {
        this.value = value;
    }
}
