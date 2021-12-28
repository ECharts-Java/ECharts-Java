package org.icepear.echarts.components.dataset;

import lombok.Data;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.data.helper.DataTransformConfigOption;
import org.icepear.echarts.origin.data.helper.DataTransformOption;

@Accessors(chain = true)
@Data
public class DataTransform implements DataTransformOption {

    private String type;

    private DataTransformConfigOption config;

    private Boolean print;
}
