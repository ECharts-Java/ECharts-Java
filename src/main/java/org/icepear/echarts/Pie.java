package org.icepear.echarts;

import org.icepear.echarts.charts.pie.PieSeries;

public class Pie extends Chart<Pie, PieSeries> {
    public Pie() {
        super(Pie.class, PieSeries.class);
    }

    @Override
    protected PieSeries createSeries() {
        return new PieSeries().setType("pie");
    }
}
