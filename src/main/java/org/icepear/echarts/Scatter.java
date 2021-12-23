package org.icepear.echarts;

import org.icepear.echarts.charts.scatter.ScatterSeries;

public class Scatter extends CartesianChart<Scatter, ScatterSeries> {
    public Scatter() {
        super(Scatter.class, ScatterSeries.class);
    }

    @Override
    protected ScatterSeries createSeries() {
        return new ScatterSeries().setType("scatter");
    }
}
