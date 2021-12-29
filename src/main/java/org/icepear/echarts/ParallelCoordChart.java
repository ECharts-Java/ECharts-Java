package org.icepear.echarts;

import org.icepear.echarts.components.coord.parallel.CategoryParallelAxis;
import org.icepear.echarts.components.coord.parallel.DefaultParallelAxis;
import org.icepear.echarts.components.coord.parallel.LogParallelAxis;
import org.icepear.echarts.components.coord.parallel.TimeParallelAxis;
import org.icepear.echarts.components.coord.parallel.ValueParallelAxis;
import org.icepear.echarts.origin.coord.parallel.ParallelAxisOption;
import org.icepear.echarts.origin.util.SeriesOption;

public abstract class ParallelCoordChart<T extends Chart<?, ?>, E extends SeriesOption> extends Chart<T, E> {
    public ParallelCoordChart(final Class<T> clazz, final Class<E> seriesClazz) {
        super(clazz, seriesClazz);
    }

    public T setParallelAxis(Number dim) {
        option.setParallelAxis(new DefaultParallelAxis().setDim(dim));
        return self;
    }

    public T setParallelAxis(String name, Number dim) {
        option.setParallelAxis(new DefaultParallelAxis().setName(name).setDim(dim));
        return self;
    }

    public T setParallelAxis(Number dim, String[] parallelAxis) {
        option.setParallelAxis(createCategoryParallelAxis().setDim(dim).setData(parallelAxis));
        return self;
    }

    public T setParallelAxis(String name, Number dim, String[] parallelAxis) {
        option.setParallelAxis(createCategoryParallelAxis().setName(name).setDim(dim).setData(parallelAxis));
        return self;
    }

    public T setParallelAxis(ParallelAxisOption parallelAxis) {
        option.setParallelAxis(parallelAxis);
        return self;
    }

    protected CategoryParallelAxis createCategoryParallelAxis() {
        return new CategoryParallelAxis().setType("category");
    }

    protected ValueParallelAxis createValueParallelAxis() {
        return new ValueParallelAxis().setType("value");
    }

    protected LogParallelAxis createLogParallelAxis() {
        return new LogParallelAxis().setType("log");
    }

    protected TimeParallelAxis createTimeParallelAxis() {
        return new TimeParallelAxis().setType("time");
    }
}
