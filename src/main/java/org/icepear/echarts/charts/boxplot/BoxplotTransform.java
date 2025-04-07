package org.icepear.echarts.charts.boxplot;

import java.io.Serial;
import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.boxplot.BoxplotTransformOption;
import org.icepear.echarts.origin.chart.boxplot.PrepareBoxplotDataOption;
import org.icepear.echarts.origin.data.helper.DataTransformConfigOption;

@Accessors(chain = true)
@Data
public class BoxplotTransform implements BoxplotTransformOption, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String type = "boxplot";

    @Setter(AccessLevel.NONE)
    private Object config;

    public BoxplotTransform setConfig(DataTransformConfigOption config) {
        this.config = config;
        return this;
    }

    public BoxplotTransform setConfig(PrepareBoxplotDataOption config) {
        this.config = config;
        return this;
    }

    private Boolean print;
}
