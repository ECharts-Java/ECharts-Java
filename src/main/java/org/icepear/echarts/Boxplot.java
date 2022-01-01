package org.icepear.echarts;

import org.icepear.echarts.charts.boxplot.BoxplotSeries;

public class Boxplot extends CartesianCoordChart<Boxplot, BoxplotSeries> {
    public Boxplot() {
        super(Boxplot.class, BoxplotSeries.class);
    }

    @Override
    protected BoxplotSeries createSeries() {
        return new BoxplotSeries().setType("boxplot");
    }
}
