package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.parallel.ParallelSeries;

public class Parallel extends ParallelCoordChart<Parallel, ParallelSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Parallel() {
        super(Parallel.class, ParallelSeries.class);
    }

    @Override
    public ParallelSeries createSeries() {
        return new ParallelSeries().setType("parallel");
    }
}
