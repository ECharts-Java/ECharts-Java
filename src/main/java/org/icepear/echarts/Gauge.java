package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.gauge.GaugeSeries;

public class Gauge extends Chart<Gauge, GaugeSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Gauge() {
        super(Gauge.class, GaugeSeries.class);
    }

    @Override
    public GaugeSeries createSeries() {
        return new GaugeSeries().setType("gauge");
    }
}
