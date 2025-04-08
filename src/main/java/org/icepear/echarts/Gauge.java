package org.icepear.echarts;

import org.icepear.echarts.charts.gauge.GaugeSeries;

import java.io.Serial;
import java.io.Serializable;

public class Gauge extends Chart<Gauge, GaugeSeries> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public Gauge() {
        super(Gauge.class, GaugeSeries.class);
    }

    @Override
    public GaugeSeries createSeries() {
        return new GaugeSeries().setType("gauge");
    }
}
