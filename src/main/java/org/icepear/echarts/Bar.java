package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.bar.BarSeries;

public class Bar extends CartesianCoordChart<Bar, BarSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Bar() {
        super(Bar.class, BarSeries.class);
    }

    @Override
    public BarSeries createSeries() {
        return new BarSeries().setType("bar");
    }
}
