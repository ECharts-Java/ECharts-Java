package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.bar.BarSeries;

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
