package org.icepear.echarts;

import org.icepear.echarts.charts.pie.PieDataItem;
import org.icepear.echarts.charts.pie.PieSeries;

public class Pie extends Chart<Pie, PieSeries> {
    public Pie() {
        super(Pie.class, PieSeries.class);
    }

    public Pie addSeries(PieDataItem[] series) {
        this.series.add(createSeries(series));
        return this;
    }

    @Override
    protected PieSeries createSeries() {
        return new PieSeries().setType("pie");
    }
}
