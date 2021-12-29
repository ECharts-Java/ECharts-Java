package org.icepear.echarts;

import org.icepear.echarts.components.coord.polar.DefaultAngleAxis;
import org.icepear.echarts.components.coord.polar.DefaultRadiusAxis;
import org.icepear.echarts.components.coord.polar.PolarAxis;
import org.icepear.echarts.origin.coord.polar.AngleAxisOption;
import org.icepear.echarts.origin.coord.polar.RadiusAxisOption;
import org.icepear.echarts.origin.util.SeriesOption;

public abstract class PolarCoordChart<T extends Chart<?, ?>, E extends SeriesOption> extends Chart<T, E> {
    public PolarCoordChart(final Class<T> clazz, final Class<E> seriesClazz) {
        super(clazz, seriesClazz);
        option.setPolar(new PolarAxis());
    }

    public T setPolarAxis(PolarAxis polarAxis) {
        option.setPolar(polarAxis);
        return self;
    }

    public T setAngleAxis() {
        option.setAngleAxis(new DefaultAngleAxis());
        return self;
    }

    public T setAngleAxis(AngleAxisOption angleAxis) {
        option.setAngleAxis(angleAxis);
        return self;
    }

    public T setRadiusAxis() {
        option.setRadiusAxis(new DefaultRadiusAxis());
        return self;
    }

    public T setRadiusAxis(RadiusAxisOption radiusAxis) {
        option.setRadiusAxis(radiusAxis);
        return self;
    }
}
