package org.icepear.echarts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.origin.coord.cartesian.AxisOption;
import org.icepear.echarts.origin.util.SeriesOption;

public abstract class CartesianChart<T extends Chart<?, ?>, E extends SeriesOption> extends Chart<T, E> {
    protected List<AxisOption> xAxes;
    protected List<AxisOption> yAxes;

    public CartesianChart(final Class<T> clazz, final Supplier<E> seriesSupplier, final String seriesType) {
        super(clazz, seriesSupplier, seriesType);
        xAxes = new ArrayList<>();
        yAxes = new ArrayList<>();
    }

    public Option getOption() {
        return super.getOption()
                .setXAxis(xAxes.toArray(new AxisOption[0]))
                .setYAxis(yAxes.toArray(new AxisOption[0]));
    }

    public T addXAxis() {
        xAxes.add(new ValueAxis());
        return self;
    }

    public T addXAxis(String[] xAxis) {
        xAxes.add(new CategoryAxis().setData(xAxis));
        return self;
    }

    public T addXAxis(AxisOption xAxis) {
        xAxes.add(xAxis);
        return self;
    }

    public T addYAxis() {
        yAxes.add(new ValueAxis());
        return self;
    }

    public T addYAxis(String[] yAxis) {
        yAxes.add(new CategoryAxis().setData(yAxis));
        return self;
    }

    public T addYAxis(AxisOption yAxis) {
        yAxes.add(yAxis);
        return self;
    }
}
