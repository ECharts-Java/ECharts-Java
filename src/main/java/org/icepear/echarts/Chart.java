package org.icepear.echarts;

import java.util.ArrayList;
import java.util.List;

import org.icepear.echarts.components.dataset.Dataset;
import org.icepear.echarts.components.legend.Legend;
import org.icepear.echarts.components.title.Title;
import org.icepear.echarts.components.tooltip.Tooltip;
import org.icepear.echarts.components.visualMap.ContinousVisualMap;
import org.icepear.echarts.origin.component.visualMap.VisualMapOption;
import org.icepear.echarts.origin.util.SeriesOption;

public abstract class Chart<T extends Chart<?, ?>, E extends SeriesOption> {
    protected final T self;
    protected final Class<E> seriesClazz;
    protected List<Dataset> datasets;
    protected List<SeriesOption> series;
    protected Option option;

    public Chart(final Class<T> clazz, final Class<E> seriesClazz) {
        self = clazz.cast(this);
        this.seriesClazz = seriesClazz;
        datasets = new ArrayList<>();
        series = new ArrayList<>();
        option = new Option();
    }

    public Option getOption() {
        if (datasets.size() > 0) {
            option.setDataset(datasets.toArray(new Dataset[0]));
        }
        option.setSeries(series.toArray(new SeriesOption[0]));
        return option;
    }

    public T setTitle(String title) {
        option.setTitle(new Title().setText(title));
        return self;
    }

    public T setLegend(Boolean show) {
        option.setLegend(new Legend().setShow(show));
        return self;
    }

    public T setTooltip(String trigger) {
        option.setTooltip(new Tooltip().setTrigger(trigger));
        return self;
    }

    public T addDataset(Object[] dataset) {
        datasets.add(new Dataset().setSource(dataset));
        return self;
    }

    public T addDataset(Object[][] dataset) {
        datasets.add(new Dataset().setSource(dataset));
        return self;
    }

    public T addDataset(Object[][][] dataset) {
        datasets.add(new Dataset().setSource(dataset));
        return self;
    }

    public T setVisualMap(Number min, Number max) {
        option.setVisualMap(new ContinousVisualMap().setMin(min).setMax(max));
        return self;
    }

    public T setVisualMap(VisualMapOption visualMap) {
        option.setVisualMap(visualMap);
        return self;
    }

    public T addSeries(Object[] series) {
        this.series.add(createSeries(series));
        return self;
    }

    public T addSeries(Object[][] series) {
        this.series.add(createSeries(series));
        return self;
    }

    public T addSeries(Object[][][] series) {
        this.series.add(createSeries(series));
        return self;
    }

    public T addSeries(String name, Object[] series) {
        this.series.add(createSeries(name, series));
        return self;
    }

    public T addSeries(String name, Object[][] series) {
        this.series.add(createSeries(name, series));
        return self;
    }

    public T addSeries(String name, Object[][][] series) {
        this.series.add(createSeries(name, series));
        return self;
    }

    public T addSeries(E series) {
        this.series.add(createSeries(series));
        return self;
    }

    protected abstract E createSeries();

    protected E createSeries(Object series) {
        return seriesClazz.cast(createSeries().setData(series));
    }

    protected E createSeries(String name, Object series) {
        return seriesClazz.cast(createSeries(series).setName(name));
    }

    protected E createSeries(E series) {
        return series;
    }
}
