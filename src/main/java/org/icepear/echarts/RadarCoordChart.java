package org.icepear.echarts;

import org.icepear.echarts.components.coord.radar.RadarAxis;
import org.icepear.echarts.components.coord.radar.RadarIndicator;
import org.icepear.echarts.origin.util.SeriesOption;

public abstract class RadarCoordChart<T extends Chart<?, ?>, E extends SeriesOption> extends Chart<T, E> {
    public RadarCoordChart(final Class<T> clazz, final Class<E> seriesClazz) {
        super(clazz, seriesClazz);
    }

    public T setRadarAxis(RadarIndicator[] indicators) {
        option.setRadar(new RadarAxis().setIndicator(indicators));
        return self;
    }

    public T setRadarAxis(RadarAxis radarAxis) {
        option.setRadar(radarAxis);
        return self;
    }
}
