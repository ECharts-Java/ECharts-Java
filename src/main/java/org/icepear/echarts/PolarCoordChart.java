package org.icepear.echarts;

import org.icepear.echarts.components.coord.polar.CategoryAngleAxis;
import org.icepear.echarts.components.coord.polar.CategoryRadiusAxis;
import org.icepear.echarts.components.coord.polar.PolarAxis;
import org.icepear.echarts.components.coord.polar.ValueAngleAxis;
import org.icepear.echarts.components.coord.polar.ValueRadiusAxis;
import org.icepear.echarts.origin.coord.polar.AngleAxisOption;
import org.icepear.echarts.origin.coord.polar.RadiusAxisOption;
import org.icepear.echarts.origin.util.SeriesOption;

public abstract class PolarCoordChart<T extends Chart<?, ?>, E extends SeriesOption> extends Chart<T, E> {
    public PolarCoordChart(final Class<T> clazz, final Class<E> seriesClazz) {
        super(clazz, seriesClazz);
        option.setPolar(new PolarAxis());
    }

    public T setPolarAxis() {
        option.setPolar(new PolarAxis());
        return self;
    }

    public T setPolarAxis(String[] radius) {
        option.setPolar(new PolarAxis().setRadius(radius));
        return self;
    }

    public T setPolarAxis(PolarAxis polarAxis) {
        option.setPolar(polarAxis);
        return self;
    }

    public T setAngleAxis() {
        option.setAngleAxis(new CategoryAngleAxis());
        return self;
    }

    public T setAngleAxis(Number max) {
        option.setAngleAxis(new ValueAngleAxis().setMax(max));
        return self;
    }

    public T setAngleAxis(String[] categories) {
        option.setAngleAxis(new CategoryAngleAxis().setData(categories));
        return self;
    }

    public T setAngleAxis(AngleAxisOption angleAxis) {
        option.setAngleAxis(angleAxis);
        return self;
    }

    public T setRadiusAxis() {
        option.setRadiusAxis(new ValueRadiusAxis());
        return self;
    }

    public T setRadiusAxis(Number max) {
        option.setRadiusAxis(new ValueRadiusAxis().setMax(max));
        return self;
    }

    public T setRadiusAxis(String[] categories) {
        option.setRadiusAxis(new CategoryRadiusAxis().setData(categories));
        return self;
    }

    public T setRadiusAxis(RadiusAxisOption radiusAxis) {
        option.setRadiusAxis(radiusAxis);
        return self;
    }
}
