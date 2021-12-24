package org.icepear.echarts;

import org.icepear.echarts.charts.bar.BarSeries;

public class PolarBar extends PolarChart<PolarBar, BarSeries> {
    public PolarBar() {
        super(PolarBar.class, BarSeries.class);
    }

    @Override
    protected BarSeries createSeries() {
        return new BarSeries().setType("bar").setCoordinateSystem("polar");
    }
}
