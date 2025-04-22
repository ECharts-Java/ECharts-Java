package org.icepear.echarts.components.dataset;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.data.helper.DataTransformConfigOption;

@Accessors(chain = true)
@Data
public class DataTransformConfig implements DataTransformConfigOption, Serializable {

    private static final long serialVersionUID = 1L;

    private String dimension;

    @Setter(AccessLevel.NONE)
    private Object value;

    private String order;

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
