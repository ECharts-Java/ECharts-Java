package org.icepear.echarts.components.dataset;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.data.helper.DataTransformConfigOption;

@Accessors(chain = true)
@Data
public class DataTransformConfig implements DataTransformConfigOption {

    private String dimension;

    @Setter(AccessLevel.NONE)
    private Object value;

    public DataTransformConfig setValue(Number value) {
        this.value = value;
        return this;
    }

    public DataTransformConfig setValue(Object value) {
        this.value = value;
        return this;
    }

    public DataTransformConfig setValue(String value) {
        this.value = value;
        return this;
    }
}
