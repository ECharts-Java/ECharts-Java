package org.icepear.echarts;

import org.icepear.echarts.charts.parallel.ParallelSeries;

public class Parallel extends ParallelCoordChart<Parallel, ParallelSeries> {
    public Parallel() {
        super(Parallel.class, ParallelSeries.class);
    }

    @Override
    public ParallelSeries createSeries() {
        return new ParallelSeries().setType("parallel");
    }
}
