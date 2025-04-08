package org.icepear.echarts;

import org.icepear.echarts.charts.bar.BarSeries;

import java.io.Serializable;

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
