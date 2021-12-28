package org.icepear.echarts.charts.boxplot;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.boxplot.PrepareBoxplotDataOption;

@Accessors(chain = true)
@Data
public class PrepareBoxplotData implements PrepareBoxplotDataOption {

    @Setter(AccessLevel.NONE)
    private Object boundIQR;

    public PrepareBoxplotData setBoundIQR(Number boundIQR) {
        this.boundIQR = boundIQR;
        return this;
    }

    public PrepareBoxplotData setBoundIQR(String boundIQR) {
        this.boundIQR = boundIQR;
        return this;
    }

    private String itemNameFormatter;
}
