package org.icepear.echarts;

import org.icepear.echarts.charts.funnel.FunnelSeries;

public class Funnel extends Chart<Funnel, FunnelSeries> {
    public Funnel() {
        super(Funnel.class, FunnelSeries.class);
    }

    @Override
    public FunnelSeries createSeries() {
        return new FunnelSeries().setType("funnel");
    }
}
