package org.icepear.echarts.charts.boxplot;

import java.io.Serial;
import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.chart.boxplot.PrepareBoxplotDataOption;

@Accessors(chain = true)
@Data
public class PrepareBoxplotData implements PrepareBoxplotDataOption, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

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
