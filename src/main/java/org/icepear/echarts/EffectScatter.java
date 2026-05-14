package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.effectScatter.EffectScatterSeries;

public class EffectScatter extends CartesianCoordChart<EffectScatter, EffectScatterSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public EffectScatter() {
        super(EffectScatter.class, EffectScatterSeries.class);
    }

    @Override
    protected EffectScatterSeries createSeries() {
        return new EffectScatterSeries().setType("effectScatter");
    }
}
