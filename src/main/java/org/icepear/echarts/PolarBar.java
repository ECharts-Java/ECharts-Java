package org.icepear.echarts;

import org.icepear.echarts.charts.bar.BarSeries;

import java.io.Serializable;

public class PolarBar extends PolarCoordChart<PolarBar, BarSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public PolarBar() {
        super(PolarBar.class, BarSeries.class);
    }

    @Override
    protected BarSeries createSeries() {
        return new BarSeries().setType("bar").setCoordinateSystem("polar");
    }
}
