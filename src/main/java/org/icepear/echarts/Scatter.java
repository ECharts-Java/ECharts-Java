package org.icepear.echarts;

import org.icepear.echarts.charts.scatter.ScatterSeries;

import java.io.Serializable;

public class Scatter extends CartesianCoordChart<Scatter, ScatterSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Scatter() {
        super(Scatter.class, ScatterSeries.class);
    }

    @Override
    protected ScatterSeries createSeries() {
        return new ScatterSeries().setType("scatter");
    }
}
