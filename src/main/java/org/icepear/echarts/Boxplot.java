package org.icepear.echarts;

import org.icepear.echarts.charts.boxplot.BoxplotSeries;

import java.io.Serializable;

public class Boxplot extends CartesianCoordChart<Boxplot, BoxplotSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Boxplot() {
        super(Boxplot.class, BoxplotSeries.class);
    }

    @Override
    protected BoxplotSeries createSeries() {
        return new BoxplotSeries().setType("boxplot");
    }
}
