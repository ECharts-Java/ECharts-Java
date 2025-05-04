package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.scatter.ScatterSeries;

public class PolarScatter extends PolarCoordChart<PolarScatter, ScatterSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public PolarScatter() {
        super(PolarScatter.class, ScatterSeries.class);
    }

    @Override
    protected ScatterSeries createSeries() {
        return new ScatterSeries().setType("scatter").setCoordinateSystem("polar");
    }
}
