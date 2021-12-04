package org.icepear.echarts.type;

import java.util.List;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class EChartsRadius {
    @Setter(AccessLevel.NONE)
    private Object value;

    public EChartsRadius(String value) {
        this.value = value;
    }

    public EChartsRadius(List<String> value) {
        this.value = value;
    }
}
