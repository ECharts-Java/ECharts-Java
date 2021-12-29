package org.icepear.echarts;

import org.icepear.echarts.charts.scatter.ScatterSeries;

public class Scatter extends CartesianCoordChart<Scatter, ScatterSeries> {
    public Scatter() {
        super(Scatter.class, ScatterSeries.class);
    }

    @Override
    protected ScatterSeries createSeries() {
        return new ScatterSeries().setType("scatter");
    }
}
