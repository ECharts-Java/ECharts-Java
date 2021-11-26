package org.icepear.echarts.type;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoxLength<T> {
    private T value;

    public BoxLength(T value) {
        this.value = value;
    }
}
