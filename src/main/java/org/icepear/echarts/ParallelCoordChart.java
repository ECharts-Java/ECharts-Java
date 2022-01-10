package org.icepear.echarts;

import java.util.ArrayList;
import java.util.List;

import org.icepear.echarts.components.coord.parallel.CategoryParallelAxis;
import org.icepear.echarts.components.coord.parallel.LogParallelAxis;
import org.icepear.echarts.components.coord.parallel.TimeParallelAxis;
import org.icepear.echarts.components.coord.parallel.ValueParallelAxis;
import org.icepear.echarts.origin.coord.parallel.ParallelAxisOption;
import org.icepear.echarts.origin.util.SeriesOption;

public abstract class ParallelCoordChart<T extends Chart<?, ?>, E extends SeriesOption> extends Chart<T, E> {
    protected List<ParallelAxisOption> parallelAxes;

    public ParallelCoordChart(final Class<T> clazz, final Class<E> seriesClazz) {
        super(clazz, seriesClazz);
        parallelAxes = new ArrayList<>();
    }

    public Option getOption() {
        return super.getOption().setParallelAxis(parallelAxes.toArray(new ParallelAxisOption[0]));
    }

    public T addParallelAxis(Number dim) {
        parallelAxes.add(new ValueParallelAxis().setDim(dim));
        return self;
    }

    public T addParallelAxis(String name, Number dim) {
        parallelAxes.add(new ValueParallelAxis().setName(name).setDim(dim));
        return self;
    }

    public T addParallelAxis(Number dim, String[] data) {
        parallelAxes.add(createCategoryParallelAxis().setDim(dim).setData(data));
        return self;
    }

    public T addParallelAxis(String name, Number dim, String[] data) {
        parallelAxes.add(createCategoryParallelAxis().setName(name).setDim(dim).setData(data));
        return self;
    }

    public T addParallelAxis(ParallelAxisOption parallelAxis) {
        parallelAxes.add(parallelAxis);
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
