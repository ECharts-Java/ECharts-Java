package org.icepear.echarts;

import java.util.ArrayList;
import java.util.List;

import org.icepear.echarts.origin.util.SeriesOption;

public abstract class Chart<T extends Chart<?, ?>, E extends SeriesOption> {
    protected final T self;
    protected final String seriesType;
    protected List<E> series;
    protected Option option;

    public Chart(final Class<T> clazz, final String seriesType) {
        self = clazz.cast(this);
        this.seriesType = seriesType;
        series = new ArrayList<>();
        option = new Option();
    }

    public Option getOption() {
        return option.setSeries(series.toArray(new SeriesOption[0]));
    }

    public T addSeries(E series) {
        this.series.add(series);
        return self;
    }
}
