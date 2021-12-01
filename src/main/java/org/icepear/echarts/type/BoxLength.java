package org.icepear.echarts.type;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class BoxLength {
    @Setter(AccessLevel.NONE)
    private Object value;

    public BoxLength(Number value) {
        this.value = value;
    }

    public BoxLength(String value) {
        this.value = value;
    }
}
