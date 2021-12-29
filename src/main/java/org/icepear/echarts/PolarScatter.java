package org.icepear.echarts;

import org.icepear.echarts.charts.scatter.ScatterSeries;

public class PolarScatter extends PolarCoordChart<PolarScatter, ScatterSeries> {
    public PolarScatter() {
        super(PolarScatter.class, ScatterSeries.class);
    }

    @Override
    protected ScatterSeries createSeries() {
        return new ScatterSeries().setType("scatter").setCoordinateSystem("polar");
    }
}
