package org.icepear.echarts;

import java.io.Serializable;

import org.icepear.echarts.charts.funnel.FunnelSeries;

public class Funnel extends Chart<Funnel, FunnelSeries> implements Serializable {

    private static final long serialVersionUID = 1L;

    public Funnel() {
        super(Funnel.class, FunnelSeries.class);
    }

    @Override
    public FunnelSeries createSeries() {
        return new FunnelSeries().setType("funnel");
    }
}
