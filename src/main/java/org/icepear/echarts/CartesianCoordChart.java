package org.icepear.echarts;

import java.util.ArrayList;
import java.util.List;

import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.coord.cartesian.LogAxis;
import org.icepear.echarts.components.coord.cartesian.TimeAxis;
import org.icepear.echarts.components.coord.cartesian.ValueAxis;
import org.icepear.echarts.origin.coord.cartesian.AxisOption;
import org.icepear.echarts.origin.util.SeriesOption;

public abstract class CartesianCoordChart<T extends Chart<?, ?>, E extends SeriesOption> extends Chart<T, E> {
    protected List<AxisOption> xAxes;
    protected List<AxisOption> yAxes;

    public CartesianCoordChart(final Class<T> clazz, final Class<E> seriesClazz) {
        super(clazz, seriesClazz);
        xAxes = new ArrayList<>();
        yAxes = new ArrayList<>();
    }

    @Override
    public Option getOption() {
        return super.getOption()
                .setXAxis(xAxes.toArray(new AxisOption[0]))
                .setYAxis(yAxes.toArray(new AxisOption[0]));
    }

    public T addXAxis() {
        xAxes.add(createValueAxis());
        return self;
    }

    public T addXAxis(String name) {
        xAxes.add(createValueAxis().setName(name));
        return self;
    }

    public T addXAxis(String[] data) {
        xAxes.add(createCategoryAxis().setData(data));
        return self;
    }

    public T addXAxis(String name, String[] data) {
        xAxes.add(createCategoryAxis().setName(name).setData(data));
        return self;
    }

    public T addXAxis(AxisOption xAxis) {
        xAxes.add(xAxis);
        return self;
    }

    public T addYAxis() {
        yAxes.add(createValueAxis());
        return self;
    }

    public T addYAxis(String name) {
        yAxes.add(createValueAxis().setName(name));
        return self;
    }

    public T addYAxis(String[] data) {
        yAxes.add(createCategoryAxis().setData(data));
        return self;
    }

    public T addYAxis(String name, String[] data) {
        yAxes.add(createCategoryAxis().setName(name).setData(data));
        return self;
    }

    public T addYAxis(AxisOption yAxis) {
        yAxes.add(yAxis);
        return self;
    }

    protected CategoryAxis createCategoryAxis() {
        return new CategoryAxis().setType("category");
    }

    protected ValueAxis createValueAxis() {
        return new ValueAxis().setType("value");
    }

    protected LogAxis createLogAxis() {
        return new LogAxis().setType("log");
    }

    protected TimeAxis createTimeAxis() {
        return new TimeAxis().setType("time");
    }
}
