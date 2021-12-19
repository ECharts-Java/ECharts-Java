package org.icepear.echarts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.icepear.echarts.origin.util.SeriesOption;

public abstract class Chart<T extends Chart<?, ?>, E extends SeriesOption> {
    protected final T self;
    protected final Supplier<E> seriesSupplier;
    protected final String seriesType;
    protected List<SeriesOption> series;
    protected Option option;

    public Chart(final Class<T> clazz, final Supplier<E> seriesSupplier, final String seriesType) {
        self = clazz.cast(this);
        this.seriesSupplier = seriesSupplier;
        this.seriesType = seriesType;
        series = new ArrayList<>();
        option = new Option();
    }

    public Option getOption() {
        return option.setSeries(series.toArray(new SeriesOption[0]));
    }

    public T addSeries(Object[] series) {
        this.series.add(seriesSupplier.get().setData(series));
        return self;
    }

    public T addSeries(E series) {
        this.series.add(series);
        return self;
    }
}
