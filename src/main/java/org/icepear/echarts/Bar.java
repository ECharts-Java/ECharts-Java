package org.icepear.echarts;

import org.icepear.echarts.charts.bar.BarSeries;

public class Bar extends CartesianCoordChart<Bar, BarSeries> {
    public Bar() {
        super(Bar.class, BarSeries.class);
    }

    @Override
    public BarSeries createSeries() {
        return new BarSeries().setType("bar");
    }
}
