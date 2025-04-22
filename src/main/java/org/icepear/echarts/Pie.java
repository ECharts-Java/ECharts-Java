package org.icepear.echarts;

import org.icepear.echarts.charts.pie.PieSeries;

import java.io.Serializable;

public class Pie extends Chart<Pie, PieSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Pie() {
        super(Pie.class, PieSeries.class);
    }

    @Override
    protected PieSeries createSeries() {
        return new PieSeries().setType("pie");
    }
}
