package org.icepear.echarts;

import org.icepear.echarts.charts.gauge.GaugeSeries;

public class Gauge extends Chart<Gauge, GaugeSeries> {
    public Gauge() {
        super(Gauge.class, GaugeSeries.class);
    }

    @Override
    public GaugeSeries createSeries() {
        return new GaugeSeries().setType("gauge");
    }
}
