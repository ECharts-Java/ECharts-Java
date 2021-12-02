package org.icepear.echarts.type;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class EChartsNumber {
    @Setter(AccessLevel.NONE)
    private Object value;

    public EChartsNumber(Number value) {
        this.value = value;
    }

    public EChartsNumber(String value) {
        this.value = value;
    }
}
