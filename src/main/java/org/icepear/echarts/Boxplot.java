package org.icepear.echarts;

import org.icepear.echarts.charts.boxplot.BoxplotSeries;
import org.icepear.echarts.components.dataset.DataTransform;
import org.icepear.echarts.components.dataset.Dataset;

public class Boxplot extends CartesianCoordChart<Boxplot, BoxplotSeries> {
    public Boxplot() {
        super(Boxplot.class, BoxplotSeries.class);
    }

    @Override
    protected BoxplotSeries createSeries() {
        return new BoxplotSeries().setType("boxplot");
    }

    @Override
    protected BoxplotSeries createSeries(Object series) {
        datasets.add(new Dataset().setSource(series));
        datasets.add(new Dataset()
                .setFromDatasetIndex(datasets.size() - 1)
                .setTransform(new DataTransform().setType("boxplot")));
        return createSeries().setDatasetIndex(datasets.size() - 1);
    }
}
