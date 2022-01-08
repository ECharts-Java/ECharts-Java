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

    public T setTitle(String text) {
        option.setTitle(new Title().setText(text));
        return self;
    }

    public T setTitle(Title title) {
        option.setTitle(title);
        return self;
    }

    public T setLegend() {
        option.setLegend(new Legend());
        return self;
    }

    public T setLegend(Legend legend) {
        option.setLegend(legend);
        return self;
    }

    public T setTooltip(String trigger) {
        option.setTooltip(new Tooltip().setTrigger(trigger));
        return self;
    }

    public T setTooltip(Tooltip tooltip) {
        option.setTooltip(tooltip);
        return self;
    }

    public T addDataset(Object[] source) {
        datasets.add(new Dataset().setSource(source));
        return self;
    }

    public T addDataset(Object[][] source) {
        datasets.add(new Dataset().setSource(source));
        return self;
    }

    public T addDataset(Object[][][] source) {
        datasets.add(new Dataset().setSource(source));
        return self;
    }

    public T addDataset(Dataset dataset) {
        datasets.add(dataset);
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

    public T addSeries(Object[] data) {
        this.series.add(createSeries(data));
        return self;
    }

    public T addSeries(Object[][] data) {
        this.series.add(createSeries(data));
        return self;
    }

    public T addSeries(Object[][][] data) {
        this.series.add(createSeries(data));
        return self;
    }

    public T addSeries(String name, Object[] data) {
        this.series.add(createSeries(name, data));
        return self;
    }

    public T addSeries(String name, Object[][] data) {
        this.series.add(createSeries(name, data));
        return self;
    }

    public T addSeries(String name, Object[][][] data) {
        this.series.add(createSeries(name, data));
        return self;
    }

    public T addSeries(E series) {
        this.series.add(createSeries(series));
        return self;
    }

    protected abstract E createSeries();

    protected E createSeries(Object data) {
        return seriesClazz.cast(createSeries().setData(data));
    }

    protected E createSeries(String name, Object data) {
        return seriesClazz.cast(createSeries(data).setName(name));
    }

    protected E createSeries(E series) {
        return series;
    }
}
